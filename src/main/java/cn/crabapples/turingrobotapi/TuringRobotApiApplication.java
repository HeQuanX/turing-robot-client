package cn.crabapples.turingrobotapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TuringRobotApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(TuringRobotApiApplication.class, args);
    }

}
