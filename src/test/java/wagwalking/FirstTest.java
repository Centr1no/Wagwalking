package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void testFirst() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://wagwalking.com");
        String actualTitle = driver.getTitle();
//        System.out.println(actualTitle);
        String expectedTitle = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";
        Assert.assertEquals(expectedTitle, actualTitle);

        WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.yeXEn"));
        bookFirstWalkFreeButton.click();

        WebElement emailField = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        emailField.sendKeys("testing1323fffs@gmail.com");

        WebElement passwordField = driver.findElement(By.cssSelector("input[name = \"password\"]"));
        passwordField.sendKeys("1234RFCGTH");

        WebElement nameField = driver.findElement(By.cssSelector("input[name = \"firstName\"]"));
        nameField.sendKeys("Brodyaga");

        WebElement lastNameField = driver.findElement(By.cssSelector("input[name = \"lastName\"]"));
        lastNameField.sendKeys("Sharik");

        WebElement cellPhoneField = driver.findElement(By.cssSelector("input[name = \"phone\"]"));
        cellPhoneField.sendKeys("4450797715");

        WebElement nextButton = driver.findElement(By.cssSelector(".sc-htoDjs.hdXrdX"));
        nextButton.click();

    }
}
