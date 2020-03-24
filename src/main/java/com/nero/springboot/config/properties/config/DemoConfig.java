package com.nero.springboot.config.properties.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 读取Application的自定义属性
 */
@Component
public class DemoConfig {
    @Value("${com.nero.name}")
    private String name;
    @Value("${com.nero.sex}")
    private int sex;
    @Value("${com.nero.full-name}")
    private String fullName;

    //以下为随机数属性
    @Value("${com.nero.random.string}")
    private String randomString;
    @Value("${com.nero.random.int}")
    private int randomInt;
    @Value("${com.nero.random.long}")
    private long randomLong;
    @Value("${com.nero.random.int10}")
    private int randomInt10;
    @Value("${com.nero.blog.int10-20}")
    private int randomInt10_20;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRandomString() {
        return randomString;
    }

    public void setRandomString(String randomString) {
        this.randomString = randomString;
    }

    public int getRandomInt() {
        return randomInt;
    }

    public void setRandomInt(int randomInt) {
        this.randomInt = randomInt;
    }

    public long getRandomLong() {
        return randomLong;
    }

    public void setRandomLong(long randomLong) {
        this.randomLong = randomLong;
    }

    public int getRandomInt10() {
        return randomInt10;
    }

    public void setRandomInt10(int randomInt10) {
        this.randomInt10 = randomInt10;
    }

    public int getRandomInt10_20() {
        return randomInt10_20;
    }

    public void setRandomInt10_20(int randomInt10_20) {
        this.randomInt10_20 = randomInt10_20;
    }
}
