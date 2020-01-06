package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
class MyEurekaApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(MyEurekaApp.class,args);
    }
}
