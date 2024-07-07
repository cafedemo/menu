package tut.dushyant.demo.menu;

import org.springframework.boot.SpringApplication;

public class TestMenuApplication {

    public static void main(String[] args) {
        SpringApplication.from(MenuApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}