package Day13.EJunkieAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class _01_AddToCartAndRemoveFromCart {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://shopdemo.e-junkie.com/");

        WebElement addToCart_eBook = driver.findElement(By.xpath("//h4[text()='Demo eBook']/following-sibling::button"));
        addToCart_eBook.click();

        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        wait.until(ExpectedConditions.visibilityOf(iframe));
        driver.switchTo().frame(iframe);

        WebElement cartItemNo_iFrame = driver.findElement(By.xpath("//div[@class='Fixed-Actions Desktop-Only']//span"));

        if (cartItemNo_iFrame.getText().equals("1")) {
            System.out.println("There is 1 element in your cart!");
        } else {
            System.out.println("Number of elements in cart: " + cartItemNo_iFrame.getText());
            System.out.println("Test Fail!");
        }

        System.out.println("****************************");

        WebElement removeItemButton_iFrame = driver.findElement(By.className("Product-Remove"));
        removeItemButton_iFrame.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Your Cart is empty']")));

        WebElement continueShoppingButton_iFrame = driver.findElement(By.xpath("//button[text()='Continue Shopping']"));
        continueShoppingButton_iFrame.click();
        wait.until(ExpectedConditions.invisibilityOf(continueShoppingButton_iFrame));

        driver.switchTo().defaultContent();

        WebElement cartItemNo = driver.findElement(By.xpath("(//span[@id='cart_item_nos'])[2]"));
        wait.until(ExpectedConditions.visibilityOf(cartItemNo));

        if (cartItemNo.getText().equals("0")) {
            System.out.println("You have 0 item in your cart!");
            System.out.println("Success");
        } else {
            System.out.println("Fail!");
        }

        driver.quit();

    }

}
