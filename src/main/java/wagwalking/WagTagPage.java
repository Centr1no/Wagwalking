package wagwalking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class WagTagPage extends BasePage {
    public WagTagPage(WebDriver driver) {
        super(driver);}

        @FindBy(css = ".sc-ifAKCX.gYtgOP")
         private List<WebElement> orderNowButton;

    public OrderPage clickOrderNowButton() {
        wait.until(ExpectedConditions.elementToBeClickable(orderNowButton.get(0)));
        orderNowButton.get(0).click();
        return new OrderPage(driver);
    }
}
