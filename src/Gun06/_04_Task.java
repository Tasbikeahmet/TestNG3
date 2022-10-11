package Gun06;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Daha önceki derslerde yaptğımı Search fonksiyonunu
 * Mac,ipod ve samsung için Dataprovider ile yapınız.
 */
public class _04_Task extends GenelWebDriver {

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
