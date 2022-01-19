package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _05_ElementToBeClickable {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("http://demowebshop.tricentis.com/");

        WebElement registerButton = driver.findElement(By.cssSelector("a[href='/register']"));
        wait.until(ExpectedConditions.elementToBeClickable(registerButton));
        registerButton.click();

        driver.quit();

    }

}
