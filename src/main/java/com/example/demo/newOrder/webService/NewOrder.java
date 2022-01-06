package com.example.demo.newOrder.webService;

import com.example.demo.delivery.object.NewOrderLongList;
import com.example.demo.delivery.object.ShortOrder;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://impl.webService.newOrder.demo.example.com/")
public interface NewOrder {

    @WebMethod(operationName = "newOrderTransaction_Vx0")
    public ShortOrder newOrderTransaction_Vx0(@WebParam(name = "input") String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, long[] itemIDs, long[] supplierWarehouseIDs, long[] orderQuantities);

    @WebMethod(operationName = "newOrderTransaction_VxA")
    public ShortOrder newOrderTransaction_VxA(@WebParam(name = "input") String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities);

    @WebMethod(operationName = "newOrderTransaction_Vx056")
    public ShortOrder newOrderTransaction_Vx056(@WebParam(name = "input") String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities);

    @WebMethod(operationName = "newOrderTransaction_Vx081")
    public ShortOrder newOrderTransaction_Vx081(@WebParam(name = "input") String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities);

    @WebMethod(operationName = "newOrderTransaction_Vx103")
    public ShortOrder newOrderTransaction_Vx103(@WebParam(name = "input") String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities);

    @WebMethod(operationName = "newOrderTransaction_Vx119")
    public ShortOrder newOrderTransaction_Vx119(@WebParam(name = "input") String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities);

    @WebMethod(operationName = "newOrderTransaction_Vx144")
    public ShortOrder newOrderTransaction_Vx144(@WebParam(name = "input") String w_id, String d_id, String c_id, int o_ol_cnt, int o_all_local, NewOrderLongList itemIDs, NewOrderLongList supplierWarehouseIDs, NewOrderLongList orderQuantities);

}