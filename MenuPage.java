package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MenuPage extends BasePage {

    public MenuPage(WebDriver navegador) {
        super(navegador);
    }

    public MenuPage menuSuspenso() {
        Actions actions = new Actions(navegador);
        actions.moveToElement(navegador.findElement(By.xpath("//*[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-224']"))).perform();

        return this;
    }

    public InformacoesOiPlanoPage clicarMenuOi() {
        navegador.findElement(By.linkText("Oi")).click();
        return new InformacoesOiPlanoPage(navegador);
    }

    public InformacoesClaroPlanoPage clicarMenuClaro() {
        navegador.findElement(By.linkText("CLARO")).click();
        return new InformacoesClaroPlanoPage(navegador);
    }

    public InformacoesVivoPlanoPage clicarMenuVivo() {
        navegador.findElement(By.linkText("VIVO")).click();
        return new InformacoesVivoPlanoPage(navegador);
    }

    public InformacoesTimPLanoPage clicarMenuTim() {
        navegador.findElement(By.linkText("TIM")).click();
        return new InformacoesTimPLanoPage(navegador);
    }

    public ComparaPlanosPage TodosPlanos() {
        navegador.findElement(By.linkText("Planos de celular")).click();
        return new ComparaPlanosPage(navegador);
    }



}



