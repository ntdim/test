package com.company.untitled.core.service;

import com.company.untitled.core.products.ProductHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service(ProductService.NAME)
public class ProductServiceBean implements ProductService {
    private final Map<String, ProductHandler> productHandlersMap;

    @Autowired
    public ProductServiceBean(Map<String, ProductHandler> productHandlersMap) {
        this.productHandlersMap = productHandlersMap;
    }

    @Override
    public void execute() {
        for (String s : productHandlersMap.keySet()) {
            productHandlersMap.get(s).Execute();
        }
    }
}