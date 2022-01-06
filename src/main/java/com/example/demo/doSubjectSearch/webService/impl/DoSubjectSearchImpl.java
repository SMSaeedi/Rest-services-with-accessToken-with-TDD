package com.example.demo.doSubjectSearch.webService.impl;

import com.example.demo.doSubjectSearch.model.DoSubjectSearch_Vx0;
import com.example.demo.doSubjectSearch.model.DoSubjectSearch_VxA;
import com.example.demo.doSubjectSearch.webService.DoSubjectSearch;
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

@WebService(serviceName = "DoSubjectSearch")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class DoSubjectSearchImpl implements DoSubjectSearch {

    @Override
    public List<Book> doSubjectSearch_Vx0(String search_key) {
        return new DoSubjectSearch_Vx0().doSubjectSearch(search_key);
    }

    @Override
    public List<Book> doSubjectSearch_Vx0Test(Book search_key) {
        return new DoSubjectSearch_Vx0().doSubjectSearchTest(search_key);
    }

    @Override
    public List<Book> doSubjectSearch_VxA(String search_key) {
        return new DoSubjectSearch_VxA().doSubjectSearch(search_key);
    }

}