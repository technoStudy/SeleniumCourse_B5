package Day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Library/Selenium/geckodriver/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://campus.techno.study/");

        driver.quit();

    }

}
