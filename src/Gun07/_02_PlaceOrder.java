package Gun07;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
/*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/
public class _02_PlaceOrder extends GenelWebDriver {

    @Test
    void ProceedToCheckout(){
        driver.manage().window().maximize();
        WebElement arama=driver.findElement(By.cssSelector("[id='search']>input"));
        arama.sendKeys("ipod");
        WebElement button= driver.findElement(By.className("input-group-btn"));
        button.click();
        WebElement sepeteekle= driver.findElement(By.className("button-group"));
        sepeteekle.click();
        WebElement shopcart= driver.findElement(By.xpath("//*[@title='Shopping Cart']"));
        shopcart.click();
        WebElement check= driver.findElement(By.cssSelector("[class='pull-right']>a"));
        check.click();
        WebElement cnt1=driver.findElement(By.cssSelector("[value='Continue']"));
        cnt1.click();
        WebElement cnt2=driver.findElement(By.id("button-shipping-address"));
        cnt2.click();

        WebElement cnt3= driver.findElement(By.id("button-shipping-method"));
        cnt3.click();
        WebElement cbox= driver.findElement(By.cssSelector("[type='checkbox']"));
        cbox.click();
        WebElement cnt4= driver.findElement(By.id("button-payment-method"));
        cnt4.click();
        WebElement congf=driver.findElement(By.id("button-confirm"));
        congf.click();
        wait.until(ExpectedConditions.urlContains("http://opencart.abstracta.us/index.php?route=checkout/success"));
        WebElement kontrol= driver.findElement(By.cssSelector("[id='content']>h1"));
        Assert.assertEquals("Your order has been placed!",kontrol.getText());


    }
}
//hocanin yaptigi

//    WebElement searchBox = driver.findElement(By.name("search"));
//        searchBox.sendKeys("ipod");
//
//                WebElement searchButton = driver.findElement(By.className("input-group-btn"));
//                searchButton.click();
//
//                WebElement addToCart=driver.findElement(By.xpath("//span[text()='Add to Cart']"));
//                addToCart.click();
//
//                WebElement shoppingCart = driver.findElement(By.linkText("Shopping Cart"));
//                shoppingCart.click();
//
//                WebElement checkOut = driver.findElement(By.linkText("Checkout"));
//                checkOut.click();
//
//                WebElement continue1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-address")));
//                continue1.click();
//
//                WebElement continue2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-address")));
//                continue2.click();
//
//                WebElement continue3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-method")));
//                continue3.click();
//
//                WebElement agree=driver.findElement(By.name("agree"));
//                agree.click();
//
//                WebElement continue4 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-method")));
//                continue4.click();
//
//                WebElement  confirm=driver.findElement(By.id("button-confirm"));
//                confirm.click();
//
//                wait.until(ExpectedConditions.urlContains("success"));
//
//                WebElement h1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='content']>h1")));
//
//                Assert.assertEquals(h1.getText(),"Your order has been placed!","Karşılaştırma Sonucu : ");