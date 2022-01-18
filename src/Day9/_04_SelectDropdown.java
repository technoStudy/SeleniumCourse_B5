package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _04_SelectDropdown {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        WebElement daysDropdown = driver.findElement(By.id("select-demo"));

        Select selectDay = new Select(daysDropdown);
        selectDay.selectByVisibleText("Saturday");
        // selectDay.selectByIndex(4);
        // selectDay.selectByValue("Tuesday");

        driver.quit();

    }

}
