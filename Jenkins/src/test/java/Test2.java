import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	WebDriver driver = new ChromeDriver();
  @Test
  public void f() {
	  

//    driver.get("https://www.google.com");

    driver.manage().window().maximize();

    

    driver.get("https://www.bing.com");

      driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]")).sendKeys("Selenium");

      driver.findElement(By.name("q")).sendKeys(Keys.ENTER);



      String pageTitle = driver.getTitle();

      // Use the Java assert statement for assertion

      assert pageTitle.contains("Selenium") : "Page title does not contain 'Selenium'";
  }
}
