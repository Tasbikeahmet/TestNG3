package Gun05;

import Utils.GenelWebDriver;
import Utils.ParametreliWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/*
       Senaryo ;
       1- Siteyi açınız.
       2- mac kelimeini göndererek aratınız.
       3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
       4- aynı işlemi samsung için de yapınız
     */
public class _04_SearchFunctionality extends ParametreliWebDriver {
    @Test
    @Parameters("kelime")
    void Search(String aranan){
        driver.manage().window().maximize();
        WebElement arama=driver.findElement(By.cssSelector("[id='search']>input"));
        arama.sendKeys(aranan);
        WebElement button= driver.findElement(By.className("input-group-btn"));
        button.click();
        List<WebElement> captions = driver.findElements(By.cssSelector("[class='product-thumb'] [class='caption'] a"));

        for (WebElement e : captions) {
            Assert.assertTrue(e.getText().toLowerCase().contains(aranan));
        }



    }
}
