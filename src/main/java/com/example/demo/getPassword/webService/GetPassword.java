package com.example.demo.getPassword.webService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://impl.webService.getPassword.demo.example.com/")
public interface GetPassword {

    @WebMethod(operationName = "getPassword_Vx0")
    public String getPassword_Vx0(@WebParam(name = "C_UNAME") String C_UNAME);

    @WebMethod(operationName = "getPassword_Vx0Test")
    public String getPassword_Vx0Test(@WebParam(name = "C_UNAME") String C_UNAME);

    @WebMethod(operationName = "getPassword_VxA")
    public String getPassword_VxA(@WebParam(name = "C_UNAME") String C_UNAME);

}