package com.example.demo.createShoppingCart.controller;

import com.example.demo.createShoppingCart.model.Cart;
import com.example.demo.createShoppingCart.model.CreateShoppingCart_VxA;
import com.example.demo.createShoppingCart.webService.impl.CreateShoppingCartImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CreateShoppingCartController {

    private CreateShoppingCartImpl createShoppingCart = new CreateShoppingCartImpl();

    @RequestMapping("createShoppingCart_Vx0")
    public Cart createShoppingCart_Vx0(
            @RequestParam(name = "I_ID") Integer I_ID,
            @RequestParam(name = "ids") List<String> ids,
            @RequestParam(name = "quantities") List<String> quantities,
            @RequestParam(name = "SHOPPING_ID") Integer SHOPPING_ID) {
        return createShoppingCart.createShoppingCart_Vx0(I_ID, ids, quantities, SHOPPING_ID);
    }

    @RequestMapping("createShoppingCart_VxA")
    public Cart createShoppingCart_VxA(
            @RequestParam(name = "I_ID") Integer I_ID,
            @RequestParam(name = "ids") List<String> ids,
            @RequestParam(name = "quantities") List<String> quantities,
            @RequestParam(name = "SHOPPING_ID") Integer SHOPPING_ID) {
        return new CreateShoppingCart_VxA().createShoppingCart(I_ID, ids, quantities, SHOPPING_ID);
    }

}