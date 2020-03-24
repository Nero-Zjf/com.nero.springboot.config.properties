package com.nero.springboot.config.properties;

import com.nero.springboot.config.properties.config.DemoConfig;
import com.nero.springboot.config.properties.config.DemoConfig2;
import com.nero.springboot.config.properties.config.DemoConfig3;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesApplicationTests {

    @Autowired
    private DemoConfig demoConfig;

    @Autowired
    private DemoConfig2 demoConfig2;

    @Autowired
    private Environment environment;

    /**
     * 测试是否成功读取自定义属性
     */
    @Test
    public void testConfig() {
        Assert.assertEquals("nero", demoConfig.getName());
        Assert.assertEquals(1, demoConfig.getSex());
        Assert.assertEquals("nero-1", demoConfig.getFullName());

        //测试属性随机数读取
        System.out.println("getRandomString："+demoConfig.getRandomString());
        System.out.println("getRandomInt："+demoConfig.getRandomInt());
        System.out.println("getRandomLong："+demoConfig.getRandomLong());
        System.out.println("getRandomInt10："+demoConfig.getRandomInt10());
        System.out.println("getRandomInt10_20："+demoConfig.getRandomInt10_20());
    }

    /**
     * 测试@ConfigurationProperties绑定/读取属性
     */
    @Test
    public void testConfig2() {
        Assert.assertEquals(1, demoConfig2.getId());
        Assert.assertEquals("config2", demoConfig2.getName());
        Assert.assertEquals("one", demoConfig2.getChilds().get(0));
        Assert.assertEquals("two", demoConfig2.getChilds().get(1));
        Assert.assertEquals("three", demoConfig2.getChilds().get(2));
    }

    /**
     * 测试SpringBoot2.0的binder读取/绑定属性
     */
    @Test
    public void testConfig3() {
        Binder binder = Binder.get(environment);

        DemoConfig3 demoConfig3 = binder.bind("com.demo-config3", Bindable.of(DemoConfig3.class)).get();

        Assert.assertEquals(2, demoConfig3.getId());
        Assert.assertEquals(8089, demoConfig3.getPort());
    }

}
