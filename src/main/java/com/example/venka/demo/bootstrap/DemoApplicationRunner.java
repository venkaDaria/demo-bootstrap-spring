package com.example.venka.demo.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Slf4j
@Component
public class DemoApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        log.info("[ApplicationRunner] Args: ");
        nonOptionArgs(args);
        optionArgs(args);
    }

    private void nonOptionArgs(ApplicationArguments args) {
        args.getNonOptionArgs().forEach(log::info);
    }

    private void optionArgs(ApplicationArguments args) {
        args.getOptionNames().stream()
                .map(args::getOptionValues)
                .map(Objects::toString)
                .forEach(log::info);
    }
}
