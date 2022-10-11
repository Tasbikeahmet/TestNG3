package Gun06;

import Utils.ParametreliWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Bir önceki task da yapılan testi PARAMETERDRIVER ile yapınız
 * sonrasında fakrlı tarayıcılar ile çalıştırınız.
 * sonrasında paralel çalıştırınız.
 */

public class _05_Task2 extends ParametreliWebDriver {
    @Test(dataProvider = "data")
    void searchTest(String data){
        driver.manage().window().maximize();
        WebElement arama=driver.findElement(By.cssSelector("[id='search']>input"));
        arama.clear();
        arama.sendKeys(data);
        WebElement button= driver.findElement(By.className("input-group-btn"));
        button.click();
        List<WebElement> captions = driver.findElements(By.cssSelector("[class='product-thumb'] [class='caption'] a"));

        for (WebElement e : captions) {
            Assert.assertTrue(e.getText().toLowerCase().contains(data));
        }
    }

    @DataProvider
    public Object[] data()
    {
        Object[] data={"mac","ipod","samsung"};
        return data;
    }

}
