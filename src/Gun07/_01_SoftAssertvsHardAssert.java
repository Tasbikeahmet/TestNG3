package Gun07;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertvsHardAssert {

    @Test
    void HardAsser ()
    {
        String s1="Merhaba dunya";
        System.out.println("Hard Assert oncesi");
        Assert.assertEquals("Merhaba 123",  s1 , "HardAsseert sonucu");
        System.out.println("Hard assert sonrasi");//Hard assert hata verdikten sonrasi calismaz


    }

    @Test
    void SoftAssert()
    {
        String strHomePage="Facebook.com/homepage";
        String strCartPage="Facebook.com/cartpage";
        String strEditAccount="Facebook.com/editacountpage";

        SoftAssert _softAssert=new SoftAssert();
        _softAssert.assertEquals("Facebook.com/homepage",strHomePage);//true
        System.out.println("Assert 1");
        _softAssert.assertEquals("Facebook.com/profile",strCartPage);//fail
        System.out.println("Assert 2");
        _softAssert.assertEquals("Facebook.com/settings",strEditAccount);//fail
        System.out.println("Assert3");

        _softAssert.assertAll();//butun asert sonuclarini isleme koyar
        System.out.println("aktiflik sonrasi");//bu bolum assertall dan sonra oldugu ve hata olustuguicin yazdirmadi







    }


}
