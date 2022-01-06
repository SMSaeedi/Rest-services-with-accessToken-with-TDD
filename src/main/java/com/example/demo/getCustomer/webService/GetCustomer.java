package com.example.demo.getCustomer.webService;

import com.example.demo.newCustomer.model.Customer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://impl.webService.getCustomer.demo.example.com/")
public interface GetCustomer {

    @WebMethod(operationName = "getCustomer_Vx0")
    public Customer getCustomer_Vx0(@WebParam(name = "UNAME") String UNAME);

    @WebMethod(operationName = "getCustomer_Vx0Test")
    public Customer getCustomer_Vx0Test(@WebParam(name = "UNAME") Customer UNAME);

    @WebMethod(operationName = "getCustomer_VxA")
    public Customer getCustomer_VxA(@WebParam(name = "UNAME") String UNAME);

}