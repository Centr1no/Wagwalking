package wagwalking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class OrderPage extends BasePage {
    public OrderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input")
    private List<WebElement> inputFields;

    public void inputFirstName(String name) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("input")));
        inputFields.get(0).sendKeys(name);
    }
    public void inputLastName(String lastName) {
        inputFields.get(1).sendKeys(lastName);
    }
    public void inputEmail(String email) {
        inputFields.get(2).sendKeys(email);
    }
    public void inputStreet(String street) {
        inputFields.get(3).sendKeys(street);
    }
    public void inputCity(String city) {
        inputFields.get(4).sendKeys(city);
    }
    public void inputApt(String apt) {
        inputFields.get(5).sendKeys(apt);
    }
    public void inputState(String state) {
        inputFields.get(6).sendKeys(state);
    }
    public void inputZipCode(String zipCode) {
        inputFields.get(7).sendKeys(zipCode);
    }
    public void inputCCnumber(String ccNumber) {
        inputFields.get(8).sendKeys(ccNumber);
    }
    public void inputExpDate(String expDate) {
        inputFields.get(9).sendKeys(expDate);
    }
    public void inputCVC(String cvc) {
        inputFields.get(10).sendKeys(cvc);
    }

}
