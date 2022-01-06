package com.example.demo.getCustomer.controller;

import com.example.demo.getCustomer.model.GetCustomer_Vx0;
import com.example.demo.getCustomer.model.GetCustomer_VxA;
import com.example.demo.newCustomer.model.Customer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.WebParam;

@RestController
public class GetCustomerController {

    @RequestMapping("getCustomer_Vx0")
    public Customer getCustomer_Vx0(@RequestParam(name = "c_uname") String c_uname) {
        return new GetCustomer_Vx0().getCustomer(c_uname);
    }

    @RequestMapping("getCustomer_Vx0Test")
    public Customer getCustomer_Vx0Test(@RequestBody Customer c_uname) {
        return new GetCustomer_Vx0().getCustomerTest(c_uname);
    }

    @RequestMapping("getCustomer_VxA")
    public Customer getCustomer_VxA(@RequestParam(name = "c_uname") String c_uname) {
        return new GetCustomer_VxA().getCustomer(c_uname);
    }
}