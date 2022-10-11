package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
/*
      1- Siteyi açınız.
      2- Edit Account a tıklatınız.
      3- Yeni isim ve soyisim göndererek Continue yapınız.
      4- İşlem sonucunu kontrol ediniz.
      5- Bu işlemi 2 kez çalıştırarak eski haline getiriniz.
     */

public class _03_EditAccount extends GenelWebDriver {
    By editlink=By.linkText("Edit Account");
    By isimlink=By.name("firstname");
    By soylink=By.name("lastname");
    By cnt=By.cssSelector("input[value='Continue']");

@Test(priority = 1)
void isimdegis(){
    WebElement edit= driver.findElement(editlink);
    edit.click();
    WebElement isim=driver.findElement(isimlink);
    isim.clear();
    isim.sendKeys("sallama");
    WebElement soyisim=driver.findElement(soylink);
    soyisim.clear();
    soyisim.sendKeys("dallama");
    WebElement contine=driver.findElement(cnt);
    contine.click();
    Tools.successMessageValidation();

}

    @Test(priority = 2)
    void isimdegis2(){
        WebElement edit= driver.findElement(editlink);
        edit.click();
        WebElement isim=driver.findElement(isimlink);
        isim.clear();
        isim.sendKeys("buneama");
        WebElement soyisim=driver.findElement(soylink);
        soyisim.clear();
        soyisim.sendKeys("hadibeyaa");
        WebElement contine=driver.findElement(cnt);
        contine.click();
        Tools.successMessageValidation();
    }

}
