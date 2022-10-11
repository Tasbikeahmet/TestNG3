package Gun04;

import org.testng.annotations.*;

public class _01_Intro {
    /*
     @BeforeSuit
       @BeforeTest
         @BeforeGroup
           @BeforeClass
             @BeforeMethod
               @Test
               @Test
             @AfterMethod
           @AfterClass
        @AfterGroup
     @AfterTest
   @AfterSuit
    */
@BeforeSuite
    void bsuit(){ System.out.println("before suit");  }
    @BeforeTest
    void bTest(){ System.out.println("before Test");  }
    @BeforeGroups
    void bGrups(){ System.out.println("before Grups");  }
    @BeforeClass
    void bClass(){ System.out.println("before Class");  }
    @BeforeMethod
    void bMethod(){ System.out.println("before Method");  }
    @Test
    void testIntro1_1(){ System.out.println("Test intro 1 1");  }
    @Test
    void testIntro1_2(){ System.out.println("Test intro 1 2");  }

    @AfterMethod
    void AMethod(){ System.out.println("After Method");  }
    @AfterClass
    void AClass(){ System.out.println("After Class");  }
    @AfterGroups
    void AGrups(){ System.out.println("After Grups");  }
    @AfterTest
    void ATest(){ System.out.println("After Test");  }
    @AfterSuite
    void Asuit(){ System.out.println("After suit");  }

}
