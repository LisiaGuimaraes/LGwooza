package pages;

import org.openqa.selenium.WebDriver;

public class InformacoesTimPLanoPage extends BasePage{

    public InformacoesTimPLanoPage(WebDriver navegador) {
        super(navegador);
    }

    public InformacoesTimPLanoPage contratarPlanoTim(){
        //
        return this;
    }

    public SecretaPage telaPrincipal(){
        //
        return new SecretaPage(navegador);
    }



}
