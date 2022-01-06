package com.example.demo.stockLevel.config;

import com.example.demo.stockLevel.webService.StockLevel;
import com.example.demo.stockLevel.webService.impl.StockLevelImpl;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Endpoint;

@Configuration
public class StockSoapWSConfig {

    @Autowired
    private SpringBus bus;

    @Value("${cxf.path}")
    protected String ws;

    @GetMapping("/")
    public RedirectView hello(HttpServletRequest request) {
        return new RedirectView(request.getContextPath() + ws);
    }

    @Bean
    public StockLevel stockLevelService() {
        return new StockLevelImpl();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, stockLevelService());
        endpoint.publish("/StockLevel");
        return endpoint;
    }

}