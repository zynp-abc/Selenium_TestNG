package freelancer.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderTest {


    @DataProvider(name = "positiveTestData")
    public static Object[][] provideBoundaryValueTestData() {
        return new Object[][]{
                {"18"},   //Alt sınır
                {"30"},   //Geçerli sınır
                {"100"}   //Üst sınır
        };
    }


    @DataProvider(name = "negativeTestData")
    public static Object[][] provideNegativeTestData() {
        return new Object[][]{
                {"17"},   //Alt sınırın altı
                {"101"}   //Üst sınırın üstü
        };
    }

    @DataProvider(name = "InvalidTestData")
    public static Object[][] provideInvalidTestData() {
        return new Object[][]{
                {"zeynep"},
                {"?"},
                {"-7"}
        };
    }
}


