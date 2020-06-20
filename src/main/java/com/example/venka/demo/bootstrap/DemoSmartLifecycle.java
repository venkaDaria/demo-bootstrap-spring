package com.example.venka.demo.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DemoSmartLifecycle implements SmartLifecycle {

    private boolean isRunning;

    @Override
    public void start() {
        isRunning = true;
        log.info("[DemoSmartLifecycle]: Start");
    }

    @Override
    public void stop() {
        isRunning = false;
        log.info("[DemoSmartLifecycle]: Stop");
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }
}
