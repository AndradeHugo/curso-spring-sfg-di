package curso.spring.sfgdi.controllers;

import curso.spring.sfgdi.services.SaudacaoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@AllArgsConstructor
@Controller
public class MyController {

    private final SaudacaoService saudacaoService;

    public String sayHello() {
        return saudacaoService.dizerSaudacao();
    }

}
