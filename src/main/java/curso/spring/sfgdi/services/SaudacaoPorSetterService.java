package curso.spring.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SaudacaoPorSetterService implements SaudacaoService {

    @Override
    public String dizerSaudacao() {
        return "Hello World! Setter";
    }

}
