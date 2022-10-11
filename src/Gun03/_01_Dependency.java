package Gun03;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
   interviewlarda sorulan bir konu : testlere öncelikleri nasıl verirsin ?
   priority, dependecy;   Nasıl kullanırsın ?
   1- priority =1 gibi sıralı rakamlar vererek bununla çalışma sırasını belirtirim.
   2- dependOnMethods : bununla kendinden önce hangi metod çalışması gerekiyor ise onu belirtirim.
      bir metodu direkt çalıştırdığınızda kendinden önce bağımlı 1  metod var ise ototmaitk onları
      önce çağırıp sonra kendisi çalışır. Fakat 2 veya daha fazla tane var ise bağımlı olduğu metod ozaman çalışamaz.
 */
public class _01_Dependency {

    @Test
    void startCar(){
        System.out.println("Car start");
    }
    @Test(dependsOnMethods = {"startCar"})//calismasi startCar in hatasiz calismasina bagli
    void driveCar(){
        System.out.println("Car drive");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"startCar","driveCar"})//bu tetin calismasi 2 testin hatasiz calismasina bagli
    void parkCar(){
        System.out.println("Car park");
    }
    @Test(dependsOnMethods = {"parkCar"},alwaysRun = true)//alwaysRun=true bagimliliklari var ama hata cikarsa genede calisir
    void stopCar(){
        System.out.println("Car stop");
    }



}
