package br.com.copobras.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Runner {

    @Bean
    CommandLineRunner setUp(final BalancaSender balancaSender) {
        return args -> {
            while(true) {
                balancaSender.run();
                Thread.sleep(1000);
            }
        };
    }

}
