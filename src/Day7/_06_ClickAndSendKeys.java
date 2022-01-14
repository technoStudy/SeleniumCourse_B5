package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_ClickAndSendKeys {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        Thread.sleep(3000);

        WebElement closePopUpButton = driver.findElement(By.id("at-cv-lightbox-close"));
        closePopUpButton.click(); // click button is used to perform click action

        Thread.sleep(3000);

        String message = "Hello World!";
        WebElement messageInput = driver.findElement(By.cssSelector("input[id='user-message']"));
        messageInput.sendKeys(message); // sendKeys method is used to perform typing something in an input field!

        Thread.sleep(3000);

        WebElement showMessageButton = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        showMessageButton.click();

        Thread.sleep(3000);

        WebElement displayMessage = driver.findElement(By.id("display"));
        String displayedText = displayMessage.getText();

        if (message.equals(displayedText))
            System.out.println("Success!!");
        else
            System.out.println("Failure!!!");

        driver.quit();

    }

}
