package curso.spring.sfgdi.controllers;

import curso.spring.sfgdi.services.SaudacaoService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class InjecaoConstrutorController {

    private SaudacaoService saudacaoService;

    public InjecaoConstrutorController(@Qualifier("saudacaoPorConstrutorService") SaudacaoService saudacaoService) {
        this.saudacaoService = saudacaoService;
    }

    public String getSaudacao() {
        return saudacaoService.dizerSaudacao();
    }

}
