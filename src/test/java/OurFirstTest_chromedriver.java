import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OurFirstTest_chromedriver {
//    @BeforeMethod
//    public void setUp(){
//        System.out.println("Our before test");
//    }

    // локатор для лого
    @Test()
    public void logoLocator() {
        System.setProperty("webdriver.chrome.driver", "src/test/Resourses/chromedriver.exe");
        System.out.println("It's our first test: logoLocator");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");

        WebElement clickLogo = driver.findElement(By.xpath("//div/a[@class='header__logo']/picture/img")); //passed

        driver.close();
//        driver.quit();
    }


    //    кнопка поиск
    @Test()
    public void searchButton() {
        System.setProperty("webdriver.chrome.driver", "src/test/Resourses/chromedriver.exe");
        System.out.println("It's our second test: searchButton");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");

        WebElement searchBut = driver.findElement(By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']")); //passed

        driver.close();
    }
//  кнопка, которая открывает попап аунитификации сайта https://rozetka.com.ua/.
    @Test()
    public void ourThirdTestMethod() {
        System.setProperty("webdriver.chrome.driver", "src/test/Resourses/chromedriver.exe");
        System.out.println("It's our third test: authPopupButton");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");

//        WebElement authPopupButton = driver.findElement(By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']")); //passed
        WebElement authPopupButton = driver.findElement(By.xpath("//button[@class='header__button ng-star-inserted']")); //passed
//
        driver.close();

    }

    @AfterTest
    public void after() {

        System.out.println("Tests are over");
    }
}




