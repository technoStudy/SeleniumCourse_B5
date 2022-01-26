package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class _03_SwitchingMultipleWindows {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://techno.study/");

        List<String> windowHandlesList = new ArrayList<>();

        windowHandlesList.add(driver.getWindowHandle());

        WebElement freeConsultingButton = driver.findElement(By.xpath("//div[@class='t228__right_buttons_but']//a"));
        freeConsultingButton.click();

        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!windowHandlesList.contains(handle))
                windowHandlesList.add(handle);
        }

        WebElement enrollNowButton = driver.findElement(By.xpath("(//div[@class='t228__right_buttons_but']//a)[2]"));
        enrollNowButton.click();

        Set<String> windowHandles2 = driver.getWindowHandles();
        for (String handle : windowHandles2) {
            if (!windowHandlesList.contains(handle))
                windowHandlesList.add(handle);
        }

        driver.switchTo().window(windowHandlesList.get(2));

        driver.switchTo().window(windowHandlesList.get(0));

        driver.switchTo().window(windowHandlesList.get(1));

    }

}
