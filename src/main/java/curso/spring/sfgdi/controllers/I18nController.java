package curso.spring.sfgdi.controllers;

import curso.spring.sfgdi.services.SaudacaoService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final SaudacaoService saudacaoService;

    public I18nController(@Qualifier("i18nService") SaudacaoService saudacaoService) {
        this.saudacaoService = saudacaoService;
    }

    public String sayHello() {
        return this.saudacaoService.dizerSaudacao();
    }
}
