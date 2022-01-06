package com.example.demo.createShoppingCard.rest;

import com.example.demo.createShoppingCart.model.Cart;
import com.example.demo.createShoppingCart.model.CreateShoppingCardInput;
import com.example.demo.tokenConfig.Authentication;
import com.example.demo.tokenConfig.TokenAuthenticationController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CreateShoppingCardRestTest {

    private static final ObjectMapper om = new ObjectMapper();
    int randomServerPort;
    int timeout = 10_000;
    static String t;

    @Test
    public void testProductDetail_Vx0_success() {
        RestTemplate restTemplate = new RestTemplate();
        Authentication authInput = new Authentication();
        List<String> ids = new ArrayList<>();
        List<String> quantities = new ArrayList<>();
        JSONObject jsonObject = null;

        ids.add("1");
        ids.add("2");
        ids.add("3");
        ids.add("4");
        ids.add("5");

        quantities.add("9");
        quantities.add("8");
        quantities.add("7");
        quantities.add("6");
        quantities.add("5");

        final String userName = "mmm7029";
        final String passWord = "137029@Sms";
        authInput.setUser(userName);
        authInput.setPassword(passWord);

        t = TokenAuthenticationController.getJWTToken(authInput);

        System.out.printf("Auth : " + authInput);
        authInput.setPassword("*******");
        printJSON(authInput);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", t);

        MultiValueMap map = new LinkedMultiValueMap<String, List<String>>();
        map.add("I_ID", "1");
        map.add("ids", ids);
        map.add("quantities", quantities);
        map.add("SHOPPING_ID", "2");

        final HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<MultiValueMap<String, String>>(map,
                headers);

        String url1 = "http://localhost:8889/createShoppingCart_Vx0/";

        ResponseEntity<Cart> responseEntity = restTemplate.exchange(
                url1, HttpMethod.POST, entity,
                Cart.class);

        if (responseEntity.getStatusCode() == HttpStatus.CREATED) {
            try {
                jsonObject = new JSONObject(String.valueOf(responseEntity.getBody()));
                System.out.println(jsonObject);
            } catch (JSONException e) {
                throw new RuntimeException("JSONException occurred");
            }

            System.out.printf("outPut : " + responseEntity);
            printJSON(responseEntity);
        }
    }

    private static void printJSON(Object object) {
        String result;
        try {
            result = om.writerWithDefaultPrettyPrinter().writeValueAsString(object);
            System.out.println(result);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}