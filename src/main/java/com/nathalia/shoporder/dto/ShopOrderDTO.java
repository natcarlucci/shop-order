package com.nathalia.shoporder.dto;

import java.io.Serializable;

public class ShopOrderDTO implements Serializable {

    private String product;


    private String status;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
