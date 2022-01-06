package com.example.demo.newCustomer.webService.impl;

import com.example.demo.newCustomer.model.*;
import com.example.demo.newCustomer.webService.NewCustomer;
import com.example.demo.tokenConfig.Authentication;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;
import java.util.Map;

@WebService(serviceName = "NewCustomer")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class NewCustomerImpl implements NewCustomer {

    @Override
    public NewCustomerOutput newCustomer_Vx0(NewCustomerInput cust) {
            return new NewCustomer_Vx0().test(cust);
    }

    @Override
    public NewCustomerOutput newCustomer_VxA(NewCustomerInput cust) {
            return new NewCustomer_VxA().process(cust);
    }

    @Override
    public NewCustomerOutput newCustomer_Vx101(NewCustomerInput cust) {
            return new NewCustomer_Vx101().process(cust);
    }

    @Override
    public NewCustomerOutput newCustomer_Vx138(NewCustomerInput cust) {
            return new NewCustomer_Vx138().process(cust);
    }

    @Override
    public NewCustomerOutput newCustomer_Vx158(NewCustomerInput cust) {
            return new NewCustomer_Vx158().process(cust);
    }

    @Override
    public NewCustomerOutput newCustomer_Vx197(NewCustomerInput cust) {
            return new NewCustomer_Vx197().process(cust);
    }

}