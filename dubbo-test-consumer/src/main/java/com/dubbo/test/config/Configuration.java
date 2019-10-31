package com.dubbo.test.config;

import com.dubbo.test.api.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.Bean;

/**
 * @author chenfuqian
 */
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Reference(version = "1.0.0", check = false)
    private DemoService demoService;

    @Bean
    public /*static*/ OrderedBeanPostProcessor orderedBeanPostProcessor(){
        return new OrderedBeanPostProcessor();
    }
}
