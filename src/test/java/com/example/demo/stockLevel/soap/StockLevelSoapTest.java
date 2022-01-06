package com.example.demo.stockLevel.soap;

import com.example.demo.delivery.object.PaymentResult;
import com.example.demo.stockLevel.webService.StockLevel;
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
public class StockLevelSoapTest {

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
        WebServiceTemplate wsTemplate = new WebServiceTemplate();
        PaymentResult input = new PaymentResult();
        long threshold = 12345L;

        try {
            URL url = null;
            try {
                url = new URL("http://localhost:8889/ws/StockLevel?wsdl");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            QName qname = new QName("http://impl.webService.stockLevel.demo.example.com/", "MostRecentOrder");
            Service service = Service.create(url, qname);
            StockLevel servicePort = service.getPort(StockLevel.class);

            input.setW_id("1");
            input.setC_balance(25.0);
            input.setC_credit_lim(50.0);
            input.setC_first("Austen");
            servicePort.stockLevelTransaction_Vx0Test(input, threshold);

//            wsTemplate.setInterceptors(new ClientInterceptor[]{securityInterceptor()});
        } catch (Exception e) {
            System.out.println("fail");
            e.printStackTrace();
        }
    }
}