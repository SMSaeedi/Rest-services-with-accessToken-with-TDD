package com.example.demo.createNewCustomer.soap;

import com.example.demo.createNewCustomer.webService.CreateNewCustomer;
import com.example.demo.newCustomer.model.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreateNewCustomerSoapTest {

    @Bean
    public Wss4jSecurityInterceptor securityInterceptor() {
        String username = "mmm7029";
        String password = "137029@Sms";
        Wss4jSecurityInterceptor security = new Wss4jSecurityInterceptor();

       /* if (!username.equals("mmm7029") || !password.equals("137029@Sms")) {
            System.out.println("Username or password is wrong!");
        } else {
            *//*String token = GenerateToken.generateNewToken();
            // Adds "Timestamp" and "UsernameToken" sections in SOAP header
            security.setSecurementActions(WSHandlerConstants.TIMESTAMP + " " + token);*//*

            // Set values for "UsernameToken" sections in SOAP header
            security.setSecurementPasswordType(WSConstants.PW_TEXT);
            security.setSecurementUsernameTokenCreated(true);
            security.setSecurementUsername(username);
            security.setSecurementPassword(password);
        }*/
        return security;
    }

    @Test
    public void testSoap() {
        Customer cust = new Customer();
        WebServiceTemplate wsTemplate = new WebServiceTemplate();

        try {
            URL url = null;
            try {
                url = new URL("http://localhost:8889/ws/CreateNewCustomer?wsdl");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            QName qname = new QName("http://impl.webService.createNewCustomer.demo.example.com/", "MostRecentOrder");
            Service service = Service.create(url, qname);
            CreateNewCustomer servicePort = service.getPort(CreateNewCustomer.class);

            cust.c_id = 1;
            cust.c_fname = "Mahsa";
            cust.c_lname = "Saeedi";
            cust.c_email = "mahsa.saeedi@google.com";
            cust.c_phone = "09399008001";

            servicePort.createNewCustomer_Vx0(cust);

//            wsTemplate.setInterceptors(new ClientInterceptor[]{securityInterceptor()});
        } catch (Exception e) {
            System.out.println("fail");
            e.printStackTrace();
        }
    }
}