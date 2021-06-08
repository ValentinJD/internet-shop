package ru.internet.shop;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyTestContext {
    static ApplicationContext context;

    public MyTestContext(ApplicationContext context) {
        MyTestContext.context = context;
    }

    public static ApplicationContext getContext() {
        return context;
    }
}
