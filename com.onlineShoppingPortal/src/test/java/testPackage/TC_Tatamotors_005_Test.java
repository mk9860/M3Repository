package testPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Tatamotors_005_Test {
  @Test
  public void launchTataMotors() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.tatamotors.com/");
	  Thread.sleep(3000);
	  driver.quit();
  }
}
