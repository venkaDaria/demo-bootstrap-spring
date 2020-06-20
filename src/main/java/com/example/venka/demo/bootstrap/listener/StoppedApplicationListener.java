package com.example.venka.demo.bootstrap.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StoppedApplicationListener implements ApplicationListener<ContextStoppedEvent> {

    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        logEvent(event);
    }

    private void logEvent(ApplicationEvent event) {
        log.info("[StoppedApplicationListener] Event: " + event);
    }
}
