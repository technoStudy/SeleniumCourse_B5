package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class _01_SwitchToWindow {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://techno.study/");

        // Get the original window handle (parent window handle) so we can switch back easily!
        String originalWindowHandle = driver.getWindowHandle();

        WebElement freeConsultingButton = driver.findElement(By.xpath("//div[@class='t228__right_buttons_but']//a"));
        freeConsultingButton.click();

        // Get all window handles and using for each loop switch to another window
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
        }

        WebElement inputEmail = driver.findElement(By.xpath("(//input[@name='Email'])[3]"));
        inputEmail.sendKeys("test@test.com");

        WebElement inputName = driver.findElement(By.xpath("(//input[@name='Name'])[3]"));
        inputName.sendKeys("Test User");

        WebElement inputPhoneNumber = driver.findElement(By.xpath("//input[@class='t-input t-input-phonemask']"));
        inputPhoneNumber.sendKeys("0000000000");

        // Switch back to original window
        driver.switchTo().window(originalWindowHandle);

        WebElement sdetCourseButton = driver.findElement(By.xpath("//a[text()='SDET course']"));
        sdetCourseButton.click();

    }

}
