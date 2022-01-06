package com.example.demo.productDetail.model;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailInput {

    private List<Integer> itemIds=new ArrayList<>();
    private long id;

    public List<Integer> getItemIds() {
        return itemIds;
    }

    public void setItemIds(List<Integer> itemIds) {
        this.itemIds = itemIds;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}