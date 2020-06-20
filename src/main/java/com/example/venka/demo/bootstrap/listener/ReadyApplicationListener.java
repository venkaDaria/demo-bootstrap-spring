package com.example.venka.demo.bootstrap.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ReadyApplicationListener implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        logEvent(event);
    }

    private void logEvent(ApplicationEvent event) {
        log.info("[ReadyApplicationListener] Event: " + event);
    }
}
