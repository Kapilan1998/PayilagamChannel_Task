package com.example.payilagamchannel_task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PayilagamChannelTaskApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context1 = SpringApplication.run(PayilagamChannelTaskApplication.class, args);
                //getBean() method used to retrieve instance of Home class
        Home home1 = context1.getBean(Home.class);
        home1.connect();


                    //avoid it as it is tightly coulping
//        Home home = new Home();
//        home.connect();
    }

}
