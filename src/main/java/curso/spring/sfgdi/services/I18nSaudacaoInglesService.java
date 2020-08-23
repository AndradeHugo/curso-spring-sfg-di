package curso.spring.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nSaudacaoInglesService implements SaudacaoService {

    @Override
    public String dizerSaudacao() {
        return "Hello World - EN";
    }

}
