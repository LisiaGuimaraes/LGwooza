package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.MenuPage;
import suporte.Web;

public class InformacoesClienteCelularTest {

    private WebDriver navegador;

    @Before
    public void setup(){
        navegador = Web.createChrome();
    }

    @Test
    public void testConsultarInformacoesPlanos(){

       new MenuPage(navegador)
           .menuSuspenso()
           .clicarMenuClaro()
            //   .selecionaOpcaoContratar()
           .telaPrincipal()
           .retornaMenuPage()
           .clicarMenuOi()
           .contratarPlanoOi()
           .telaPrincipal()
            .retornaMenuPage()
            .clicarMenuVivo()
            .contratarPlanoVivo()
            .telaPrincipal()
            .retornaMenuPage()
            .clicarMenuTim()
            .contratarPlanoTim()
            .telaPrincipal()
            .retornaMenuPage()
            .TodosPlanos()
            .selecionaTodosPlanos()
            .desmarcaPlano()
            .selecionaPlanos();

    }

    @After
    public void tearDown(){
       navegador.quit();
    }
}
