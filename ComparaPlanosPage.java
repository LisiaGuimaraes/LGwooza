package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComparaPlanosPage extends BasePage {

    public ComparaPlanosPage(WebDriver navegador) {
        super(navegador);

    }

    public ComparaPlanosPage selecionaTodosPlanos() {

        navegador.findElement(By.xpath("//span[text()='vivo']")).click();
        navegador.findElement(By.xpath("//span[text()='oi']")).click();
        navegador.findElement(By.xpath("//span[text()='claro']")).click();
        navegador.findElement(By.xpath("//span[text()='tim']")).click();
        return this;
    }

    public ComparaPlanosPage desmarcaPlano() {

        navegador.findElement(By.xpath("//span[text()='claro']")).click();
        navegador.findElement(By.xpath("//span[text()='oi']")).click();
        navegador.findElement(By.xpath("//span[text()='tim']")).click();
        navegador.findElement(By.xpath("//span[text()='vivo']")).click();

        return this;
    }

    public ComparaPlanosPage selecionaPlanos() {

        navegador.findElement(By.xpath("//span[text()='vivo']")).click();
        navegador.findElement(By.xpath("//span[text()='oi']")).click();

        return this;
    }

}