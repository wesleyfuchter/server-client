package br.com.copobras.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BalancaSender {

    private final RestTemplateBuilder restTemplateBuilder;

    @Autowired
    public BalancaSender(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    public void run() {

        RestTemplate template = this.restTemplateBuilder.build();

        Peso peso = new Peso();
        peso.setPeso("250");

        template.put("http://localhost:8080/", peso);

    }
}
