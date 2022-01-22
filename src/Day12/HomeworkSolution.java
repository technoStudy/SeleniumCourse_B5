package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomeworkSolution {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement advanceSecurityButton = driver.findElement(By.id("details-button"));
        advanceSecurityButton.click();

        WebElement proceedToWebsiteButton = driver.findElement(By.id("proceed-link"));
        proceedToWebsiteButton.click();

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Steven");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Gerrard");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("s.gerrard@test.com");

        WebElement genderMale = driver.findElement(By.xpath("//label[text()='Male']"));
        genderMale.click();

        WebElement mobileNumber = driver.findElement(By.id("userNumber"));
        mobileNumber.sendKeys("1234567890");

        WebElement dateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirth.click();

        WebElement yearDropdown = driver.findElement(By.className("react-datepicker__year-select"));
        Select selectYear = new Select(yearDropdown);
        selectYear.selectByValue("1980");

        WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
        Select selectMonth = new Select(monthDropdown);
        selectMonth.selectByVisibleText("May");

        WebElement dayButton = driver.findElement(By.xpath("//div[contains(@aria-label, 'May 30th')]"));
        dayButton.click();

        WebElement subjectInput = driver.findElement(By.id("subjectsInput"));
        subjectInput.sendKeys("Computer Science");
        subjectInput.sendKeys(Keys.ENTER);
        subjectInput.sendKeys("English");
        subjectInput.sendKeys(Keys.ENTER);

        WebElement hobbiesSport = driver.findElement(By.xpath("//label[text()='Sports']"));
        hobbiesSport.click();

        WebElement address = driver.findElement(By.id("currentAddress"));
        address.sendKeys("Liverpool Avenue");

        WebElement stateInput = driver.findElement(By.id("react-select-3-input"));
        stateInput.sendKeys("Haryana");
        stateInput.sendKeys(Keys.ENTER);

        WebElement cityInput = driver.findElement(By.id("react-select-4-input"));
        cityInput.sendKeys("Karnal");
        cityInput.sendKeys(Keys.ENTER);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        driver.quit();

    }

}
