package curso.spring.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class SaudacaoPrimariaService implements SaudacaoService {

    @Override
    public String dizerSaudacao() {
        return "Hello World! Primary Bean";
    }
}
