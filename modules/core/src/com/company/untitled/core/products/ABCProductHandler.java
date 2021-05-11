package com.company.untitled.core.products;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(ProductType.ABC_BEAN_NAME)
public class ABCProductHandler implements ProductHandler {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void Execute() {
        logger.info("Базовая функциональность ABCProductHandler");
    }
}
