import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OurSecondTest {
    @BeforeMethod
    public void setUp(){
        System.out.println("Our before test");

    }

@Test(description = "Это тест логина пользователя", alwaysRun = true, groups = {"Payments"})
    public void ourFirstTestMethod() {
    System.out.println("It's our first test");
}

@Test(dependsOnMethods = "ourFirstTestMethod", groups={"unit1","integration"})
    public void ourThirdTestMethod() {
    System.out.println("It's our second test");
}

@Test()
    public void ourFourthTestMethod() {
    System.out.println("It's our second test");
}

    @AfterTest
    public void after() {
        System.out.println("Report Here");

    }

}


