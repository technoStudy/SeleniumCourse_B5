package Day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Navigating {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        // Navigate to website and wait until it's load
        driver.get("https://www.google.com/");

        // Thread.sleep forces selenium to wait!!
        Thread.sleep(3000);

        driver.get("https://www.facebook.com/");

        // navigate().to() method is not waiting until website is load!!
        // driver.navigate().to("https://www.google.com/");

        // navigate().back() method will navigate to previous page
        driver.navigate().back();

        // navigate().forward() method navigates to forward page
        driver.navigate().forward();

        // refresh the page
        driver.navigate().refresh();

    }

}
