package com.example.dto;

import java.util.HashMap;
import java.util.Map;

public class CartDto {
    private Map<ProductDto, Integer> productMap = new HashMap<>();

    public CartDto() {
    }

    public Map<ProductDto, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<ProductDto, Integer> productMap) {
        this.productMap = productMap;
    }

    private boolean checkItemInCart(ProductDto productDto) {
        for (Map.Entry<ProductDto, Integer> entry : productMap.entrySet()) {
            if (entry.getKey().getId() == productDto.getId()) {
                return true;
            }
        }
        return false;
    }

    

    public void addProduct(ProductDto productDto) {
        if (productMap.containsKey(productDto)) {
            Integer currentValue = productMap.get(productDto);
            productMap.replace(productDto, currentValue + 1);
        } else {
            productMap.put(productDto, 1);
        }
    }
}
