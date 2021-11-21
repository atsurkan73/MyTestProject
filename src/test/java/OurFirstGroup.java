import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OurFirstGroup {



@Test(groups = {"SecondGroup"})
    public void ourFirstTestMethod() {
    System.out.println("SecondGroup Test");
}

    @Test(groups = {"second-group"})
    public void ourSecondTestMethod() {
        System.out.println("ourSecondTestMethod");
    }

    @Test(groups = {"second-group"})
    public void ourThirdTestMethod() {
        System.out.println("ourThirdTestMethod");
    }

    @Test(groups = {"second-group"})
    public void ourFourthTestMethod() {
        System.out.println("ourFourthTestMethod");
    }

}


