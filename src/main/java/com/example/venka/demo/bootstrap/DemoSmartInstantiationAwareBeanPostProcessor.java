package com.example.venka.demo.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DemoSmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("[DemoSmartInstantiationAwareBeanPostProcessor] Bean: " + beanName);
        return SmartInstantiationAwareBeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("[DemoSmartInstantiationAwareBeanPostProcessor] Bean: " + beanName);
        return SmartInstantiationAwareBeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
