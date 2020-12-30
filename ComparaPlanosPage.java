package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComparaPlanosPage extends BasePage {

    public ComparaPlanosPage(WebDriver navegador) {
        super(navegador);

    }
    public ComparaPlanosPage selecionarPlanos() {

        navegador.findElement(By.xpath("//span[text()='vivo']")).click();
        navegador.findElement(By.xpath("//span[text()='oi']")).click();

        return this;
    }
    public ComparaPlanosPage desmarcarSelecaoPlanos() {

        navegador.findElement(By.xpath("//span[text()='vivo']")).click();
        navegador.findElement(By.xpath("//span[text()='oi']")).click();

        return this;
    }

    public ComparaPlanosPage selecionarTodosPlanos() {

        navegador.findElement(By.xpath("//span[text()='vivo']")).click();
        navegador.findElement(By.xpath("//span[text()='oi']")).click();
        navegador.findElement(By.xpath("//span[text()='claro']")).click();
        navegador.findElement(By.xpath("//span[text()='tim']")).click();
        return this;
    }

    public ComparaPlanosPage desmarcarSelecaoTodosPlano() {

        navegador.findElement(By.xpath("//span[text()='claro']")).click();
        navegador.findElement(By.xpath("//span[text()='oi']")).click();
        navegador.findElement(By.xpath("//span[text()='tim']")).click();
        navegador.findElement(By.xpath("//span[text()='vivo']")).click();

        return this;
    }

    public ComparaPlanosPage selecionarTipoPlanosControlePacoteDadosValor(){
        navegador.findElement(By.xpath("//span[text()='claro']")).click();
        navegador.findElement(By.xpath("//span[text()='oi']")).click();
        navegador.findElement(By.xpath("//span[text()='vivo']")).click();
        navegador.findElement(By.xpath("//span[text()='Pós']")).click();
        navegador.findElement(By.xpath("//span[text()='Controle']")).click();
        navegador.findElement(By.xpath("//span[text()='Mais de 5.0 GB']")).click();
        navegador.findElement(By.xpath("//span[text()='Mais de R$ 75,00']")).click();
        return this;
    }

    public ComparaPlanosPage desmarcarselecaoTipoPlanosControlePacoteDadosValor(){
        navegador.findElement(By.xpath("//span[text()='claro']")).click();
        navegador.findElement(By.xpath("//span[text()='oi']")).click();
        navegador.findElement(By.xpath("//span[text()='vivo']")).click();
        navegador.findElement(By.xpath("//span[text()='Pós']")).click();
        navegador.findElement(By.xpath("//span[text()='Controle']")).click();
        navegador.findElement(By.xpath("//span[text()='Mais de 5.0 GB']")).click();
        navegador.findElement(By.xpath("//span[text()='Mais de R$ 75,00']")).click();
        return this;
    }



    public ComparaPlanosPage selecionarTipoPlanoTimControleMais5GB(){

        navegador.findElement(By.xpath("//span[text()='tim']")).click();
        navegador.findElement(By.xpath("//span[text()='Controle']")).click();
        navegador.findElement(By.xpath("//span[text()='Mais de 5.0 GB']")).click();

        return this;

    }
    public ComparaPlanosPage desmarcarSelecaoPlanoTimControle(){
        navegador.findElement(By.xpath("//span[text()='tim']")).click();
        navegador.findElement(By.xpath("//span[text()='Controle']")).click();
        navegador.findElement(By.xpath("//span[text()='Mais de 5.0 GB']")).click();

        return this;

    }

    public ComparaPlanosPage selecionarTipoPlanoTimPosMais5GB(){

        navegador.findElement(By.xpath("//span[text()='tim']")).click();
        navegador.findElement(By.xpath("//span[text()='Pós']")).click();
        navegador.findElement(By.xpath("//span[text()='Mais de 5.0 GB']")).click();

        return this;

    }
    public ComparaPlanosPage desmarcarSelecaoPlanoTimPos(){
        navegador.findElement(By.xpath("//span[text()='tim']")).click();
        navegador.findElement(By.xpath("//span[text()='Pós']")).click();
        navegador.findElement(By.xpath("//span[text()='Mais de 5.0 GB']")).click();

        return this;

    }

    public ComparaPlanosPage selecionarTipoPlanoClaro(){
        navegador.findElement(By.xpath("//span[text()='claro']")).click();
        navegador.findElement(By.xpath("//span[text()='Controle']")).click();
        navegador.findElement(By.xpath("//span[text()='Pós']")).click();

        return this;

    }

    public ComparaPlanosPage desmarcarPlanoClaro(){
        navegador.findElement(By.xpath("//span[text()='claro']")).click();
        navegador.findElement(By.xpath("//span[text()='Controle']")).click();
        navegador.findElement(By.xpath("//span[text()='Pós']")).click();

        return this;

    }

    public ComparaPlanosPage selecionarTipoPlanoVivo(){
        navegador.findElement(By.xpath("//span[text()='vivo']")).click();
        navegador.findElement(By.xpath("//span[text()='Pós']")).click();
        navegador.findElement(By.xpath("//span[text()='Controle']")).click();

        return this;

    }

    public ComparaPlanosPage desmarcarPlanovivo(){
        navegador.findElement(By.xpath("//span[text()='vivo']")).click();
        navegador.findElement(By.xpath("//span[text()='Pós']")).click();
        navegador.findElement(By.xpath("//span[text()='Controle']")).click();

        return this;
    }

    public ComparaPlanosPage selecionarTipoPlanoOi(){
        navegador.findElement(By.xpath("//span[text()='oi']")).click();
        navegador.findElement(By.xpath("//span[text()='Pós']")).click();
        navegador.findElement(By.xpath("//span[text()='Controle']")).click();

        return this;
    }



}