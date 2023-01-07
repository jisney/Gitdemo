package facebooktestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\automation\\Selenium\\chromedriver_win32\\chromedriver.exe" );
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.findElement(By.name("email")).sendKeys("Jisney");
driver.findElement(By.name("pass")).sendKeys("Jisney");
driver.findElement(By.name("login")).click();

  }
}
