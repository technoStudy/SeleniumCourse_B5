package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_JSConfirm {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        WebElement JSAlertButton = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
        JSAlertButton.click();

        driver.switchTo().alert().dismiss();

        String message = driver.findElement(By.id("result")).getText();

        if (message.equals("You clicked: Cancel"))
            System.out.println("Congrats! You handled Alert!");
        else
            System.out.println("FAIL!!!");

        driver.quit();

    }

}
