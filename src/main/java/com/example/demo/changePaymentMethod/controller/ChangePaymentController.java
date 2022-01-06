package com.example.demo.changePaymentMethod.controller;

import com.example.demo.changePaymentMethod.model.ChangePaymentMethodInput;
import com.example.demo.changePaymentMethod.model.ChangePaymentMethodOutput;
import com.example.demo.changePaymentMethod.model.ChangePaymentMethod_Vx0;
import com.example.demo.changePaymentMethod.model.ChangePaymentMethod_VxA;
import com.example.demo.changePaymentMethod.webService.impl.ChangePaymentImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChangePaymentController {

    private ChangePaymentImpl changePayment = new ChangePaymentImpl();

    @RequestMapping("changePaymentMethod_Vx0")
    public ChangePaymentMethodOutput changePaymentMethod_Vx0(@RequestBody ChangePaymentMethodInput input) throws Exception {
        return new ChangePaymentMethod_Vx0().process(input);
    }

    @RequestMapping("changePaymentMethod_test")
    public ChangePaymentMethodOutput changePaymentMethod_test(@RequestBody ChangePaymentMethodInput input) throws Exception {
        return changePayment.changePaymentMethod_test(input);
    }

    @RequestMapping("changePaymentMethod_VxA")
    public ChangePaymentMethodOutput changePaymentMethod_VxA(@RequestBody ChangePaymentMethodInput input) throws Exception {
        return new ChangePaymentMethod_VxA().process(input);
    }

}