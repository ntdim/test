package com.company.untitled.core.products;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(ProductType.DEF_BEAN_NAME)
public class DEFProductHandler implements ProductHandler {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void Execute() {
        logger.info("Базовая функциональность DEFProductHandler");
    }
}
