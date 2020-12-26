package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InformacoesClaroPlanoPage extends BasePage {

    public InformacoesClaroPlanoPage(WebDriver navegador) {
        super(navegador);
    }

    public InformacoesClaroPlanoPage selecionaOpcaoContratar(){
        navegador.findElement(By.xpath("//button[@data-wza-plan = \"CC00043NA_NOVA_LINHA\"]")).click();
        WebDriverWait aguardar = new WebDriverWait(navegador, 10);

        return this;
    }

    public SecretaPage telaPrincipal(){
        //
        return new SecretaPage(navegador);
    }



}