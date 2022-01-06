package com.example.demo.getMostRecentOrder.webService;

import com.example.demo.getMostRecentOrder.model.Order;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://impl.webService.getMostRecentOrder.demo.example.com/")
public interface MostRecentOrder {

    @WebMethod(operationName = "getMostRecentOrder_Vx0")
    public Order getMostRecentOrder_Vx0(@WebParam(name = "c_uname") String c_uname);

    @WebMethod(operationName = "getMostRecentOrder_Vx0Test")
    public Order getMostRecentOrder_Vx0Test(@WebParam(name = "c_uname") String c_uname);

    @WebMethod(operationName = "getMostRecentOrder_VxA")
    public Order getMostRecentOrder_VxA(@WebParam(name = "c_uname") String c_uname);

}