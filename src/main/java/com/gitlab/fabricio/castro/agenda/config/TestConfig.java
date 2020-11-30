package com.gitlab.fabricio.castro.agenda.config;

import com.gitlab.fabricio.castro.agenda.model.entity.Client;
import com.gitlab.fabricio.castro.agenda.model.repository.ClientRepository;
import com.gitlab.fabricio.castro.agenda.model.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ClientRepository clientRepository;
//
//    @Autowired
//    private ServiceRepository serviceRepository;

    @Override
    public void run(String... args) throws Exception {

        Client c1 = new Client();
//        Client c2 = new Client();
//        Client c3 = new Client();

        c1.setName("Fabricio");
        c1.setCpf("32165498764");
        c1.setDateInsert(Instant.parse("2019-06-20T19:53:07Z"));

        clientRepository.saveAll(Arrays.asList(c1));
    }


}