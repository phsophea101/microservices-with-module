package com.sample.common.config;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

public interface ApplicationReadyListener extends ApplicationListener<ApplicationReadyEvent> {
}
