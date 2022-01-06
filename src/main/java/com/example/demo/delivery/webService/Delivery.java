package com.example.demo.delivery.webService;

import com.example.demo.delivery.object.DeliveryResult;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://impl.webService.delivery.demo.example.com/")
public interface Delivery {

    @WebMethod(operationName = "deliveryTransaction_Vx0")
    public DeliveryResult deliveryTransaction_Vx0(
            @WebParam(name = "w_id") String w_id, @WebParam(name = "o_carrier_id") String o_carrier_id) throws Exception;

    @WebMethod(operationName = "deliveryTransaction_VxA")
    public DeliveryResult deliveryTransaction_VxA(
            @WebParam(name = "input") DeliveryResult input) throws Exception;

    @WebMethod(operationName = "deliveryTransaction_Vx051")
    public DeliveryResult deliveryTransaction_Vx051(
            @WebParam(name = "input") DeliveryResult input) throws Exception;

    @WebMethod(operationName = "deliveryTransaction_Vx075")
    public DeliveryResult deliveryTransaction_Vx075(
            @WebParam(name = "input") DeliveryResult input) throws Exception;

    @WebMethod(operationName = "deliveryTransaction_Vx099")
    public DeliveryResult deliveryTransaction_Vx099(
            @WebParam(name = "input") DeliveryResult input) throws Exception;

    @WebMethod(operationName = "deliveryTransaction_Vx123")
    public DeliveryResult deliveryTransaction_Vx123(
            @WebParam(name = "input") DeliveryResult input) throws Exception;

    @WebMethod(operationName = "deliveryTransaction_Vx138")
    public DeliveryResult deliveryTransaction_Vx138(
            @WebParam(name = "input") DeliveryResult input) throws Exception;

    @WebMethod(operationName = "deliveryTransaction_Vx154")
    public DeliveryResult deliveryTransaction_Vx154(
            @WebParam(name = "input") DeliveryResult input) throws Exception;

    @WebMethod(operationName = "deliveryTransaction_Vx176")
    public DeliveryResult deliveryTransaction_Vx176(
            @WebParam(name = "input") DeliveryResult input) throws Exception;

}