package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/*
        Senaryo;
        1- Siteyi açınız
        2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.
     */
public class _01_ValidateMenu extends GenelWebDriver {

@Test
    void menuValidation(){
        List<String>menuExpectedlist=new ArrayList<>();
    menuExpectedlist.add("Desktops");
    menuExpectedlist.add("Laptops & Notebooks");
    menuExpectedlist.add("Components");
    menuExpectedlist.add("Tablets");
    menuExpectedlist.add("Software");
    menuExpectedlist.add("Phones & PDAs");
    menuExpectedlist.add("Cameras");
    menuExpectedlist.add("MP3 Players");


    By menuFinder = By.cssSelector("ul[class='nav navbar-nav']>li");
    List<WebElement> menuActualList=driver.findElements(menuFinder);
    Tools.compareToList(menuExpectedlist,menuActualList);
    }






}
