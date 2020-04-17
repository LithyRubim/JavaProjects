package rs.senacrs;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimeiroTeste {
	
	WebDriver driver;
	
	@Before
	public void iniciar() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\alexw\\eclipse\\java-2020-03\\eclipse\\geckodriver.exe");
		//instanciar o objeto
		
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
	}
	

	@Test
	public void test() {
		
	}

}
