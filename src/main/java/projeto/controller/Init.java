package projeto.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.entity.Contato;
import projeto.entity.EMail;
import projeto.repository.ContatoRepository;
import projeto.repository.EMailRepository;

@RestController
public class Init {

    @Autowired
    private ContatoRepository contatoRepository;

    @Autowired
    private EMailRepository emailRepository;

    @GetMapping("/init")
    public String init() {

        for (int i = 1; i <= 10; i++) {

            Contato contato = new Contato();
            contato.setNome(String.format("Contato %d", i));
            contatoRepository.save(contato);

            for (int j = 1; j <= 5; j++) {

                EMail email = new EMail();
                email.setEmail(String.format("email-%d-contato-%d@asd.com.br", j, i));
                email.setContato(contato);
                emailRepository.save(email);

            }

        }

        return "OK";

    }
}