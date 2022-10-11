package Gun01;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _05_ornek extends GenelWebDriver {
    @Test
    void Logintest(){
        WebElement email=driver.findElement(By.id("input-email"));
        email.sendKeys("Ahmet1@gmail.com");
        WebElement sifre= driver.findElement(By.id("input-password"));
        sifre.sendKeys("1237654");
        WebElement login= driver.findElement(By.cssSelector("input[value='Login']"));
        login.click();
       
    }


}
