package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static Support.OpenBrowser.*;

public class logintest {
     private  WebDriver driver;

    @BeforeClass
    void openBrowser(){

        Browser("chrome");

        Visit("https://the-internet.herokuapp.com/login");
        Maxiumpage();
    }
    @Test
    void tc01(){
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();

    }
    @AfterTest
    void close() throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }
}
