package tests.homeWork;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.homeWork.registrationPage;

import java.time.Duration;

public class RegistrationTest {

    @Test
    public void test(){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get(" https://ecommerce-playground.lambdatest.io/index.php?route=account/register");

        registrationPage RegistrationPage = new registrationPage(driver);
        RegistrationPage
                //.navigateTo("https://ecommerce-playground.lambdatest.io/index.php?route=account/register")
                .enterFirstName("John")
                .enterLastName("Doe")
                .enterEmail("johndoe@example.com")
                .enterTelephone("1234567890")
                .enterPassword("password123")
                .enterConfirmPassword("password123")
                .agreeToPrivacyPolicy()
                .submitRegistration();

    }
}
