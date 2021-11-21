import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HW_chromedriver {

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "src/test/Resourses/chromedriver.exe");
    }

    // Тест1. Локатор для лого
    @Test()
    public void logoLocator() {
        System.out.println("It's our first test: logoLocator");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");

        WebElement clickLogo = driver.findElement(By.xpath("//div/a[@class='header__logo']/picture/img")); //passed

        driver.close();
    }

    // Тест2. Локатор кнопки 'Поиск'
    @Test()
    public void searchButton() {
        System.out.println("It's our second test: searchButton");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");

        WebElement searchBut = driver.findElement(By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']")); //passed

        driver.close();
    }

    //  Тест3. Локатор кнопки аутентификации
    @Test()
    public void ourThirdTestMethod() {
        System.out.println("It's our third test: authPopupButton");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rozetka.com.ua/");

        WebElement authPopupButton = driver.findElement(By.xpath("//button[@class='header__button ng-star-inserted']"));

        driver.close();
    }

    @AfterTest
    public void after() {
        System.out.println("Tests are over");
    }
}




