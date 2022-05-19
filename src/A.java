import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F://selenium files//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=us");
		Actions action=new Actions(driver);
		WebElement password=driver.findElement(By.xpath("//*[@id='password']"));
		action.moveToElement(password).contextClick().perform();
	}

}
