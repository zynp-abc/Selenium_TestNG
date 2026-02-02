package Freelancer.tests.day14_pom;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C06_DataProvider {


    @DataProvider
    public static Object[][] araclar() {
        return new Object[][]{

                {"mercedes"}, {"bmw"}, {"audi"}, {"honda"}
        };
    }


    @Test(dataProvider = "araclar")
    public void test01(String data) {
        System.out.println(data);
    }


    @DataProvider
    public static Object[][] emailPassword() {
        return new Object[][]{

                {"ali@can.com", "ali"},
                {"veli@can.com", "veli"},
                {"ahmet@can.com", "ahmet"}
        };
    }


    @Test(dataProvider = "emailPassword")
    public void test02(String email, String password) {

        System.out.println(email + " = " + password);

    }
}
