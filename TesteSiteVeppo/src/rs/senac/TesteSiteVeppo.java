package rs.senac;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteSiteVeppo {
	WebDriver driver;
	
	@Before
	
	public void iniciar() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\alexw\\eclipse\\java-2020-03\\eclipse\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get("https://www.veppocel.com.br/internet/php/cadastro.php");
		driver.manage().window().maximize();
		
	}

	@Test
	public void test() {
		
		WebElement txtNome = driver.findElement(By.name("nome"));
		txtNome.sendKeys("Alice Dias");
		
		WebElement txtEndereco = driver.findElement(By.name("endereco"));
		txtEndereco.sendKeys("teresopolis");
		
		WebElement txtComplemento = driver.findElement(By.name("complemento"));
		txtComplemento.sendKeys("casa");
		
		WebElement txtCidade = driver.findElement(By.name("cidade"));
		txtCidade.sendKeys("Porto Alegre");
		
		WebElement txtBairro = driver.findElement(By.name("bairro"));
		txtBairro.sendKeys("nonoai");
		
		WebElement txtCep = driver.findElement(By.name("cep"));
		txtCep.sendKeys("90830090");
		
		WebElement SelEstado = driver.findElement(By.name("uf"));
		//SelEstado.sendKeys("Rio de Janeiro");
		SelEstado.sendKeys(Keys.ARROW_UP);
		SelEstado.sendKeys(Keys.ARROW_UP);
		SelEstado.sendKeys(Keys.ENTER);
		
		WebElement rdPessoa = driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/form/table/tbody/tr[8]/td[2]/input[1]"));
		rdPessoa.click();
		
		//WebElement rdJuridico = driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/form/table/tbody/tr[8]/td[2]/input[2]"));
		//rdJuridico.click();
		
		WebElement txtCpf = driver.findElement(By.name("cpfcgc"));
		txtCpf.sendKeys("01825435014");
		
		WebElement txtTelefone = driver.findElement(By.name("fone"));
		txtTelefone.sendKeys("55555555");
		
		WebElement txtFax = driver.findElement(By.name("fax"));
		txtFax.sendKeys("8888888888");
		
		WebElement txtCelular = driver.findElement(By.name("celular"));
		txtCelular.sendKeys("44444444444");
		
		WebElement txtEmail = driver.findElement(By.name("email"));
		txtEmail.sendKeys("exemplo@exemplo.com");
		
		WebElement txtSenha = driver.findElement(By.name("senha"));
		txtSenha.sendKeys("12345678");
		
		WebElement txtConfirma = driver.findElement(By.name("pass1"));
		txtConfirma.sendKeys("12345678");
		
		//WebElement btnLimpar = driver.findElement(By.name("btnAux"));
		//btnLimpar.click();
		
		WebElement btnEnviar = driver.findElement(By.name("btnCadAlt"));
		btnEnviar.click();
		
		
	}

}
