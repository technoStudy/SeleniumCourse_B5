package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _05_ActionsClass_HoverOver {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.myntra.com/");

        WebDriverWait wait = new WebDriverWait(driver, 5);
        Actions actions = new Actions(driver);

        WebElement homeAndLiving = driver.findElement(By.xpath("//a[text()='Home & Living']"));
        actions.moveToElement(homeAndLiving).perform();

        WebElement carpets = driver.findElement(By.xpath("//a[text()='Carpets']"));
        wait.until(ExpectedConditions.elementToBeClickable(carpets));
        carpets.click();

        WebElement beauty = driver.findElement(By.xpath("//a[text()='Beauty']"));
        actions.moveToElement(beauty).perform();

        WebElement perfume = driver.findElement(By.xpath("//a[text()='Perfume']"));
        wait.until(ExpectedConditions.elementToBeClickable(perfume));
        perfume.click();

        driver.quit();

    }

}
