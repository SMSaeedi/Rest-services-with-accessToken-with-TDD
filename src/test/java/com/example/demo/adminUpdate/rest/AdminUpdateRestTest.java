package com.example.demo.adminUpdate.rest;

import com.example.demo.adminUpdate.model.AdminUpdateInParams;
import com.example.demo.adminUpdate.model.AdminUpdateOutParams;
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
public class AdminUpdateRestTest {

    private static final ObjectMapper om = new ObjectMapper();
    int randomServerPort;
    int timeout = 10_000;
    static String t;

    @Test
    public void testProductDetail_Vx0_success() {
        AdminUpdateInParams input = new AdminUpdateInParams();
        AdminUpdateOutParams out;
        RestTemplate restTemplate = new RestTemplate();
        Authentication authInput = new Authentication();

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

        input.setI_id(01);
        input.setCost(5000);
        input.setImage("pic");
        input.setThumbnail("blaw blaw blaw");
        HttpEntity<String> entity = new HttpEntity(input, headers);
        String url1 = "http://localhost:8889/adminUpdate_Vx0111/";

        out = restTemplate.postForObject(url1, entity, AdminUpdateOutParams.class);

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