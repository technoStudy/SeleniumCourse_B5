package Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {

     public static void main(String[] args) {

          System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

          WebDriver driver = new ChromeDriver();

          // Open a website
          driver.get("https://campus.techno.study");

          // write some code
          // do some actions

          driver.quit();

     }

}
