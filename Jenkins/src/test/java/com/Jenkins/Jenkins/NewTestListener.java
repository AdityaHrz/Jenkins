package com.Jenkins.Jenkins;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTestListener {
    WebDriver driver;

    @Test
    public void f() {
        driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
        Assert.assertEquals(driver.getTitle(), "Selenium - Google Search");
    }

    @BeforeMethod
    public void bm() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @AfterMethod
    public void am() {
        
            driver.quit();
        
    }
}
