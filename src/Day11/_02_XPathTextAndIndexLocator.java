package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _02_XPathTextAndIndexLocator {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://techno.study/");

        // Locating elements using their text
        WebElement header = driver.findElement(By.xpath("//p[text()='Learn skills to launch a tech career in 6 months']"));
        String headerText = header.getText();

        // Locating elements using contains (contains can work with text or attributes)
        WebElement header2 = driver.findElement(By.xpath("//p[contains(text(),'mentorship')]"));
        String headerText2 = header2.getText();

        // In Xpath we can move from parent to child using double slash //
        WebElement anotherHeader = driver.findElement(By.xpath("//div[@class='t181__wrapper']//p"));

        // In XPath we can move from child to parent using /..
        WebElement divElement = driver.findElement(By.xpath("//input[@name='Email']/.."));
        String divElementsAttribute = divElement.getAttribute("class");

        // Locating element by index
        // When your locator finds more than 1 elements you can use index to select specific one
        WebElement sdetCourseLink = driver.findElement(By.xpath("(//a[text()='SDET course'])[3]"));
        sdetCourseLink.click();

        System.out.println(headerText);
        System.out.println(headerText2);
        System.out.println(divElementsAttribute);

    }

}
