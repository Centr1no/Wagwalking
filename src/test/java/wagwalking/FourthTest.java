package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FourthTest extends BaseTest {
    @Test
    public void testFourth () {
        WebElement bookFirstWalkFreeButton = driver.findElement(By.cssSelector(".sc-ifAKCX.yeXEn"));
        bookFirstWalkFreeButton.click();

//   Creating collection of inputs and clicking them to cause an error message; Entering a wrong format email
        //and comparing it with an expected result

        List <WebElement> allFields = driver.findElements(By.cssSelector("input"));
        allFields.get(0).sendKeys(user1.getEmail());
        allFields.get(3).click();
        allFields.get(1).click();

        List<WebElement> error = driver.findElements(By.cssSelector(".sc-bdVaJa.sc-iwsKbI.kOShw"));
        Assert.assertEquals("please provide a valid email", error.get(0).getText());

//   Comparing an error message in the lastName field with an expected result

        Assert.assertEquals("required", error.get(1).getText());

//   Checking small text under a Password field and comparing it with an expected result

        List<WebElement> chars = driver.findElements(By.cssSelector(".sc-gzVnrw.fzplxK"));

        Assert.assertEquals("(8 Characters,", chars.get(0).getText());

        Assert.assertEquals("1 Letter,", chars.get(1).getText());

        Assert.assertEquals("1 Number)", chars.get(2).getText());
    }

}

