package com.example.demo.newCustomer.webService;

import com.example.demo.newCustomer.model.NewCustomerInput;
import com.example.demo.newCustomer.model.NewCustomerOutput;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://impl.webService.newCustomer.demo.example.com/")
public interface NewCustomer {

    @WebMethod(operationName = "newCustomer_Vx0")
    public NewCustomerOutput newCustomer_Vx0(@WebParam(name = "cust") NewCustomerInput cust);

    @WebMethod(operationName = "newCustomer_Vx101")
    public NewCustomerOutput newCustomer_Vx101(@WebParam(name = "cust") NewCustomerInput cust);

    @WebMethod(operationName = "newCustomer_Vx138")
    public NewCustomerOutput newCustomer_Vx138(@WebParam(name = "cust") NewCustomerInput cust);

    @WebMethod(operationName = "newCustomer_Vx158")
    public NewCustomerOutput newCustomer_Vx158(@WebParam(name = "cust") NewCustomerInput cust);

    @WebMethod(operationName = "newCustomer_Vx197")
    public NewCustomerOutput newCustomer_Vx197(@WebParam(name = "cust") NewCustomerInput cust);

    @WebMethod(operationName = "newCustomer_VxA")
    public NewCustomerOutput newCustomer_VxA(@WebParam(name = "cust") NewCustomerInput cust);

}