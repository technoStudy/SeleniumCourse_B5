package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionsClass_DragAndDrop {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement advanceSecurityButton = driver.findElement(By.id("details-button"));
        advanceSecurityButton.click();

        WebElement proceedToWebsiteButton = driver.findElement(By.id("proceed-link"));
        proceedToWebsiteButton.click();

        WebElement fiveThousandButton = driver.findElement(By.xpath("(//li[@id='fourth']//a)[2]"));

        WebElement debitAmountTarget = driver.findElement(By.id("amt7"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(fiveThousandButton, debitAmountTarget).perform();

        WebElement bankAccountButton = driver.findElement(By.xpath("//li[@id='credit2']//a"));

        WebElement debitAccountTarget = driver.findElement(By.id("bank"));

        actions.dragAndDrop(bankAccountButton, debitAccountTarget).perform();

        driver.quit();

    }

}
