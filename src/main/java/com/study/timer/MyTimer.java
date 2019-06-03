package com.study.timer;

import com.study.config.Config;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Asus on 2019/6/1.
 */
@Component
public class MyTimer {
    private int count=0;
    @Autowired
    private Config config;
    @Scheduled(cron="*/6 * * * * ?")
    private void process(){
        if(config.getCycle()==1)
            System.out.println("this is scheduler task runing  "+(count++));
    }
}
