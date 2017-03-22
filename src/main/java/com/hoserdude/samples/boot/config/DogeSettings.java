package com.hoserdude.samples.boot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

//@Configuration
//@EnableConfigurationProperties
//@PropertySource("file:C:/Users/KONDP001/git/spring-boot-sample-yaml-config/src/main/resources/test.yml")
//@ConfigurationProperties(prefix="doge")
public class DogeSettings {
    private int wow;
    private String such;
    private boolean very;

    @Autowired
    private Environment env;

    public DogeSettings() {

        System.out.println("enend"+env);
    }

    public int getWow() {
        return wow;
    }

    public void setWow(int wow) {
        this.wow = wow;
    }

    public String getSuch() {
        return such;
    }

    public void setSuch(String such) {
        this.such = such;
    }

    public boolean isVery() {
        return very;
    }

    public void setVery(boolean very) {
        this.very = very;
    }
}
