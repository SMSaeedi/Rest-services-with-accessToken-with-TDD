package com.example.demo.createShoppingCart.webService;

import com.example.demo.createShoppingCart.model.Cart;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService(targetNamespace = "http://impl.webService.createShoppingCart.demo.example.com/")
public interface CreateShoppingCart {

    @WebMethod(operationName = "createShoppingCart_Vx0")
    public Cart createShoppingCart_Vx0(
            @WebParam(name = "I_ID") Integer I_ID,
            @WebParam(name = "ids") List<String> ids,
            @WebParam(name = "quantities") List<String> quantities,
            @WebParam(name = "SHOPPING_ID") Integer SHOPPING_ID);

    @WebMethod(operationName = "createShoppingCart_VxA")
    public Cart createShoppingCart_VxA(
            @WebParam(name = "I_ID") Integer I_ID,
            @WebParam(name = "ids") List<String> ids,
            @WebParam(name = "quantities") List<String> quantities,
            @WebParam(name = "SHOPPING_ID") Integer SHOPPING_ID);
}