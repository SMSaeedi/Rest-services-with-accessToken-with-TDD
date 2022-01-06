package com.example.demo.newCustomer.controller;

import com.example.demo.newCustomer.model.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.jws.WebParam;

@RestController
public class NewCustomerController {

    @RequestMapping("newCustomer_Vx0")
    public NewCustomerOutput newCustomer_Vx0(@RequestBody NewCustomerInput input) throws Exception {
        return new NewCustomer_Vx0().process(input);
    }

    @RequestMapping("newCustomer_Vx0Test")
    public NewCustomerOutput newCustomer_Vx0Test(@RequestBody NewCustomerInput input) throws Exception {
        return new NewCustomer_Vx0().test(input);
    }

    @RequestMapping("newCustomer_VxA")
    public NewCustomerOutput newCustomer_VxA(@RequestBody NewCustomerInput input) throws Exception {
        return new NewCustomer_VxA().process(input);
    }

    @RequestMapping("newCustomer_Vx101")
    public NewCustomerOutput newCustomer_Vx101(@RequestBody NewCustomerInput input) throws Exception {
        return new NewCustomer_Vx101().process(input);
    }

    @RequestMapping("newCustomer_Vx138")
    public NewCustomerOutput newCustomer_Vx138(@RequestBody NewCustomerInput input) throws Exception {
        return new NewCustomer_Vx138().process(input);
    }

    @RequestMapping("newCustomer_Vx158")
    public NewCustomerOutput newCustomer_Vx158(@RequestBody NewCustomerInput input) throws Exception {
        return new NewCustomer_Vx158().process(input);
    }

    @RequestMapping("newCustomer_Vx197")
    public NewCustomerOutput newCustomer_Vx197(@RequestBody NewCustomerInput input) throws Exception {
        return new NewCustomer_Vx197().process(input);
    }
}