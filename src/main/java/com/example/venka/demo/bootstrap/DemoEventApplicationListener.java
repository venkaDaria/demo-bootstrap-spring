package com.example.venka.demo.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DemoEventApplicationListener {

    @EventListener
    public void handleContextRefreshedEvent(ContextRefreshedEvent event) {
        logEvent(event);
    }

    @EventListener
    public void handleApplicationReadyEvent(ApplicationReadyEvent event) {
        logEvent(event);
    }

    private void logEvent(ApplicationEvent event) {
        log.info("[DemoEventApplicationListener] Event: " + event);
    }
}
