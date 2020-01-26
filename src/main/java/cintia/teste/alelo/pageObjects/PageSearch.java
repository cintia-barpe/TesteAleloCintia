package cintia.teste.alelo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cintia.teste.alelo.dto.Filme;



public class PageSearch extends BasePage {

	public PageSearch(WebDriver navegador) {
		super(navegador);
	}
		
		public PageSearch selecionaFilmes(String filme,String diretor) throws InterruptedException {

		navegador.findElement(By.name("q")).sendKeys(filme+" com "+diretor);
		navegador.findElement(By.name("btnK")).click();
		navegador.wait(1000);
		
			return this;
		}
	

}
