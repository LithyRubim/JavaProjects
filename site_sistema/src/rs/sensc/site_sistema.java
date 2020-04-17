package rs.sensc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class site_sistema {
	
	WebDriver driver;
	
	@Before
		
		public void iniciar() {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			//instanciar o objeto
			driver = new FirefoxDriver();
			
			driver.get("http://localhost/site_atividade_php/restrito.php");
			driver.manage().window().maximize();
			
		
		}

	@Test
	public void test_1()throws InterruptedException {
		
		WebElement btnCadastro= driver.findElement(By.xpath("//*[@id=\"admNoticias\"]/div/div[2]/button"));
		btnCadastro.click();
		
		WebElement txtTitulo= driver.findElement(By.id("titulo"));
		txtTitulo.sendKeys("Game");
		
		WebElement txtResumo= driver.findElement(By.name("resumo"));
		txtResumo.sendKeys("Novos games");
		
		WebElement txtTexto= driver.findElement(By.id("texto"));
		txtTexto.sendKeys("Hoje vamos falar de games");
		
		WebElement txtData= driver.findElement(By.id("data"));
		txtData.sendKeys("2020-12-12");
		
		WebElement txtAutor= driver.findElement(By.id("autor"));
		txtAutor.sendKeys("mauro");
		
		Thread.sleep(2000);
		
		WebElement btnCadastrar= driver.findElement(By.name("cadastrar"));
		btnCadastrar.click();
		
		Thread.sleep(5000);
		
		
	}
	
	@Test
	//Segundo teste, editar a primeira reportagem
	
	public void test_2() throws InterruptedException {
		//Editar a primeira reportagem
		
				WebElement btnEditar= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[5]/a[1]/i"));
				btnEditar.click();
				
				WebElement txtTituloE= driver.findElement(By.id("titulo"));
				txtTituloE.clear();
				
				WebElement txtTituloN= driver.findElement(By.id("titulo"));
				txtTituloN.sendKeys("Novo Corona v�rus");
				
				Thread.sleep(2000);
				
				WebElement btnCadastrarE= driver.findElement(By.name("editar"));
				btnCadastrarE.click();
				
				driver.quit();
		
	}
	@Test
	//terceiro teste, excluir a segunda reportagem
	public void test_3() throws InterruptedException{
		Thread.sleep(2000);

		WebElement btnExcluir = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[5]/a[2]/i"));
		btnExcluir.click();
		
		WebElement btnDeletar = driver.findElement(By.xpath("/html/body/div/div/div[2]/a[1]"));
		btnDeletar.click();
		
		driver.quit();
		
		//((WebDriver) driver.manage().window()).close();
	}
	
	@Test
	//quarto teste, clicar no bot�o de not�cias, utilizar o campo de pesquisa e pesquisar o titulo da primeira noticia
	public void test_4() throws InterruptedException{
		Thread.sleep(2000);
		
		WebElement btnNoticias = driver.findElement(By.xpath("//*[@id=\"navb\"]/ul/li[1]/a"));
		btnNoticias.click();
		
		Thread.sleep(2000);
		
		WebElement txtPesquisa = driver.findElement(By.name("pesquisar"));
		txtPesquisa.sendKeys("Novo corona v�rus");
		
		WebElement btnPesquisar = driver.findElement(By.xpath("//*[@id=\"navb\"]/form/button"));
		btnPesquisar.click();
		
		Thread.sleep(2000);
		
		WebElement btnLer = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/a"));
		btnLer.click();
		
		driver.quit();
	
	}
	
	
	
	
	

}
