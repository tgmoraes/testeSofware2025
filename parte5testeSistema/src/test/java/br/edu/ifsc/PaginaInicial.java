package br.edu.ifsc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaInicial {
    private WebDriver driver;
    private By campoBusca = By.className("search-bar-keywords-input");
    public PaginaInicial(WebDriver driver) {
        this.driver = driver;
    }
    public void navegaHome(){
        this.driver.get("https://www.ifsc.edu.br/en/web/campus-tubarao");
    }
    public PaginaResposta fazBusca(String valor){
        WebElement campoSearch = driver.findElement(campoBusca);
        campoSearch.sendKeys(valor);
        campoSearch.submit();
        return new PaginaResposta(this.driver);
    }

}
