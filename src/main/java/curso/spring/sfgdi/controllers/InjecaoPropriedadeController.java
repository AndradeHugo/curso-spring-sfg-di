package curso.spring.sfgdi.controllers;

import curso.spring.sfgdi.services.SaudacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class InjecaoPropriedadeController {

    @Qualifier("saudacaoPorPropriedadeService")
    @Autowired
    public SaudacaoService saudacaoService;

    public String getSaudacao() {
        return saudacaoService.dizerSaudacao();
    }
}
