package com.nero.springboot.config.properties.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 通过@ConfigurationProperties来绑定属性
 */
@Component
//@PropertySource指定从那个配置文件读取属性 注意：如果Application.properties与@PropertySource指定的配置文件存在相同属性，
// Application.properties中的属性具有优先级，会覆盖@PropertySource中的属性
//@PropertySource("classpath:config/config2.properties")
@ConfigurationProperties(prefix = "com.demo-config2")
public class DemoConfig2 {
    private String name;
    private int id;
    private List<String> childs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getChilds() {
        return childs;
    }

    public void setChilds(List<String> childs) {
        this.childs = childs;
    }
}
