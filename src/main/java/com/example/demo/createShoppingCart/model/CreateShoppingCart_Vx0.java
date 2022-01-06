package com.example.demo.createShoppingCart.model;

import com.example.demo.dataBaseConfig.Database;
import com.example.demo.newCustomer.model.TPCWUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class CreateShoppingCart_Vx0 {

    public Cart createShoppingCart(Integer I_ID, List<String> ids, List<String> quantities, Integer SHOPPING_ID) {
        int newCartID = (SHOPPING_ID != null) ? SHOPPING_ID : createEmptyCart();
        return doCart(newCartID, I_ID, ids, quantities);
    }

    private int createEmptyCart() {
        int SHOPPING_ID = 0;
        Connection con = Database.pickConnection();
        try {
            PreparedStatement get_next_id = con.prepareStatement("SELECT COUNT(*) FROM tpcw_shopping_cart");
            synchronized (Cart.class) {
                ResultSet rs = get_next_id.executeQuery();
                rs.next();
                SHOPPING_ID = rs.getInt(1);
                rs.close();
                PreparedStatement insert_cart = con.prepareStatement("INSERT into tpcw_shopping_cart (sc_id, sc_time) " +
                        "VALUES ((SELECT COUNT(*) FROM tpcw_shopping_cart)," +
                        "sysdate)");
                insert_cart.executeUpdate();
                get_next_id.close();
                con.commit();
            }
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        } finally {
            Database.relaseConnection(con);
        }
        return SHOPPING_ID;
    }

    private Cart doCart(int SHOPPING_ID, Integer I_ID, List<String> ids, List<String> quantities) {
        Cart card = new Cart();
        card.SC_SUB_TOTAL = quantities.size();
        card.lines1 = ids;
        card.SC_SHIP_COST = 15000L;
        return card;

        /*Cart cart = null;
        Connection con = Database.pickConnection();
        try {
            if (I_ID != null) {
                addItem(con, SHOPPING_ID, I_ID.intValue());
            }
            refreshCart(con, SHOPPING_ID, ids, quantities);
            addRandomItemToCartIfNecessary(con, SHOPPING_ID);
            resetCartTime(con, SHOPPING_ID);
            cart = getCart(con, SHOPPING_ID, 0.0);
            con.commit();
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        } finally {
            Database.relaseConnection(con);
        }
        return cart;*/
    }

    private void addItem(Connection con, int SHOPPING_ID, int I_ID) {
        try {
            PreparedStatement find_entry = con.prepareStatement("SELECT scl_qty FROM tpcw_shopping_cart_line WHERE scl_sc_id = ? AND scl_i_id = ?");
            find_entry.setInt(1, SHOPPING_ID);
            find_entry.setInt(2, I_ID);
            ResultSet rs = find_entry.executeQuery();
            if (rs.next()) {
                int currqty = rs.getInt("scl_qty");
                currqty += 1;
                PreparedStatement update_qty = con.prepareStatement("UPDATE tpcw_shopping_cart_line SET scl_qty = ? WHERE scl_sc_id = ? AND scl_i_id = ?");
                update_qty.setInt(1, currqty);
                update_qty.setInt(2, SHOPPING_ID);
                update_qty.setInt(3, I_ID);
                update_qty.executeUpdate();
                update_qty.close();
            } else {
                PreparedStatement put_line = con.prepareStatement("INSERT into tpcw_shopping_cart_line (scl_sc_id, scl_qty, scl_i_id) VALUES (?,?,?)");
                put_line.setInt(1, SHOPPING_ID);
                put_line.setInt(2, 1);
                put_line.setInt(3, I_ID);
                put_line.executeUpdate();
                put_line.close();
            }
            rs.close();
            find_entry.close();
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        }
    }

    private void refreshCart(Connection con, int SHOPPING_ID, List<String> ids, List<String> quantities) {
        int i;
        try {
            for (i = 0; i < ids.size(); i++) {
                String I_IDstr = ids.get(i);
                String QTYstr = quantities.get(i);
                int I_ID = Integer.parseInt(I_IDstr);
                int QTY = Integer.parseInt(QTYstr);
                if (QTY == 0) {
                    PreparedStatement statement = con.prepareStatement("DELETE FROM tpcw_shopping_cart_line WHERE scl_sc_id = ? AND scl_i_id = ?");
                    statement.setInt(1, SHOPPING_ID);
                    statement.setInt(2, I_ID);
                    statement.executeUpdate();
                    statement.close();
                } else {
                    PreparedStatement statement = con.prepareStatement("UPDATE tpcw_shopping_cart_line SET scl_qty = ? WHERE scl_sc_id = ? AND scl_i_id = ?");
                    statement.setInt(1, QTY);
                    statement.setInt(2, SHOPPING_ID);
                    statement.setInt(3, I_ID);
                    statement.executeUpdate();
                    statement.close();
                }
            }
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        }
    }

    private void addRandomItemToCartIfNecessary(Connection con, int SHOPPING_ID) {
        int related_item = 0;
        try {
            PreparedStatement get_cart = con.prepareStatement("SELECT COUNT(*) from tpcw_shopping_cart_line where scl_sc_id = ?");
            get_cart.setInt(1, SHOPPING_ID);
            ResultSet rs = get_cart.executeQuery();
            rs.next();
            if (rs.getInt(1) == 0) {
                int rand_id = TPCWUtil.getRandomI_ID();
                related_item = getRelated1(rand_id, con);
                addItem(con, SHOPPING_ID, related_item);
            }
            rs.close();
            get_cart.close();
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        }
    }

    private int getRelated1(int I_ID, Connection con) {
        int related1 = -1;
        try {
            PreparedStatement statement = con.prepareStatement("SELECT i_related1 FROM tpcw_item where i_id = ?");
            statement.setInt(1, I_ID);
            ResultSet rs = statement.executeQuery();
            rs.next();
            related1 = rs.getInt(1);
            rs.close();
            statement.close();
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        }
        return related1;
    }

    private void resetCartTime(Connection con, int SHOPPING_ID) {
        try {
            PreparedStatement statement = con.prepareStatement("UPDATE tpcw_shopping_cart SET sc_time = sysdate WHERE sc_id = ?");
            statement.setInt(1, SHOPPING_ID);
            statement.executeUpdate();
            statement.close();
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        }
    }

    private Cart getCart(Connection con, int SHOPPING_ID, double c_discount) {
        Cart mycart = null;
        try {
            PreparedStatement get_cart = con.prepareStatement("SELECT * " +
                    "FROM tpcw_shopping_cart_line, tpcw_item " +
                    "WHERE scl_i_id = tpcw_item.i_id AND scl_sc_id = ?");
            get_cart.setInt(1, SHOPPING_ID);
            ResultSet rs = get_cart.executeQuery();
            mycart = new Cart(rs, c_discount);
            rs.close();
            get_cart.close();
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        }
        return mycart;
    }
}