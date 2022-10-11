package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe ve UnSubscribe işlemlerini ayrı ayı testlerde yapınız.
3- Newsletter  üyelik işlemini, üye ise , üyelikten çıkma, değilse ekleme şeklinde yapınız
 */
public class _02_Subscribe extends GenelWebDriver {
    By link=By.linkText("Newsletter");
    By yes=By.cssSelector("input[value='1']");
    By no=By.cssSelector("input[value='0']");
    By cnt=By.cssSelector("input[value='Continue']");

    @Test(priority = 1)
    void SubscribeFuntionYes(){
        WebElement newsletter= driver.findElement(link);
        newsletter.click();

        WebElement yesbutton= driver.findElement(yes);
        yesbutton.click();


        WebElement contine= driver.findElement(cnt);
        contine.click();
        Tools.successMessageValidation();

    }
    @Test(priority = 2)
    void SubscribeFuntionNo(){
        WebElement newsletter= driver.findElement(link);
        newsletter.click();

        WebElement nobutton= driver.findElement(no);
        nobutton.click();

        WebElement contine= driver.findElement(cnt);
        contine.click();

        Tools.successMessageValidation();

    }
    @Test(priority = 3)
    void SubscribeFuntiondegistir(){
        WebElement newsletter= driver.findElement(link);
        newsletter.click();
        WebElement nobutton=driver.findElement(no);
        WebElement yesbutton= driver.findElement(yes);
        if (yesbutton.isSelected())
        nobutton.click();
        else yesbutton.click();

        WebElement contine= driver.findElement(cnt);
        contine.click();

        Tools.successMessageValidation();

    }

}
