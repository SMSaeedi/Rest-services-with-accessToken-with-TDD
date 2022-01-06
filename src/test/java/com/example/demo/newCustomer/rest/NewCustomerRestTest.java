package com.example.demo.newCustomer.rest;

import com.example.demo.newCustomer.model.NewCustomerInput;
import com.example.demo.newCustomer.model.NewCustomerOutput;
import com.example.demo.productDetail.model.ProductDetailInput;
import com.example.demo.productDetail.model.ProductDetailOutput;
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

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class NewCustomerRestTest {

    private static final ObjectMapper om = new ObjectMapper();
    int randomServerPort;
    int timeout = 10_000;
    static String t;

    @Test
    public void testProductDetail_Vx0_success() {
        RestTemplate restTemplate = new RestTemplate();
        Authentication authInput = new Authentication();
        NewCustomerInput input = new NewCustomerInput();

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

        input.setBusinessName("programmer");
        input.setContactEmail("mahsa.saeedy@googole.com");
        input.setContactFName("Mahsa");
        input.setContactLName("Saeedi");

        HttpEntity<String> entity = new HttpEntity(input, headers);
        String url1 = "http://localhost:8889/newCustomer_Vx0Test/";

        NewCustomerOutput output = restTemplate.postForObject(url1, entity, NewCustomerOutput.class);

        System.out.printf("outPut : " + output);
        printJSON(output);
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