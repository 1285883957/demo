package com.lmn.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        Environment environment = run.getBean(Environment.class);
        System.out.println("http://"+ InetAddress.getLocalHost().getHostAddress()+":"+environment.getProperty("server.port"));

    }

}
