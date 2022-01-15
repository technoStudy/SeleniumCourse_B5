package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_getCssValue {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WebElement button = driver.findElement(By.cssSelector("#input-example>button"));

        String background = button.getCssValue("background-color");
        String textAlign = button.getCssValue("text-align");

        System.out.println("Background Color: " + background);
        System.out.println("Text Align: " + textAlign);

        driver.quit();

    }

}
