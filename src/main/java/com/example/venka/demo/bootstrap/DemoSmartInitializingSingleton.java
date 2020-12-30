package com.example.venka.demo.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DemoSmartInitializingSingleton implements SmartInitializingSingleton {

    @Override
    public void afterSingletonsInstantiated() {
        log.info("[SmartInitializingSingleton] afterSingletonsInstantiated");
    }
}
