package com.example.demo.delivery.controller;

import com.example.demo.delivery.model.*;
import com.example.demo.delivery.object.DeliveryResult;
import com.example.demo.delivery.webService.impl.DeliveryImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {

    private DeliveryImpl delivery = new DeliveryImpl();

    @RequestMapping("deliveryTransaction_Vx0")
    public DeliveryResult deliveryTransaction_Vx0(@RequestBody DeliveryResult input) throws Exception {
        return delivery.deliveryTransaction_Vx0(input.getW_id(), input.getO_carrier_id());
    }

    @RequestMapping("deliveryTransaction_VxA")
    public DeliveryResult deliveryTransaction_VxA(@RequestParam(name = "w_id") String w_id,
                                                  @RequestParam(name = "o_carrier_id") String o_carrier_id) {
        return new Delivery_VxA().deliveryTransaction(w_id, o_carrier_id);
    }

    @RequestMapping("deliveryTransaction_Vx051")
    public DeliveryResult deliveryTransaction_Vx051(@RequestParam(name = "w_id") String w_id,
                                                    @RequestParam(name = "o_carrier_id") String o_carrier_id) {
        return new Delivery_Vx051().deliveryTransaction(w_id, o_carrier_id);
    }

    @RequestMapping("deliveryTransaction_Vx075")
    public DeliveryResult deliveryTransaction_Vx075(@RequestParam(name = "w_id") String w_id,
                                                    @RequestParam(name = "o_carrier_id") String o_carrier_id) {
        return new Delivery_Vx075().deliveryTransaction(w_id, o_carrier_id);
    }

    @RequestMapping("deliveryTransaction_Vx099")
    public DeliveryResult deliveryTransaction_Vx099(@RequestParam(name = "w_id") String w_id,
                                                    @RequestParam(name = "o_carrier_id") String o_carrier_id) {
        return new Delivery_Vx099().deliveryTransaction(w_id, o_carrier_id);
    }

    @RequestMapping("deliveryTransaction_Vx123")
    public DeliveryResult deliveryTransaction_Vx123(@RequestParam(name = "w_id") String w_id,
                                                    @RequestParam(name = "o_carrier_id") String o_carrier_id) {
        return new Delivery_Vx123().deliveryTransaction(w_id, o_carrier_id);
    }

    @RequestMapping("deliveryTransaction_Vx138")
    public DeliveryResult deliveryTransaction_Vx138(@RequestParam(name = "w_id") String w_id,
                                                    @RequestParam(name = "o_carrier_id") String o_carrier_id) {
        return new Delivery_Vx138().deliveryTransaction(w_id, o_carrier_id);
    }

    @RequestMapping("deliveryTransaction_Vx154")
    public DeliveryResult deliveryTransaction_Vx154(@RequestParam(name = "w_id") String w_id,
                                                    @RequestParam(name = "o_carrier_id") String o_carrier_id) {
        return new Delivery_Vx154().deliveryTransaction(w_id, o_carrier_id);
    }

    @RequestMapping("deliveryTransaction_Vx176")
    public DeliveryResult deliveryTransaction_Vx176(@RequestParam(name = "w_id") String w_id,
                                                    @RequestParam(name = "o_carrier_id") String o_carrier_id) {
        return new Delivery_Vx176().deliveryTransaction(w_id, o_carrier_id);
    }

}