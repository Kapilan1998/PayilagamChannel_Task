package com.example.payilagamchannel_task;

import org.springframework.stereotype.Component;

@Component("abc")
public class InternetConnection {
    public String ipAddress;
    public int speed;

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void switchOn(){
        System.out.println("switching on internet connection");
    }
}
