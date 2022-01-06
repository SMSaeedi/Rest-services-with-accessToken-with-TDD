package com.example.demo.delivery.rest;

import com.example.demo.delivery.object.DeliveryResult;
import com.example.demo.delivery.object.DistrictDelivery;
import com.example.demo.tokenConfig.Authentication;
import com.example.demo.tokenConfig.TokenAuthenticationController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DeliveryRestTest {

    private static final ObjectMapper om = new ObjectMapper();
    int randomServerPort;
    int timeout = 10_000;
    static String t;

    @Test
    public void testProductDetail_Vx0_success() {
        RestTemplate restTemplate = new RestTemplate();
        DeliveryResult input = new DeliveryResult();
        Authentication authInput = new Authentication();
        DistrictDelivery districtDelivery = new DistrictDelivery();
        List<DistrictDelivery> list = new ArrayList<>();

        districtDelivery.setDistrict(10);
        districtDelivery.setOrderid(10L);
        list.add(districtDelivery);

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

        input.setW_id("123");
        input.setO_carrier_id("3214");
        HttpEntity<String> entity = new HttpEntity(input, headers);
        String url1 = "http://localhost:8889/deliveryTransaction_Vx0";

        DeliveryResult out = restTemplate.postForObject(url1, entity,DeliveryResult.class);

        System.out.printf("outPut : " + out);
        printJSON(out);
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