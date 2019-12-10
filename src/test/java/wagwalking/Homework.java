package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Homework extends BaseTest{
    @Test
    public void testHomework() {
        WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.yeXEn"));
        bookFirstWalkFreeButton.click();

        List<WebElement> inputFields = driver.findElements(By.cssSelector("input"));

        inputFields.get(0).sendKeys(user.getEmail());
        inputFields.get(2).sendKeys(user.getFirstName());
        inputFields.get(3).sendKeys(user.getLastName());
        inputFields.get(4).sendKeys(user.getPassword());
        inputFields.get(1).sendKeys(user.getPhone());

        List<WebElement> required = driver.findElements(By.cssSelector(".sc-bdVaJa.sc-iwsKbI.kOShw"));

        String expected = "required";

        for(int i = 0; i < required.size(); i++) {
            Assert.assertEquals(expected, required.get(i).getText());
            }
        }

    }

