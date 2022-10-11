package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_DataProvider_Iterator {
    @Test(dataProvider = "getData")
    void usernameTest(String username)
    {
        System.out.println("username = "+username);

    }
    @DataProvider
    public Iterator<Object> getData()
    {
        List<Object> data=new ArrayList<>();
        data.add("Nurhayat");
        data.add("Alper");
        data.add("Ugur");
        data.add("Hakan");


        return data.iterator();
    }
    /*****************************************/

    @Test(dataProvider = "getData2")
    void usernameTest2(String username,String password)
    {
        System.out.println("username = "+username+"  Password= "+password);

    }
    @DataProvider
    public Iterator<Object[]> getData2()
    {
        List<Object[]> data=new ArrayList<>();
        data.add(new Object[]{"Nurhayat","123432"});
        data.add(new Object[]{"Alper","123432"});
        data.add(new Object[]{"Ugur","123432"});
        data.add(new Object[]{"Hakan","123432"});


        return data.iterator();
    }

}
