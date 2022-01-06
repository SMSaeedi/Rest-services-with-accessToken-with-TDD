package com.example.demo.getNewProducts.webService;

import com.example.demo.getNewProducts.model.ShortBook;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService(targetNamespace = "http://impl.webService.getNewProducts.demo.example.com/")
public interface GetNewProduct {

    @WebMethod(operationName = "getNewProducts_Vx0")
    public List<ShortBook> getNewProducts_Vx0(@WebParam(name = "input") String subject);

    @WebMethod(operationName = "getNewProducts_Vx0Test")
    public List<ShortBook> getNewProducts_Vx0Test(@WebParam(name = "input") String subject);

    @WebMethod(operationName = "getNewProducts_VxA")
    public List<ShortBook> getNewProducts_VxA(@WebParam(name = "input") String subject);

}