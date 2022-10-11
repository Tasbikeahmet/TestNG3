package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;
import java.util.WeakHashMap;

public class Tools {

    public static void compareToList(List<String>menuExpectedList, List<WebElement>menuActualList){
        for (int i=0;i<menuExpectedList.size();i++)
            Assert.assertEquals(menuExpectedList.get(i), menuActualList.get(i).getText(),"Karsilastirma sonucu");
    }

    public static void successMessageValidation(){
        WebElement YesilYaziDogrula= GenelWebDriver.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='alert alert-success alert-dismissible']")));
        Assert.assertTrue(YesilYaziDogrula.getText().contains("Your address has been successfully updated"));

    }
    public static void bekle(int saniye){

        try {
            Thread.sleep(saniye+1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static double WebElementToDouble(WebElement e) {
        String result=e.getText();
        result=result.replaceAll("[^\\d]","");
        return Double.parseDouble(result);
    }
public static int RandomGenerator(int max){
        return (int) (Math.random()*max);
}

}
