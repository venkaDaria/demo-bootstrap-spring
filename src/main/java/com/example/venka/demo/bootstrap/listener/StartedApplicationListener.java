package com.example.venka.demo.bootstrap.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StartedApplicationListener implements ApplicationListener<ContextStartedEvent> {

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        logEvent(event);
    }

    private void logEvent(ApplicationEvent event) {
        log.info("[StartedApplicationListener] Event: " + event);
    }
}
