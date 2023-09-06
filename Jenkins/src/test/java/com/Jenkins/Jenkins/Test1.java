package com.Jenkins.Jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver = new ChromeDriver();
  @Test
  public void f() {
	  

//    driver.get("https://www.google.com");

    driver.manage().window().maximize();

    

    driver.get("https://www.bing.com");

      driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]")).sendKeys("Selenium");
      driver.findElement(By.name("q")).sendKeys(Keys.ENTER);


      String actualTitle = driver.getTitle();
      String expectedTitle = "";
      Assert.assertNotEquals(actualTitle, expectedTitle);
      //driver.quit();
  }
}
