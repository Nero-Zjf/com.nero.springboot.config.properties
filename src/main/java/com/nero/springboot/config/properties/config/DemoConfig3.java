package com.nero.springboot.config.properties.config;

/**
 * 演示通过SpringBoot2.0 binder来读取/绑定
 */
public class DemoConfig3 {
    private int id;
    private int port;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
