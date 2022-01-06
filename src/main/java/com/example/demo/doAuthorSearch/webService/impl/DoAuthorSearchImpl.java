package com.example.demo.doAuthorSearch.webService.impl;

import com.example.demo.doAuthorSearch.model.DoAuthorSearch_Vx0;
import com.example.demo.doAuthorSearch.model.DoAuthorSearch_VxA;
import com.example.demo.doAuthorSearch.webService.DoAuthorSearch;
import com.example.demo.doTitleSearch.model.Book;
import com.example.demo.tokenConfig.Authentication;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;
import java.util.Map;

@WebService(serviceName = "DoAuthorSearch")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class DoAuthorSearchImpl implements DoAuthorSearch {

    @Override
    public List<Book> doAuthorSearch_Vx0(String search_key) {
        return new DoAuthorSearch_Vx0().doAuthorSearch(search_key);
    }

    @Override
    public List<Book> doAuthorSearch_Vx0Test(Book search_key) {
        return new DoAuthorSearch_Vx0().doAuthorSearchTest(search_key);
    }

    @Override
    public List<Book> doAuthorSearch_VxA(String search_key) {
        return new DoAuthorSearch_VxA().doAuthorSearch(search_key);
    }

}