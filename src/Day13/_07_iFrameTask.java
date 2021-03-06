package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _07_iFrameTask {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame("frame2");

        WebElement animalsDropdown = driver.findElement(By.id("animals"));

        Select select = new Select(animalsDropdown);
        select.selectByVisibleText("Avatar");

        driver.switchTo().defaultContent();

        WebElement homeButton = driver.findElement(By.id("head"));
        homeButton.click();

        driver.quit();

    }

}
