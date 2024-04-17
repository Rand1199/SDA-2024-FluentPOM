package pages.homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registrationPage {
     WebDriver ldriver;

    public registrationPage(WebDriver gdriver) {
        ldriver = gdriver;
    }

    public registrationPage navigateTo(String url) {
        ldriver.get(url);
        return this;
    }

    public registrationPage enterFirstName(String firstName) {
        WebElement firstNameField = ldriver.findElement(By.id("input-firstname"));
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
        return this;
    }

    public registrationPage enterLastName(String lastName) {
        WebElement lastNameField = ldriver.findElement(By.id("input-lastname"));
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
        return this;
    }

    public registrationPage enterEmail(String email) {
        WebElement emailField = ldriver.findElement(By.id("input-email"));
        emailField.clear();
        emailField.sendKeys(email);
        return this;
    }

    public registrationPage enterTelephone(String telephone) {
        WebElement telephoneField = ldriver.findElement(By.id("input-telephone"));
        telephoneField.clear();
        telephoneField.sendKeys(telephone);
        return this;
    }

    public registrationPage enterPassword(String password) {
        WebElement passwordField = ldriver.findElement(By.id("input-password"));
        passwordField.clear();
        passwordField.sendKeys(password);
        return this;
    }

    public registrationPage enterConfirmPassword(String confirmPassword) {
        WebElement confirmPasswordField = ldriver.findElement(By.id("input-confirm"));
        confirmPasswordField.clear();
        confirmPasswordField.sendKeys(confirmPassword);
        return this;
    }

    public registrationPage agreeToPrivacyPolicy() {
        WebElement privacyPolicyCheckbox = ldriver.findElement(By.name("agree"));
        privacyPolicyCheckbox.click();
        return this;
    }

    public void submitRegistration() {
        WebElement continueButton = ldriver.findElement(By.cssSelector("input[type='submit'][value='Continue']"));
        continueButton.click();
    }

}
