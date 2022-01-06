package com.example.demo.createNewCustomer.controller;

import com.example.demo.createNewCustomer.model.CreateNewCustomer_Vx0;
import com.example.demo.createNewCustomer.model.CreateNewCustomer_VxA;
import com.example.demo.newCustomer.model.Customer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.WebParam;
import java.util.List;

@RestController
public class CreateNewCustomerController {

    @RequestMapping("createNewCustomer_Vx0")
    public Customer createNewCustomer_Vx0(Customer cust) {
        return new CreateNewCustomer_Vx0().createNewCustomerTest(cust);
    }

    @RequestMapping("createNewCustomer_VxA")
    public Customer createNewCustomer_VxA(@RequestBody Customer cust) {
        return new CreateNewCustomer_VxA().createNewCustomer(cust);
    }

    @RequestMapping("createNewCustomer_Vx078")
    public Customer createNewCustomer_Vx078(@RequestBody Customer cust) {
        return new CreateNewCustomer_VxA().createNewCustomer(cust);
    }

    @RequestMapping("createNewCustomer_Vx103")
    public Customer createNewCustomer_Vx103(@RequestBody Customer cust) {
        return new CreateNewCustomer_VxA().createNewCustomer(cust);
    }

    @RequestMapping("createNewCustomer_Vx113")
    public Customer createNewCustomer_Vx113(@RequestBody Customer cust) {
        return new CreateNewCustomer_VxA().createNewCustomer(cust);
    }

    @RequestMapping("createNewCustomer_Vx132")
    public Customer createNewCustomer_Vx132(@RequestBody Customer cust) {
        return new CreateNewCustomer_VxA().createNewCustomer(cust);
    }
}