package curso.spring.sfgdi;

import curso.spring.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ac =  SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("---------Profile----------------------");
		I18nController i18nController = (I18nController) ac.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("---------Primary Bean-----------------");
		MyController myController = (MyController) ac.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("---------Por propriedade--------------");
		InjecaoPropriedadeController injecaoPropriedadeController = (InjecaoPropriedadeController) ac.getBean("injecaoPropriedadeController");
		System.out.println(injecaoPropriedadeController.getSaudacao());

		System.out.println("-------------Por setter--------------");
		InjecaoSetterController injecaoSetterController = (InjecaoSetterController) ac.getBean("injecaoSetterController");
		System.out.println(injecaoSetterController.getSaudacao());

		System.out.println("-------------Por construtor--------------");
		InjecaoConstrutorController injecaoConstrutorController = (InjecaoConstrutorController) ac.getBean("injecaoConstrutorController");
		System.out.println(injecaoConstrutorController.getSaudacao());
	}

}
