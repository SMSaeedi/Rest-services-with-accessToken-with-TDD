package com.example.demo.productDetail.model;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailOutput {

    private String message;
    private List<ProductDetailPojo> detailedProductsList = new ArrayList<>();

    public ProductDetailOutput() {
        super();
    }

    public List<ProductDetailPojo> getDetailedProductsList() {
        return detailedProductsList;
    }

    public void setDetailedProductsList(List<ProductDetailPojo> detailedProductsList) {
        this.detailedProductsList = detailedProductsList;
    }
}