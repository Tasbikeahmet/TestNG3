package Gun01;

import jdk.jfr.Enabled;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;


public class _04_Enable {

    @Test
    void Test1(){
        System.out.println("Test 1");
    }
    @Test(enabled = false)
    void Test2(){
        System.out.println("Test 2");
    }
    @Test
    void Test3(){     System.out.println("Test3");
    }
    public static WebDriver driver;
    public static WebDriverWait wait;
    @BeforeClass
    void BaslangicIslemleri(){
        System.out.println("Driver start ...........");
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // driver.manage().window().maximize(); // max
        driver.manage().deleteAllCookies();  //

        Duration dr= Duration.ofSeconds(30);
        wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(dr); // sadece ana sayfa yüklenirken en başta
        driver.manage().timeouts().implicitlyWait(dr); // bütün webElement için geçerli
    }
    @AfterClass
    void BitisIslemleri(){
        System.out.println("Driver stop.....");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
    }




}
