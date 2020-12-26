package pages;

import org.openqa.selenium.WebDriver;

public class SecretaPage extends BasePage{

        public SecretaPage(WebDriver navegador) {
            super(navegador);
        }
        public MenuPage retornaMenuPage(){
            return new MenuPage(navegador);
        }


}
