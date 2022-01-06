package com.example.demo.orderStatus.webService;

import com.example.demo.delivery.object.Order;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://impl.webService.orderStatus.demo.example.com/")
public interface OrderStatus {

    @WebMethod(operationName = "orderStatusTransaction_Vx0")
    public Order orderStatusTransaction_Vx0(
            @WebParam(name = "input") String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception;

    @WebMethod(operationName = "orderStatusTransaction_VxA")
    public Order orderStatusTransaction_VxA(
            @WebParam(name = "input") String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception;

    @WebMethod(operationName = "orderStatusTransaction_Vx046")
    public Order orderStatusTransaction_Vx046(
            @WebParam(name = "input") String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception;

    @WebMethod(operationName = "orderStatusTransaction_Vx066")
    public Order orderStatusTransaction_Vx066(
            @WebParam(name = "input") String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception;

    @WebMethod(operationName = "orderStatusTransaction_Vx096")
    public Order orderStatusTransaction_Vx096(
            @WebParam(name = "input") String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception;

    @WebMethod(operationName = "orderStatusTransaction_Vx122")
    public Order orderStatusTransaction_Vx122(
            @WebParam(name = "input") String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception;

    @WebMethod(operationName = "orderStatusTransaction_Vx143")
    public Order orderStatusTransaction_Vx143(
            @WebParam(name = "input") String w_id, String d_id, String c_id, String c_last, boolean c_by_name) throws Exception;
}