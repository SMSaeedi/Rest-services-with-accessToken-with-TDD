package com.example.demo.changePaymentMethod.webService;

import com.example.demo.changePaymentMethod.model.ChangePaymentMethodInput;
import com.example.demo.changePaymentMethod.model.ChangePaymentMethodOutput;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://impl.webService.changePayment.demo.example.com/")
public interface ChangePayment {

    @WebMethod(operationName = "changePaymentMethod_VxA")
    public ChangePaymentMethodOutput changePaymentMethod_VxA(
            @WebParam(name = "input") ChangePaymentMethodInput input) throws Exception;

    @WebMethod(operationName = "changePaymentMethod_test")
    public ChangePaymentMethodOutput changePaymentMethod_test(
            @WebParam(name = "input") ChangePaymentMethodInput input) throws Exception;

    @WebMethod(operationName = "changePaymentMethod_Vx0")
    public ChangePaymentMethodOutput changePaymentMethod_Vx0(
            @WebParam(name = "input") ChangePaymentMethodInput input) throws Exception ;

}