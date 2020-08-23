package curso.spring.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSaudacaoEspanholService implements SaudacaoService {

    @Override
    public String dizerSaudacao() {
        return "Hola Mundo - ES";
    }

}
