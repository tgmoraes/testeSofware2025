package br.edu.ifsc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaResposta {
    private WebDriver driver;
    private By labelResp= By.className("search-total-label");
    public PaginaResposta(WebDriver driver) {
        this.driver= driver;
    }
    public String getLabelRespostas(){
        WebElement labelSearch = driver.findElement(labelResp);
        return labelSearch.getText();
    }
}
