package com.example.demo.doTitleSearch.webService.impl;

import com.example.demo.doTitleSearch.model.Book;
import com.example.demo.doTitleSearch.model.DoTitleSearch_Vx0;
import com.example.demo.doTitleSearch.model.DoTitleSearch_VxA;
import com.example.demo.doTitleSearch.webService.DoTitleSearch;
import com.example.demo.tokenConfig.Authentication;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;
import java.util.Map;

@WebService(serviceName = "DoTitleSearch")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class DoTitleSearchImpl implements DoTitleSearch {

    @Override
    public List<Book> doTitleSearch_Vx0(String search_key) {
        return new DoTitleSearch_Vx0().doTitleSearch(search_key);
    }

    @Override
    public List<Book> doTitleSearch_VxA(String search_key) {
        return new DoTitleSearch_VxA().doTitleSearch(search_key);
    }

}