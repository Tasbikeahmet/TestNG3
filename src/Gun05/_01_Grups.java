package Gun05;

import org.testng.annotations.Test;

public class _01_Grups {
    @Test(groups = "SmokeTest",priority = 3)
    void Test1(){   System.out.println("Test 1 SmokeTest");  }
    @Test(groups = "Regression")
    void Test3(){   System.out.println("Test 3 Regression");  }
    @Test(groups = "Regression")
    void Test5(){   System.out.println("Test 5 Regression");  }
    @Test(groups = "Regression")
    void Test2(){   System.out.println("Test 2 Regression");  }
    @Test(groups = "SmokeTest",priority = 2)
    void Test4(){   System.out.println("Test 4 SmokeTest");  }
    @Test(groups = "SmokeTest",priority = 1)
    void Test6(){   System.out.println("Test 6 SmokeTest");  }
    @Test
    void Test7(){   System.out.println("Test 7");  }

}
