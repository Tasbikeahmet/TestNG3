package Gun05;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra Contact US yazısını doğrulayınız.
 */
public class _02_ContactUs extends GenelWebDriver {
@Test
@Parameters("mesaj")//XML deki adi
    void ContactUs(String gelenmesaj){//Method daki adi
    driver.manage().window().maximize();

    WebElement Cnt= driver.findElement(By.linkText("Contact Us"));
    Cnt.click();
    WebElement yazi= driver.findElement(By.id("input-enquiry"));
    yazi.sendKeys(gelenmesaj);

    WebElement submit= driver.findElement(By.cssSelector("[Value='Submit']"));
    submit.click();

    WebElement kontrol= driver.findElement(By.cssSelector("[id='content']>h1"));
    System.out.println(kontrol.getText());
    Assert.assertEquals("Contact Us",kontrol.getText(), "Karsilastirma");

}






}
