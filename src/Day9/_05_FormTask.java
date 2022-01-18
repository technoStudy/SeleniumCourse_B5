package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class _05_FormTask {

    // ---    TASK    ---
    // Navigate https://www.facebook.com/
    // Click on Create New Account button
    // Fill the form
    // Get text for Sign Up button


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        WebElement createAccountButton = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createAccountButton.click();

        WebElement firstNameInput = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstNameInput.sendKeys("Steven");

        WebElement lastNameInput = driver.findElement(By.cssSelector("input[name='lastname']"));
        lastNameInput.sendKeys("Russo");

        WebElement emailInput = driver.findElement(By.cssSelector("input[name='reg_email__']"));
        emailInput.sendKeys("test@technostudy.com");

        WebElement emailConfirmInput = driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
        emailConfirmInput.sendKeys("test@technostudy.com");

        WebElement passwordInput = driver.findElement(By.cssSelector("input[name='reg_passwd__']"));
        passwordInput.sendKeys("1234567890abc!");

        WebElement monthDropdown = driver.findElement(By.id("month"));
        Select month = new Select(monthDropdown);
        month.selectByValue("12");

        WebElement dayDropdown = driver.findElement(By.id("day"));
        Select day = new Select(dayDropdown);
        day.selectByIndex(10);

        WebElement yearDropdown = driver.findElement(By.id("year"));
        Select year = new Select(yearDropdown);
        year.selectByVisibleText("1990");

        WebElement maleOptionRadio = driver.findElement(By.cssSelector("input[value='2']"));
        maleOptionRadio.click();

        String signUpText = driver.findElement(By.cssSelector("button[name='websubmit']")).getText();
        System.out.println(signUpText);

        driver.quit();

    }


}
