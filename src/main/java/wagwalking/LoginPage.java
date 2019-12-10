package wagwalking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver)
    {super(driver);}

    @FindBy(css = "input")
    private List<WebElement> inputFields;

    public void setEmailField(String email) {
        wait.until(ExpectedConditions.visibilityOf(inputFields.get(0)));
        inputFields.get(0).sendKeys(email);
    }
    public void setPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(inputFields.get(1)));
        inputFields.get(1).sendKeys(password);
    }
}

