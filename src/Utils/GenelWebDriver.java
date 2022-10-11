package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenelWebDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;
    @BeforeClass
   public void BaslangicIslemleri(){
        System.out.println("Driver start ...........");
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // driver.manage().window().maximize(); // max
        driver.manage().deleteAllCookies();  //

        Duration dr= Duration.ofSeconds(30);
        wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(dr); // sadece ana sayfa yüklenirken en başta
        driver.manage().timeouts().implicitlyWait(dr); // bütün webElement için geçerli
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");
        Logintest();

    }
    @AfterClass
    public void BitisIslemleri(){
        System.out.println("Driver stop.....");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    void Logintest(){
        WebElement email=driver.findElement(By.id("input-email"));
        email.sendKeys("Ahmet1@gmail.com");
        WebElement sifre= driver.findElement(By.id("input-password"));
        sifre.sendKeys("1237654");
        WebElement login= driver.findElement(By.cssSelector("input[value='Login']"));
        login.click();


    }
}
