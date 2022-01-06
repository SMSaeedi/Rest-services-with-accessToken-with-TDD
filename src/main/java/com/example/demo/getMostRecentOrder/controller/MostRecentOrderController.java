package com.example.demo.getMostRecentOrder.controller;

import com.example.demo.getMostRecentOrder.model.GetMostRecentOrder_Vx0;
import com.example.demo.getMostRecentOrder.model.Order;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.WebParam;

@RestController
public class MostRecentOrderController {

    @RequestMapping("getMostRecentOrder_Vx0")
    public Order getMostRecentOrder_Vx0(@RequestParam(name = "c_uname") String c_uname) {
        return new GetMostRecentOrder_Vx0().getMostRecentOrder(c_uname);
    }

    @RequestMapping("getMostRecentOrder_Vx0Test")
    public Order getMostRecentOrder_Vx0Test(@RequestBody String c_uname) {
        return new GetMostRecentOrder_Vx0().getMostRecentOrderTest(c_uname);
    }

    @RequestMapping("getMostRecentOrder_VxA")
    public Order getMostRecentOrder_VxA(@RequestParam(name = "c_uname") String c_uname) {
        return new GetMostRecentOrder_Vx0().getMostRecentOrder(c_uname);
    }
}