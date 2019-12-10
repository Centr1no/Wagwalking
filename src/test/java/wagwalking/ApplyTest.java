package wagwalking;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;

public class ApplyTest extends BaseTest {

    @Test
    public void testApply(){
        homePage = new HomePage(driver);
//        homePage.clickBookFirstWalkFreeButton();
//        applyPage = homePage.clickBookFirstWalkFreeButton();

//        ApplyPage applyPage = new ApplyPage(driver);
//        applyPage.inputEmail("jhbsdsd@gmail.com");

 //       applyPage.inputPassword("RFCWSQA123");

//        Testing all fields using collection
        applyPage.inputFields("testing@gmailhs9", "ASDE!@#123", "Sam", "Smith",
                "3478123857");

// Checking a required field
//        applyPage.inputFieldsClick();

        // Assert.assertEquals("required", applyPage.receiveText());

        Assert.assertEquals("please provide a valid email", applyPage.getErrorMes());
    }
}
