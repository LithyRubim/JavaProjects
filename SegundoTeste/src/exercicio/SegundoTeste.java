package exercicio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SegundoTeste {
	
	WebDriver driver;
	
	@Before
	public void iniciar() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\alexw\\eclipse\\java-2020-03\\eclipse\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://localhost/ProjetoRodoviaria");
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
