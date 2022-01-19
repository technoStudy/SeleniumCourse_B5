package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class _01_VisibilityOfElement {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        // Implicit wait cannot check visibility of element!
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        startButton.click();

        WebElement finishText = driver.findElement(By.id("finish"));
        wait.until(ExpectedConditions.visibilityOf(finishText));
        String result = finishText.getText();

        System.out.println(result);

        driver.quit();

    }

}
