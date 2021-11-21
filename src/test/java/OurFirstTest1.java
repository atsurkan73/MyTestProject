import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OurFirstTest1 {
    @DataProvider(name = "MyDataProvider") // мож но добавить: , parallel = true
    public Object[][] dataProviderMethod(){
        return new Object[][]{{"chrome, 77.0"}, {"chrome, 71.0"}};

    }

@Test(dataProvider = "MyDataProvider", groups = {"second-group"})
    public void ourFirstTestMethod(String data) {
    System.out.println(data);
}

    @Test(dataProvider = "MyDataProvider", groups = {"second-group"})
    public void ourSecondTestMethod(String data) {
        System.out.println(data);
    }

    @Test(dataProvider = "MyDataProvider", groups = {"second-group"})
    public void ourThirdTestMethod(String data) {
        System.out.println(data);
    }

    @Test(dataProvider = "MyDataProvider", groups = {"second-group"})
    public void ourFourthTestMethod(String data) {
        System.out.println(data);
    }

}


