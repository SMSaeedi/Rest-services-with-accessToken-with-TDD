package com.example.demo.orderStatus.webService.impl;

import com.example.demo.delivery.object.Order;
import com.example.demo.orderStatus.model.*;
import com.example.demo.orderStatus.webService.OrderStatus;
import com.example.demo.tokenConfig.Authentication;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.SOAPBinding;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@WebService(serviceName = "OrderStatus")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class OrderStatusImpl implements OrderStatus {

    @Override
    public Order orderStatusTransaction_Vx0(String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws SQLException {
            return new OrderStatus_Vx066().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

    @Override
    public Order orderStatusTransaction_VxA(String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws SQLException {
        return new OrderStatus_Vx096().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

    @Override
    public Order orderStatusTransaction_Vx046(String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception {
        return new OrderStatus_Vx046().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

    @Override
    public Order orderStatusTransaction_Vx066(String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception {
        return new OrderStatus_Vx066().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

    @Override
    public Order orderStatusTransaction_Vx096(String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception {
        return new OrderStatus_Vx096().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

 @Override
    public Order orderStatusTransaction_Vx122(String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception {
        return new OrderStatus_Vx122().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

    @Override
    public Order orderStatusTransaction_Vx143(String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception {
        return new OrderStatus_Vx143().orderStatusTransaction(w_id, d_id, c_id, c_last, c_by_name);
    }

}