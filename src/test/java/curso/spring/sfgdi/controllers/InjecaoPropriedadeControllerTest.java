package curso.spring.sfgdi.controllers;

import curso.spring.sfgdi.services.SaudacaoPorConstrutorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InjecaoPropriedadeControllerTest {

    InjecaoPropriedadeController controller;

    @BeforeEach
    void setUp() {
        controller = new InjecaoPropriedadeController();

        controller.saudacaoService = new SaudacaoPorConstrutorService();
    }

    @Test
    void getSaudacao() {
        System.out.println(controller.getSaudacao());
    }
}