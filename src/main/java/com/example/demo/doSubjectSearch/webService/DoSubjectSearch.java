package com.example.demo.doSubjectSearch.webService;

import com.example.demo.doTitleSearch.model.Book;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService(targetNamespace = "http://impl.webService.doSubjectSearch.demo.example.com/")
public interface DoSubjectSearch {

    @WebMethod(operationName = "doSubjectSearch_Vx0")
    public List<Book> doSubjectSearch_Vx0(@WebParam(name = "search_key") String search_key);

    @WebMethod(operationName = "doSubjectSearch_Vx0Test")
    public List<Book> doSubjectSearch_Vx0Test(@WebParam(name = "search_key") Book search_key);

    @WebMethod(operationName = "doSubjectSearch_VxA")
    public List<Book> doSubjectSearch_VxA(@WebParam(name = "search_key") String search_key);

}