package pages;

import org.openqa.selenium.WebDriver;

public class InformacoesOiPlanoPage extends BasePage{

    public InformacoesOiPlanoPage(WebDriver navegador) {
        super(navegador);
    }

    public InformacoesOiPlanoPage contratarPlanoOi(){

        return this;
    }

    public SecretaPage telaPrincipal(){

        return new SecretaPage(navegador);
    }
}
