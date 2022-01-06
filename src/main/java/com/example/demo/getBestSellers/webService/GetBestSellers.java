package com.example.demo.getBestSellers.webService;

import com.example.demo.newProducts.model.ShortBook;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService(targetNamespace = "http://impl.webService.getBestSellers.demo.example.com/")
public interface GetBestSellers {

    @WebMethod(operationName = "getBestSellers_Vx0")
    public List<ShortBook> getBestSellers_Vx0(@WebParam(name = "subject") String subject);

    @WebMethod(operationName = "getBestSellers_Vx0Test")
    public List<ShortBook> getBestSellers_Vx0Test(@WebParam(name = "subject") ShortBook subject);

    @WebMethod(operationName = "getBestSellers_VxA")
    public List<ShortBook> getBestSellers_VxA(@WebParam(name = "subject") String subject);

}