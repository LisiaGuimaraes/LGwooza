package suporte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome() {
        //Abre o navegador
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TestAut\\driver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        //Espera implicita
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Maximiza tela
        navegador.manage().window().maximize();

        //Navega para a tela do CelularDireto
        navegador.get("https://www.celulardireto.com.br/");

        return navegador;

    }

    }
