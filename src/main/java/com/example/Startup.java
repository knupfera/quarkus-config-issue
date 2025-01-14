package com.example;

import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.event.Observes;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

import java.util.List;

public class Startup {
    private static final Logger log = Logger.getLogger(Startup.class);

    @ConfigProperty(name = "app.some.config")
    List<String> config;

    public void onStartup(@Observes StartupEvent event) {
        log.info(config);
    }
}
