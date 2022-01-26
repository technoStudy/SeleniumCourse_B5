package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class _02_CloseWindow {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://techno.study/");

        // Get the original window handle (parent window handle) so we can switch back easily!
        String originalWindowHandle = driver.getWindowHandle();

        WebElement freeConsultingButton = driver.findElement(By.xpath("//div[@class='t228__right_buttons_but']//a"));
        freeConsultingButton.click();

        Thread.sleep(2000);

        // Get all window handles and using for each loop switch to another window
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
        }

        // close() method will close only the current window!!!!!
        // quit()  method will quit the browser (all windows and browser)
        driver.close();

        // Switch back to original window
        driver.switchTo().window(originalWindowHandle);

        WebElement sdetCourseButton = driver.findElement(By.xpath("//a[text()='SDET course']"));
        sdetCourseButton.click();

    }

}
