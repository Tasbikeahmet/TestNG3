package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {
    //    public static void main(String[] args) {
//        webSitesiniAc();
//        LoginTestIsleminiYap();
//        driverıKapat();
//    }
    //eger sira bvermezsek alfabatik sira ile calisir

    @Test(priority = 1 )//annotation lar
    void websitesiniAc(){
        System.out.println("Driver tanimlandi ve web sitesi acildi");
    }
    @Test(priority = 2)//priority oncelik sirasi demek
    void loginTestIsleminiYap(){
        System.out.println("Login test islemleri yapildi");
    }
    @Test(priority = 3)
    void driveriKapat(){
        System.out.println("Driver kapatildi ve cikildi");
    }
    //uesil tik hatali assertion yok demek
}
