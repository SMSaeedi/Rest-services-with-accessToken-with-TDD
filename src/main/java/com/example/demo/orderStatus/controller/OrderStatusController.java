package com.example.demo.orderStatus.controller;

import com.example.demo.delivery.object.Order;
import com.example.demo.orderStatus.webService.impl.OrderStatusImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderStatusController {

    private OrderStatusImpl orderStatus = new OrderStatusImpl();

    @RequestMapping("orderStatusTransaction_Vx0")
    public Order orderStatusTransaction_Vx0(@RequestParam("w_id") String w_id, @RequestParam("d_id") String d_id, @RequestParam("c_id") String c_id, @RequestParam("c_last") String c_last, @RequestParam("c_by_name") boolean c_by_name) throws Exception {
        return orderStatus.orderStatusTransaction_Vx0(w_id, d_id, c_id, c_last, c_by_name);
    }

    @RequestMapping("orderStatusTransaction_VxA")
    public Order orderStatusTransaction_VxA(@RequestParam("w_id") String w_id, @RequestParam("d_id") String d_id, @RequestParam("c_id") String c_id, @RequestParam("c_last") String c_last, @RequestParam("c_by_name") boolean c_by_name) throws Exception {
        return orderStatus.orderStatusTransaction_VxA(w_id, d_id, c_id, c_last, c_by_name);
    }

    @RequestMapping("orderStatusTransaction_Vx046")
    public Order orderStatusTransaction_Vx046(@RequestParam("w_id") String w_id, @RequestParam("d_id") String d_id, @RequestParam("c_id") String c_id, @RequestParam("c_last") String c_last, @RequestParam("c_by_name") boolean c_by_name) throws Exception {
        return orderStatus.orderStatusTransaction_Vx046(w_id, d_id, c_id, c_last, c_by_name);
    }

    @RequestMapping("orderStatusTransaction_Vx066")
    public Order orderStatusTransaction_Vx066(@RequestParam("w_id") String w_id, @RequestParam("d_id") String d_id, @RequestParam("c_id") String c_id, @RequestParam("c_last") String c_last, @RequestParam("c_by_name") boolean c_by_name) throws Exception {
        return orderStatus.orderStatusTransaction_Vx066(w_id, d_id, c_id, c_last, c_by_name);
    }

    @RequestMapping("orderStatusTransaction_Vx096")
    public Order orderStatusTransaction_Vx096(@RequestParam("w_id") String w_id, @RequestParam("d_id") String d_id, @RequestParam("c_id") String c_id, @RequestParam("c_last") String c_last, @RequestParam("c_by_name") boolean c_by_name) throws Exception {
        return orderStatus.orderStatusTransaction_Vx096(w_id, d_id, c_id, c_last, c_by_name);
    }

    @RequestMapping("orderStatusTransaction_Vx122")
    public Order orderStatusTransaction_Vx122(@RequestParam("w_id") String w_id, @RequestParam("d_id") String d_id, @RequestParam("c_id") String c_id, @RequestParam("c_last") String c_last, @RequestParam("c_by_name") boolean c_by_name) throws Exception {
        return orderStatus.orderStatusTransaction_Vx122(w_id, d_id, c_id, c_last, c_by_name);
    }

    @RequestMapping("orderStatusTransaction_Vx143")
    public Order orderStatusTransaction_Vx143(@RequestParam("w_id") String w_id, @RequestParam("d_id") String d_id, @RequestParam("c_id") String c_id, @RequestParam("c_last") String c_last, @RequestParam("c_by_name") boolean c_by_name) throws Exception {
        return orderStatus.orderStatusTransaction_Vx143(w_id, d_id, c_id, c_last, c_by_name);
    }
}