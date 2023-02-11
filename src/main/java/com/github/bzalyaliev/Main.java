package com.github.bzalyaliev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // ClassPathXmlApplicationContext - один из вариантов контейнера, который содержит бины
        ApplicationContext context = new ClassPathXmlApplicationContext("com.github.bzalyaliev/context.xml");

        IndependentMessageRenderer renderer = (IndependentMessageRenderer) context.getBean("independentRenderer");
        renderer.print();
    }
}
