package com.example.venka.demo.bootstrap.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DemoApplicationListener implements ApplicationListener<ApplicationEvent> {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        logEvent(event);
    }

    private void logEvent(ApplicationEvent event) {
        log.info("[DemoApplicationListener] Event: " + event);
    }
}
