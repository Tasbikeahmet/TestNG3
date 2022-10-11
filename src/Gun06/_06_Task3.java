package Gun06;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/*
   Senaryo
   1- Siteye gidiniz
   2- Specials tiklayiniz
   3- Cikan urun sayisi ile indirimli urun sayisi ayni mi dogrulayiniz
   4- Yukarıdaki işlemden sonra her ürünün önceki fiyatının şu andaki fiyattan
      yüksek olduğunu doğrulayınız.
*/
public class _06_Task3 extends GenelWebDriver {

    @Test
    void special() {
        WebElement specialbutton = driver.findElement(By.linkText("Specials"));
specialbutton.click();
        List<WebElement>oldprice = driver.findElements(By.className("price-old"));
        List<WebElement>newprice = driver.findElements(By.className("price-new"));
        Assert.assertEquals(oldprice.size(),newprice.size());

        for (int i=0;i<newprice.size();i++)
        {
            Assert.assertTrue(Tools.WebElementToDouble(newprice.get(i))<Tools.WebElementToDouble(oldprice.get(i)));
        }
//        for(int i=0; i<newprice.size();i++){
//
//            Assert.assertTrue(
//                    Double.parseDouble(oldprice.get(i).getText().replace("$",""))>
//                            Double.parseDouble(newprice.get(i).getText().replace("$",""))
//                    ,"Karşılaştırma sonucu : ");
//
//        }

    }
}
