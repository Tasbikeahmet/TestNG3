package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {
    // Yeşil tik : test de hata yok
    // Sarı çarpi : test de hata var
    // Beyaz  : test çalıştırılmadı.skip

    @Test
    void equalOrnek(){
        String s1="Merhaba";
        String s2="Iyi aksamlar";
        //olusan, beklenen , "Hata basligi"
        Assert.assertEquals(s1,s2, "Karsilastirma sonucu");
        //Actual : Olusan
        //Expected : Beklenen

    }
    @Test
    void notEqualOrnek(){
        String s1="Merhaba";
        String s2="Iyi aksamlar";
        //olusan, beklenen , "Hata basligi"
        Assert.assertNotEquals(s1,s2, "Karsilastirma sonucu");
        //Actual : Olusan
        //Expected : Beklenen

    }
    @Test
    void trueOrnek(){
        int s1=55;
        int s2=555;

        Assert.assertTrue(s1==s2, "Karsilastirma sonucu");


    }
    @Test
    void nullOrnek(){
        String s1=null;

        Assert.assertNull(s1, "Karsilastirma sonucu");


    }
    @Test
    void direktFailOrnek(){
        int a=55;
        if (a==55)
        Assert.fail();    }

}
