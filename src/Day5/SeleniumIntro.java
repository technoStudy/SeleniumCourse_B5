package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

    public static void main(String[] args) {

        // Define driver type and driver path
        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        // Create a new Webdriver object
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to website
        driver.get("https://techno.study/");

        // Quit browser
        driver.quit();

    }

}
