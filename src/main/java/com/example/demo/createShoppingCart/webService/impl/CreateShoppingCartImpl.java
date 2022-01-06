package com.example.demo.createShoppingCart.webService.impl;

import com.example.demo.createShoppingCart.model.Cart;
import com.example.demo.createShoppingCart.model.CreateShoppingCart_Vx0;
import com.example.demo.createShoppingCart.model.CreateShoppingCart_VxA;
import com.example.demo.createShoppingCart.webService.CreateShoppingCart;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;

@WebService(serviceName = "CreateShoppingCart")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class CreateShoppingCartImpl implements CreateShoppingCart {

    @Override
    public Cart createShoppingCart_Vx0(Integer I_ID,List<String> ids,List<String> quantities,Integer SHOPPING_ID) {
        return new CreateShoppingCart_Vx0().createShoppingCart(I_ID, ids, quantities, SHOPPING_ID);
    }

    @Override
    public Cart createShoppingCart_VxA(Integer I_ID,List<String> ids,List<String> quantities,Integer SHOPPING_ID) {
        return new CreateShoppingCart_VxA().createShoppingCart(I_ID, ids, quantities, SHOPPING_ID);
    }
}