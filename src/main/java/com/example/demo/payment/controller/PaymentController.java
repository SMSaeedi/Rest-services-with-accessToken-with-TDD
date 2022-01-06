package com.example.demo.payment.controller;

import com.example.demo.delivery.object.PaymentResult;
import com.example.demo.payment.model.PaymentModel;
import com.example.demo.payment.webService.Payment;
import com.example.demo.payment.webService.impl.PaymentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private PaymentImpl payment=new PaymentImpl();

    @RequestMapping("paymentTransaction_Vx0")
    public PaymentResult paymentTransaction_Vx0(@RequestBody PaymentModel input) throws Exception {
        return payment.paymentTransaction_Vx0(input);
    }

    @RequestMapping("paymentTransaction_Vx0Test")
    public PaymentResult paymentTransaction_Vx0Test() {
        return payment.paymentTransaction_Vx0Test();
    }

    @RequestMapping("paymentTransaction_Vx033")
    public PaymentResult paymentTransaction_Vx033(@RequestBody PaymentModel input) throws Exception {
        return payment.paymentTransaction_Vx043(input);
    }

    @RequestMapping("paymentTransaction_Vx057")
    public PaymentResult paymentTransaction_Vx057(@RequestBody PaymentModel input) throws Exception {
        return payment.paymentTransaction_Vx057(input);
    }

    @RequestMapping("paymentTransaction_Vx078")
    public PaymentResult paymentTransaction_Vx078(@RequestBody PaymentModel input) throws Exception {
        return payment.paymentTransaction_Vx078(input);
    }

    @RequestMapping("paymentTransaction_VxA")
    public PaymentResult paymentTransaction_VxA(@RequestBody PaymentModel input) throws Exception {
        return payment.paymentTransaction_VxA(input);
    }

    @RequestMapping("paymentTransaction_Vx091")
    public PaymentResult paymentTransaction_Vx091(@RequestBody PaymentModel input) throws Exception {
        return payment.paymentTransaction_Vx091(input);
    }

    @RequestMapping("paymentTransaction_Vx115")
    public PaymentResult paymentTransaction_Vx115(@RequestBody PaymentModel input) throws Exception {
        return payment.paymentTransaction_Vx115(input);
    }

    @RequestMapping("paymentTransaction_Vx212")
    public PaymentResult paymentTransaction_Vx212(@RequestBody PaymentModel input) throws Exception {
        return payment.paymentTransaction_Vx212(input);
    }

    @RequestMapping("paymentTransaction_Vx241")
    public PaymentResult paymentTransaction_Vx241(@RequestBody PaymentModel input) throws Exception {
        return payment.paymentTransaction_Vx241(input);
    }

    @RequestMapping("paymentTransaction_Vx177")
    public PaymentResult paymentTransaction_Vx177(@RequestBody PaymentModel input) throws Exception {
        return payment.paymentTransaction_Vx177(input);
    }

    @RequestMapping("paymentTransaction_Vx136")
    public PaymentResult paymentTransaction_Vx136(@RequestBody PaymentModel input) throws Exception {
        return payment.paymentTransaction_Vx136(input);
    }

    @RequestMapping("paymentTransaction_Vx257")
    public PaymentResult paymentTransaction_Vx257(@RequestBody PaymentModel input) throws Exception {
        return payment.paymentTransaction_Vx257(input);
    }

    @RequestMapping("paymentTransaction_Vx290")
    public PaymentResult paymentTransaction_Vx290(@RequestBody PaymentModel input) throws Exception {
        return payment.paymentTransaction_Vx290(input);
    }

}