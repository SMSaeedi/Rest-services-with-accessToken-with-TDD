package com.example.demo.getUserName.webService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://impl.webService.getUserName.demo.example.com/")
public interface GetUserName {

    @WebMethod(operationName = "getUserName_Vx0")
    public String getUserName_Vx0(@WebParam(name = "C_ID") int C_ID);

    @WebMethod(operationName = "getUserName_Vx0")
    public String getUserName_Vx0Test(@WebParam(name = "C_ID") String C_ID);

    @WebMethod(operationName = "getUserName_VxA")
    public String getUserName_VxA(@WebParam(name = "C_ID") int C_ID);

}