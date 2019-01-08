package com.consumer.test;

import com.api.service.Demoapi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        context.start();

        Demoapi demoapi = (Demoapi) context.getBean("demoApi");
        System.out.println(demoapi.sayHello());
        try{
            System.in.read();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
