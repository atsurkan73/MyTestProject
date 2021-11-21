import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OurFirstTest2 {
//    @DataProvider(name = "MyDataProvider", parallel = true)
//    public Object[][] dataProviderMethod(){
//        return new Object[][]{{"chrome, 77.0"}, {"chrome, 71.0"}};


    @Parameters({"username", "password"})
    @Test()
    public void ourFirstTestMethod(String username, String password) {
        System.out.println("It's our first test");
        System.out.println(username + " " + password);
    }

    @Test()
    public void ourSecondTestMethod() {
        System.out.println("It's our second test");
    }


}