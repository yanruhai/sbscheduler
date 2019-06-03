package com.study.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Asus on 2019/6/1.
 */
@Configuration
@RestController
@Data
@PropertySource("classpath:config.properties")
public class Config {
    @Value("${timer.cycle}")
    private int cycle;

}
