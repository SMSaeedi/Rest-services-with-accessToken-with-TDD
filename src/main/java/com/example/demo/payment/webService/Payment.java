package com.example.demo.payment.webService;

import com.example.demo.delivery.object.PaymentResult;
import com.example.demo.payment.model.PaymentModel;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://impl.webService.payment.demo.example.com/")
public interface Payment {

    @WebMethod(operationName = "paymentTransaction_Vx0")
    public PaymentResult paymentTransaction_Vx0(PaymentModel input);

    @WebMethod(operationName = "paymentTransaction_Vx0Test")
    public PaymentResult paymentTransaction_Vx0Test();

    @WebMethod(operationName = "paymentTransaction_VxA")
    public PaymentResult paymentTransaction_VxA(PaymentModel input);

    @WebMethod(operationName = "paymentTransaction_Vx043")
    public PaymentResult paymentTransaction_Vx043(PaymentModel input);

    @WebMethod(operationName = "paymentTransaction_Vx057")
    public PaymentResult paymentTransaction_Vx057(PaymentModel input);

    @WebMethod(operationName = "paymentTransaction_Vx078")
    public PaymentResult paymentTransaction_Vx078(PaymentModel input);

    @WebMethod(operationName = "paymentTransaction_Vx091")
    public PaymentResult paymentTransaction_Vx091(PaymentModel input);

    @WebMethod(operationName = "paymentTransaction_Vx115")
    public PaymentResult paymentTransaction_Vx115(PaymentModel input);

    @WebMethod(operationName = "paymentTransaction_Vx136")
    public PaymentResult paymentTransaction_Vx136(PaymentModel input);

    @WebMethod(operationName = "paymentTransaction_Vx177")
    public PaymentResult paymentTransaction_Vx177(PaymentModel input);

    @WebMethod(operationName = "paymentTransaction_Vx212")
    public PaymentResult paymentTransaction_Vx212(PaymentModel input);

    @WebMethod(operationName = "paymentTransaction_Vx241")
    public PaymentResult paymentTransaction_Vx241(PaymentModel input);

    @WebMethod(operationName = "paymentTransaction_Vx257")
    public PaymentResult paymentTransaction_Vx257(PaymentModel input);

    @WebMethod(operationName = "paymentTransaction_Vx290")
    public PaymentResult paymentTransaction_Vx290(PaymentModel input);

}