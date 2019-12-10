package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SecondTest extends BaseTest{

    @Test
    public void testSecond () {

        WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.yeXEn"));
        bookFirstWalkFreeButton.click();

        List<WebElement> inputFields =  driver.findElements(By.cssSelector("input"));
        inputFields.get(0).sendKeys("jgesfgvj@gmail.com");
        inputFields.get(1).sendKeys("RFCLKJ123");
        inputFields.get(2).sendKeys("Sam");
        inputFields.get(3).sendKeys("Smith");
        inputFields.get(4).sendKeys("1238720371");

    }
}
