package curso.spring.sfgdi.controllers;

import curso.spring.sfgdi.services.SaudacaoPorConstrutorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InjecaoSetterControllerTest {

    InjecaoSetterController controller;

    @BeforeEach
    void setUp() {
        controller = new InjecaoSetterController();
        controller.setSaudacaoService(new SaudacaoPorConstrutorService());
    }

    @Test
    void getSaudacao() {
        System.out.println(controller.getSaudacao());
    }
}