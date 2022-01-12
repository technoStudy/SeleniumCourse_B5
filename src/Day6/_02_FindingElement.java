package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingElement {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://techno.study/");

        // Finding element by using ID
        WebElement locateElementByID = driver.findElement(By.id("rec370700164"));

        // Finding element by using Class Name
        WebElement locateElementByClassName = driver.findElement(By.className("t-container"));

        // Finding element by using Linked Text (For a tag elements only)
        WebElement locateElementByLinkText = driver.findElement(By.linkText("Home"));

        // Finding element by using Partial Link Text (For a tag elements only)
        WebElement locateElementByPartialLinkText = driver.findElement(By.partialLinkText("Mobile"));

        // Finding element by using Tag Name
        WebElement locateElementByTagName = driver.findElement(By.tagName("h3"));

        // Finding element by using CSS Selector
        WebElement locateElementByCssSelector = driver.findElement(By.cssSelector("div[class='t977__text']"));

        WebElement locateElementByCssSelector2 = driver.findElement(By.cssSelector(".t977__text"));

    }

}
