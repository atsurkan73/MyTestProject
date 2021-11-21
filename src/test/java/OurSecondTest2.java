import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OurSecondTest2 {
    @DataProvider(name = "MyDataProvider", parallel = true)
    public Object[][] dataProviderMethod(){
        return new Object[][]{{"chrome, 77.0"}, {"chrome, 71.0"}};

    }

    @Test()
    public void ourThirdTestMethod() {
        System.out.println("It's our third test");
    }

    @Test()
    public void ourFourthTestMethod() {
        System.out.println("It's our fourth test");
    }


}