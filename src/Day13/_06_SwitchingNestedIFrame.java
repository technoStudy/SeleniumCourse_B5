package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_SwitchingNestedIFrame {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame("frame1");

        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("Hello");

        driver.switchTo().frame("frame3");

        WebElement checkbox = driver.findElement(By.id("a"));
        checkbox.click();

        driver.switchTo().defaultContent(); // switch to very top (not only 1 frame)

        WebElement uiPathButton = driver.findElement(By.xpath("//a[text()='UiPath']"));
        uiPathButton.click();

    }

}
