package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider_CokBoyutlu {

    @Test(dataProvider = "getData")
    void usernameTest(String username,String password)
    {
        System.out.println("username = "+username+"  Password= "+password);

    }
    @DataProvider
    public Object[][] getData()
    {
        Object[][] data={
                        {"Nurhayat","1234"},
                        {"Alper","85214"},
                        {"Ugur","745896"},
                        {"Hakan","789654"}
        };
        return data;
    }




}
