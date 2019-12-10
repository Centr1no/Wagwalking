package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.Wait;

import java.util.logging.Logger;

public class ApplyExistingUser extends BaseTest {

    private static Logger log = Logger.getLogger(ApplyExistingUser.class.getName());

    @Test
    public void clickFields() {
        HomePage homePage = new HomePage(driver);
//        homePage.clickBookFirstWalkFreeButton();

//        ApplyPage applyPage = new ApplyPage(driver);

        applyPage.inputFields("alex@gmail.com", "RFCGH!@#12", "Alex", "SFDHDGdf",
                "3470194824");

     //  Thread.sleep(3000);

       String email = applyPage.getEmail();
        Assert.assertEquals("alex@gmail.com", email);

        Assert.assertEquals("Alex", applyPage.getFirstNameField());
        Assert.assertEquals("SFDHDGdf", applyPage.getLastNameField());
        Assert.assertEquals("(347) 019-4824", applyPage.getPhone());

        applyPage.showPassword();

        Assert.assertEquals("RFCGH!@#12", applyPage.showPasswordString());

        applyPage.clickNextButton();
        Assert.assertEquals("Email address already registered", applyPage.getErrorMes());

        applyPage.emailFieldClear("NewEmail@gmail.com");

        Assert.assertEquals("NewEmail@gmail.com", applyPage.getEmail());
    }
}
