import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MetodoTestando {
	
	WebDriver driver;
	
	public void abrirBrowser(String appUrl, String navegador) {
		
		switch (navegador) {
		
		case "Chrome":
			
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\Nova Pasta\\driver\\chromedriver.exe"); 
			driver = new ChromeDriver();
			driver.get(appUrl);
			break;
			
			
		case"Firefox":
			
			System.setProperty("webdriver.gecko.driver", "C:\\driver\\Nova Pasta\\driver\\geckodriver.exe"); 
			driver = new FirefoxDriver();
			driver.get(appUrl);
			break;
			
		}
		
	}
	public void pesquisar(String texto) {
		WebElement pesquisar = driver.findElement(By.name("q"));
		pesquisar.sendKeys(texto);
		pesquisar.submit();
		
		
	}

}



