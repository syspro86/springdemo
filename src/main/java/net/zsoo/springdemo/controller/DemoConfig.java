package net.zsoo.springdemo.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "demo")
public class DemoConfig {

    private String getUrl;

    public String getGetUrl() {
        return getUrl;
    }

    public void setGetUrl(String getUrl) {
        this.getUrl = getUrl;
    }

}
