package teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TesteA {
	
	private WebDriver driver;
	//antes do teste
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bosca\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
		driver = new ChromeDriver();
		
	}
	//depois do teste
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	//teste
	@Test
	public void test() throws InterruptedException {
		driver.get("http://www.nossoplanejado.com.br/");
		//driver.get("http://www.google.com.br/");
		//driver.get("http://www.amazon.com.br/");
		assertTrue("Titulo não esperado", driver.getTitle().contentEquals("Nosso Planejamento | Home"));
		//assertTrue("Titulo não esperado", driver.getTitle().contentEquals("Google"));
		//assertTrue("Titulo não esperado", driver.getTitle().contentEquals("Amazon.com.br | Compre livros, Kindle, Echo, Fire Tv e mais."));
		Thread.sleep(3000);
	}

}
