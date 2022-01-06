package com.example.demo.getCustomer.webService.impl;

import com.example.demo.getCustomer.model.GetCustomer_Vx0;
import com.example.demo.getCustomer.model.GetCustomer_VxA;
import com.example.demo.getCustomer.webService.GetCustomer;
import com.example.demo.newCustomer.model.Customer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(serviceName = "GetCustomer")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class GetCustomerImpl implements GetCustomer {

    @Override
    public Customer getCustomer_Vx0(String UNAME) {
        return new GetCustomer_Vx0().getCustomer(UNAME);
    }

    @Override
    public Customer getCustomer_Vx0Test(Customer uname) {
        return new GetCustomer_Vx0().getCustomerTest(uname);
    }

    @Override
    public Customer getCustomer_VxA(String UNAME) {
        return new GetCustomer_VxA().getCustomer(UNAME);
    }
}