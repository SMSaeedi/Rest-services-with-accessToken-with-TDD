package com.example.demo.newOrder.webService.impl;

import com.example.demo.delivery.object.NewOrderLongList;
import com.example.demo.delivery.object.ShortOrder;
import com.example.demo.newOrder.model.*;
import com.example.demo.newOrder.webService.NewOrder;
import com.example.demo.tokenConfig.Authentication;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;
import java.util.Map;

@WebService(serviceName = "NewOrder")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class NewOrderImpl implements NewOrder {

    @Override
    public ShortOrder newOrderTransaction_Vx0(String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, long[] itemIDs, long[] supplierWarehouseIDs, long[] orderQuantities) {
            return new NewOrder_Vx0().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs, supplierWarehouseIDs, orderQuantities);
    }

    @Override
    public ShortOrder newOrderTransaction_VxA(String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities) {
            return new NewOrder_VxA().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @Override
    public ShortOrder newOrderTransaction_Vx056(String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities) {
            return new NewOrder_Vx056().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @Override
    public ShortOrder newOrderTransaction_Vx081(String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities) {
            return new NewOrder_Vx081().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @Override
    public ShortOrder newOrderTransaction_Vx103(String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities) {
            return new NewOrder_Vx103().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @Override
    public ShortOrder newOrderTransaction_Vx119(String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities) {
            return new NewOrder_Vx119().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

    @Override
    public ShortOrder newOrderTransaction_Vx144(String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities) {
            return new NewOrder_Vx144().newOrderTransaction(w_id, d_id, c_id, o_ol_cnt, o_all_local, itemIDs.longList, supplierWarehouseIDs.longList, orderQuantities.longList);
    }

}