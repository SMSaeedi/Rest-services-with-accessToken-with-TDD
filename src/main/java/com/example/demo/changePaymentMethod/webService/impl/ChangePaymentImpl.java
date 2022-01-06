package com.example.demo.changePaymentMethod.webService.impl;

import com.example.demo.changePaymentMethod.model.ChangePaymentMethodInput;
import com.example.demo.changePaymentMethod.model.ChangePaymentMethodOutput;
import com.example.demo.changePaymentMethod.model.ChangePaymentMethod_Vx0;
import com.example.demo.changePaymentMethod.model.ChangePaymentMethod_VxA;
import com.example.demo.changePaymentMethod.webService.ChangePayment;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(serviceName = "ChangePayment")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class ChangePaymentImpl implements ChangePayment {

    @Override
    public ChangePaymentMethodOutput changePaymentMethod_Vx0(ChangePaymentMethodInput input) throws Exception {
        return new ChangePaymentMethod_Vx0().process(input);
    }

    @Override
    public ChangePaymentMethodOutput changePaymentMethod_VxA(ChangePaymentMethodInput input) throws Exception {
        return new ChangePaymentMethod_VxA().process(input);
    }

    @Override
    public ChangePaymentMethodOutput changePaymentMethod_test(ChangePaymentMethodInput input) throws Exception {
        return new ChangePaymentMethod_VxA().hardCodeData(input);
    }
}