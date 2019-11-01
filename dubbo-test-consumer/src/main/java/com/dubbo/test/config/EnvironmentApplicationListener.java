package com.dubbo.test.config;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author zhangyushao
 */
public class EnvironmentApplicationListener implements ApplicationListener<ApplicationPreparedEvent> {

    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        String applicationName = event.getApplicationContext().getEnvironment().getProperty("dubbo.application.name");
        System.err.println("dubbo.application.name:" + applicationName);
    }
}
