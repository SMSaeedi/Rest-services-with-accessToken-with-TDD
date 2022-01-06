package com.example.demo.createNewCustomer.webService.impl;

import com.example.demo.createNewCustomer.model.*;
import com.example.demo.createNewCustomer.webService.CreateNewCustomer;
import com.example.demo.newCustomer.model.Customer;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;

@WebService(serviceName = "CreateNewCustomer")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class CreateNewCustomerImpl implements CreateNewCustomer {

    public Customer createNewCustomer_Vx0(Customer cust) {
        return new CreateNewCustomer_Vx0().createNewCustomerTest(cust);
    }

    public Customer createNewCustomer_VxA(Customer cust) {
        return new CreateNewCustomer_VxA().createNewCustomer(cust);
    }

    public Customer createNewCustomer_Vx078(Customer cust) {
        return new CreateNewCustomer_Vx078().createNewCustomer(cust);
    }

    public Customer createNewCustomer_Vx103(Customer cust) {
        return new CreateNewCustomer_Vx103().createNewCustomer(cust);
    }

    public Customer createNewCustomer_Vx113(Customer cust) {
        return new CreateNewCustomer_Vx113().createNewCustomer(cust);
    }

    public Customer createNewCustomer_Vx132(Customer cust) {
        return new CreateNewCustomer_Vx132().createNewCustomer(cust);
    }
}