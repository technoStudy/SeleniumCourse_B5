package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;


public class _04_SwitchWindowTask {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://techno.study/");

        String parentWindowHandle = driver.getWindowHandle();

        WebElement facebookButton = driver.findElement(By.xpath("//div[@class='t228__right_social_links_item']//a"));
        facebookButton.click();

        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
        }

        String newWindowURL = driver.getCurrentUrl();
        System.out.println("New Window URL: " + newWindowURL);

        driver.close();

        driver.switchTo().window(parentWindowHandle);

        String parentWindowURL = driver.getCurrentUrl();
        System.out.println("Parent URL: " + parentWindowURL);

        driver.quit();

    }

}
