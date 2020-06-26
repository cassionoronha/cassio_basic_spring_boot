package br.com.cassio.poc01.api;

import br.com.cassio.poc01.model.UserSistema;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/")
public class TestController {
    @Value("${versao}")
    private String versao;

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String ping() {
        Date d = new Date();
        return "version: " + versao + " --- Now: " + d.toString();
    }


}
