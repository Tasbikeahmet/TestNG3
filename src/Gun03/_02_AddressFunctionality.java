package Gun03;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

/*
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3- En son eklenen adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En son eklenen adresi siliniz.
 */
public class _02_AddressFunctionality extends GenelWebDriver {

    @Test
    void AdresEkle(){
        WebElement adres= driver.findElement(By.linkText("Address Book"));
        adres.click();
        WebElement yeniadres=driver.findElement(By.xpath("//*[text()='New Address']"));
        yeniadres.click();
        WebElement isim=driver.findElement(By.id("input-firstname"));
        isim.sendKeys("ahmet");
        WebElement soyisim=driver.findElement(By.id("input-lastname"));
        soyisim.sendKeys("mutlu");
        WebElement company=driver.findElement(By.id("input-company"));
        company.sendKeys("karalar.ltd");
        WebElement adres1=driver.findElement(By.id("input-address-1"));
        adres1.sendKeys(" beyoglu ");
        WebElement adres2=driver.findElement(By.id("input-address-2"));
        adres2.sendKeys("bayrampasa");
        WebElement sehir=driver.findElement(By.id("input-city"));
        sehir.sendKeys("istanbul");
        WebElement postakod=driver.findElement(By.id("input-postcode"));
        postakod.sendKeys("34540");
        WebElement ulke=driver.findElement(By.id("input-country"));
        Select ulkemenu=new Select(ulke);
        ulkemenu.selectByIndex(10);
        //wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("select[id='input-zone']>option"))));
        //bu elemanın bayatlamış hali gidene kadar bekle
        //wait.until(ExpectedConditions.elementToBeClickable(country));

        WebElement bolge=driver.findElement(By.id("input-zone"));
        Select bolgemenu=new Select(bolge);
        System.out.println("ilk size"+bolgemenu.getOptions().size());

        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("[id='input-zone']>option"),
                bolgemenu.getOptions().size()));
        //option larin size i ilk halinden kucuk olaana kadar bekle:yeni durum gelene kadar bekle
        System.out.println("ikinci size"+bolgemenu.getOptions().size());
        bolge=driver.findElement(By.id("input-zone"));
        bolgemenu=new Select(bolge);
        bolgemenu.selectByIndex(3);

        WebElement varsayilan=driver.findElement(By.cssSelector("input[value='1']"));
       varsayilan.click();

        WebElement devam=driver.findElement(By.cssSelector("input[value='Continue']"));
        devam.click();
Tools.bekle(5);
        Tools.successMessageValidation();

    }
    @Test(dependsOnMethods = {"AdresEkle"})
    void Adresyenile(){

        WebElement adres= driver.findElement(By.linkText("Address Book"));
        adres.click();
        List<WebElement> editAll= driver.findElements(By.linkText("Edit"));

        WebElement sonEdit=editAll.get(editAll.size()-1); //sonuuncu edit

        System.out.println("adres size"+editAll.size());
        sonEdit.click();

        WebElement isim=driver.findElement(By.id("input-firstname"));
        isim.clear();
        isim.sendKeys("omer");
        WebElement soyisim=driver.findElement(By.id("input-lastname"));
        soyisim.clear();
        soyisim.sendKeys("faruk");
        WebElement devam=driver.findElement(By.cssSelector("input[value='Continue']"));
        devam.click();

        Tools.bekle(5);
        Tools.successMessageValidation();


    }
    @Test(dependsOnMethods = {"Adresyenile"})
    void Adressil(){

        WebElement adres= driver.findElement(By.linkText("Address Book"));
        adres.click();
        List<WebElement> deleteAll= driver.findElements(By.linkText("Delete"));

        WebElement sonDelete=deleteAll.get(deleteAll.size()-2); //sonuuncu edit

        System.out.println("adres size"+deleteAll.size());
sonDelete.click();

        Tools.bekle(5);
        Tools.successMessageValidation();


    }


}
