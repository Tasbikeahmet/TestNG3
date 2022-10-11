package Gun01;

import org.testng.annotations.*;

public class _02_Annotatoins {
    /*
         @BeforeClass --> // Her class çalışıyorken önce burası çalışır
           @BeforeMetod --> // Her metoddan(test metod) önce çalışır
              @Test     -->  testlerin çalıştığı metodlar
              @Test     -->  testlerin çalıştığı metodlar
           @AfterMetod --> // Her metoddan(test metod) sonra çalışır
         @AfterClass --> // Her class çalışıyorken sonra burası çalışır
     */
    @BeforeClass
void beforeClass(){
    System.out.println("Her classtan once calisacak : Before Class");
}
@BeforeMethod
void  beforeMethod(){
    System.out.println("Her classtan once calisacak :Before Method");
}
@Test(priority = 1)
void test1(){
    System.out.println("test 1 calisti");
}
@Test(priority = 2)
void test2(){
    System.out.println("test 2 calisti");
}
@AfterMethod
void afterMethod(){
    System.out.println("Her classtan sonra calisacak :After Method");
}
@AfterClass
void afterClass(){
    System.out.println("Her classtan once calisacak : Before Class");

}



}
