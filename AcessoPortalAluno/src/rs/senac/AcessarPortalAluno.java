package rs.senac;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AcessarPortalAluno {
	
	WebDriver driver;
	
	@Before	
	
	public void iniciar() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\alexw\\eclipse\\java-2020-03\\eclipse\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get("http://apsweb.senacrs.com.br/modulos/aluno/login.php5?");
		driver.manage().window().maximize();
	}

	@Test
	public void test()throws InterruptedException {
		
		Thread.sleep(5000);		
		WebElement txtUsuario = driver.findElement(By.id("usr-login"));
		txtUsuario.sendKeys("01825435014");
		
		WebElement txtLogin= driver.findElement(By.id("usr-password"));
		txtLogin.sendKeys("Lithy@1991");
		
		WebElement btnEntrar = driver.findElement(By.id("btnEntrar"));
		btnEntrar.click();
		
		Thread.sleep(5000);		
		WebElement btnFre = driver.findElement(By.xpath("/html/body/div[14]/div/div[1]/div/div[2]/ul/li[5]/a"));
		btnFre.click();
		
		Thread.sleep(5000);		
		WebElement btnMenu = driver.findElement(By.id("button-menu"));
		btnMenu.click();
		
		Thread.sleep(2000);
		WebElement btnSair = driver.findElement(By.xpath("/html/body/div[14]/div/div[2]/div[1]/div[1]/div[4]/div/div/ul/li[2]/a"));
		btnSair.click();
		
		
		
	}

}
