package com.example.demo.createNewCustomer.webService;

import com.example.demo.newCustomer.model.Customer;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService(targetNamespace = "http://impl.webService.createNewCustomer.demo.example.com/")
public interface CreateNewCustomer {

    @WebMethod(operationName = "createNewCustomer_Vx0")
    public Customer createNewCustomer_Vx0(Customer cust);

    @WebMethod(operationName = "createNewCustomer_VxA")
    public Customer createNewCustomer_VxA(@WebParam(name = "cust") Customer cust);

    @WebMethod(operationName = "createNewCustomer_Vx078")
    public Customer createNewCustomer_Vx078(@WebParam(name = "cust") Customer cust);

    @WebMethod(operationName = "createNewCustomer_Vx103")
    public Customer createNewCustomer_Vx103(@WebParam(name = "cust") Customer cust);

    @WebMethod(operationName = "createNewCustomer_Vx113")
    public Customer createNewCustomer_Vx113(@WebParam(name = "cust") Customer cust);

    @WebMethod(operationName = "createNewCustomer_Vx132")
    public Customer createNewCustomer_Vx132(@WebParam(name = "cust") Customer cust);

}