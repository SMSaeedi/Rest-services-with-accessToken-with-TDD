package com.example.demo.delivery.webService.impl;

import com.example.demo.delivery.model.*;
import com.example.demo.delivery.object.DeliveryResult;
import com.example.demo.delivery.webService.Delivery;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(serviceName = "Delivery")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class DeliveryImpl implements Delivery {

    @Override
    public DeliveryResult deliveryTransaction_Vx0(String w_id,String o_carrier_id) {
        return new Delivery_Vx0().deliveryTransactionTest(w_id, o_carrier_id);
    }

    @Override
    public DeliveryResult deliveryTransaction_VxA(DeliveryResult input) {
        return new Delivery_VxA().deliveryTransaction(input.getW_id(), input.getO_carrier_id());
    }

    @Override
    public DeliveryResult deliveryTransaction_Vx051(DeliveryResult input) {
        return new Delivery_Vx051().deliveryTransaction(input.getW_id(), input.getO_carrier_id());
    }

    @Override
    public DeliveryResult deliveryTransaction_Vx075(DeliveryResult input) {
        return new Delivery_Vx075().deliveryTransaction(input.getW_id(), input.getO_carrier_id());
    }

    @Override
    public DeliveryResult deliveryTransaction_Vx099(DeliveryResult input) {
        return new Delivery_Vx099().deliveryTransaction(input.getW_id(), input.getO_carrier_id());
    }

    @Override
    public DeliveryResult deliveryTransaction_Vx123(DeliveryResult input) {
        return new Delivery_Vx123().deliveryTransaction(input.getW_id(), input.getO_carrier_id());
    }

    @Override
    public DeliveryResult deliveryTransaction_Vx138(DeliveryResult input) {
        return new Delivery_Vx138().deliveryTransaction(input.getW_id(), input.getO_carrier_id());
    }

    @Override
    public DeliveryResult deliveryTransaction_Vx154(DeliveryResult input) {
        return new Delivery_Vx154().deliveryTransaction(input.getW_id(), input.getO_carrier_id());
    }

    @Override
    public DeliveryResult deliveryTransaction_Vx176(DeliveryResult input) {
        return new Delivery_Vx176().deliveryTransaction(input.getW_id(), input.getO_carrier_id());
    }
}