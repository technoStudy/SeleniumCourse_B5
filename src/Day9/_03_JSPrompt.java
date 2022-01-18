package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_JSPrompt {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        WebElement JSAlertButton = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        JSAlertButton.click();

        String alertInput = "TechnoStudy";
        driver.switchTo().alert().sendKeys(alertInput);
        driver.switchTo().alert().accept();

        String resultMessage = driver.findElement(By.id("result")).getText();

        if (resultMessage.contains(alertInput))
            System.out.println("Success!");
        else
            System.out.println("FAIL!");

        driver.quit();

    }

}
