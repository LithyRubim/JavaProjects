package senac.rs;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteFale {
	
	WebDriver driver;
	
	@Before
	
	public void iniciar() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\alexw\\eclipse\\java-2020-03\\eclipse\\geckodriver.exe");
		//instanciar o objeto
		driver = new FirefoxDriver();
		
		driver.get("http://senacrs.com.br/contato_faleconosco.asp");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testCadastro() throws InterruptedException{
		
		WebElement txtNome = driver.findElement(By.name("nome"));
		txtNome.sendKeys("Alex Gon�alves");
		
		WebElement txtData = driver.findElement(By.name("datanasc"));
		txtData.sendKeys("05/08/1990");
		
		WebElement SelCidade = driver.findElement(By.name("cidade"));
		SelCidade.sendKeys(Keys.ARROW_DOWN);
		SelCidade.sendKeys(Keys.ENTER);
		
		WebElement txtBairro = driver.findElement(By.name("bairro"));
		txtBairro.sendKeys("lami");
		
		WebElement txtEmail = driver.findElement(By.name("email"));
		txtEmail.sendKeys("exemplo@exemplo.com");
		
		WebElement txtConfEmail = driver.findElement(By.name("confemail"));
		txtConfEmail.sendKeys("exemplo@exemplo.com");
		
		WebElement txtDdd = driver.findElement(By.name("ddd"));
		txtDdd.sendKeys("51");
		
		WebElement txtTelefone = driver.findElement(By.name("telefone"));
		txtTelefone.sendKeys("999999999");
		
		WebElement btnSexo = driver.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/div/div/div[2]/div/form/div[1]/div[2]/div[1]"));
		btnSexo.click();
		
		WebElement txtMensagem = driver.findElement(By.name("mensagem"));
		txtMensagem.sendKeys("Teste de Aluno");
		
		WebElement txtCpf = driver.findElement(By.name("cpf"));
		txtCpf.sendKeys("44444444444");
		
		Thread.sleep(2000);
		
		
		
		WebElement btnEnviar = driver.findElement(By.xpath("/html/body/div[1]/div[9]/div[1]/div/div/div[2]/div/form/input[7]"));
		btnEnviar.click();
		
		
	}

}
