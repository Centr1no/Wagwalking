package wagwalking;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ApplyPage extends BasePage {
    public ApplyPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "input[name=\"email\"]")
    private WebElement emailField;

    @FindBy(css = "input[name=\"password\"]")
    private WebElement passwordField;

    @FindBy(css = "input[name=\"firstName\"]")
    private WebElement firstNameField;

    @FindBy(css = "input[name=\"lastName\"]")
    private WebElement lastNameField;

    @FindBy(css = "input[name=\"phone\"]")
    private WebElement phoneField;

    @FindBy(css = "input")
    private List<WebElement> inputFields;

    /*
    [0] - email
    [1] password
     */

//    public void inputEmail(String email) {
//        emailField.sendKeys(email);
//    }
//
//    public void inputPassword(String password) {
//        passwordField.sendKeys(password);
//    }

    public void inputFields(String email, String password, String firstName, String lastName, String cellPhone)
    {inputFields.get(0).sendKeys(email); inputFields.get(1).sendKeys(password); inputFields.get(2).sendKeys(firstName);
    inputFields.get(3).sendKeys(lastName); inputFields.get(4).sendKeys(cellPhone);}

    public String emailFieldClear(String newEmail){
        emailField.sendKeys(Keys.chord(Keys.CONTROL, "a"), newEmail);
        return emailField.getAttribute("value");
    }

    public void emailFieldClick(){
        emailField.click();
    }

    public void inputNewEmail(String email){
        emailField.sendKeys(email);
    }

    public void inputFieldsClick()
    {inputFields.get(0).click(); inputFields.get(2).click(); inputFields.get(3).click(); inputFields.get(4).click();
    inputFields.get(1).click();}

    // getting 'required' text from the text in the case of an error message
    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private List<WebElement> getInputFieldsText;

    public String receiveText() {
        return getInputFieldsText.get(0).getText();
    }
    @FindBy(css = ".sc-gzVnrw.jvIbBW")
    private WebElement nextButton;

    public void clickNextButton () {
        nextButton.click();
    }
    @FindBy (css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private WebElement errorMsg;

    public String getErrorMessage() {
        return errorMsg.getText();
    }

    @FindBy(css = ".sc-bdVaJa.sc-iwsKbI.kOShw")
    private WebElement errorMes;

    @FindBy(css= ".sc-dnqmqq.fHWHUY")
    private WebElement showPassword;

    public String getErrorMes() {
        wait.until(ExpectedConditions.visibilityOf(errorMes));
        return errorMes.getText();
    }

    public String getEmail() {
        wait.until(ExpectedConditions.visibilityOf(emailField));
        String email = emailField.getAttribute("value");
        return email;
    }
    public String getFirstNameField() {
        wait.until(ExpectedConditions.visibilityOf(firstNameField));
                return firstNameField.getAttribute("value");
    }
    public String getLastNameField() {
        wait.until(ExpectedConditions.visibilityOf(lastNameField));
        return lastNameField.getAttribute("value");
    }

    public String getPhone() {
        wait.until(ExpectedConditions.visibilityOf(phoneField));
        return phoneField.getAttribute("value");
    }
    public void showPassword(){
        showPassword.click();
    }
    public String showPasswordString() {
        return passwordField.getAttribute("value");
    }
}
