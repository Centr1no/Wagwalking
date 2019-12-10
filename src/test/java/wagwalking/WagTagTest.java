package wagwalking;

import org.junit.Test;

public class WagTagTest extends BaseTest {

    @Test
    public void wagTagPageFill() {
        homePage = new HomePage(driver);
        wagTagPage = homePage.clickWagTagButton();
        orderPage = wagTagPage.clickOrderNowButton();

        orderPage.inputFirstName(user.getFirstName());
        orderPage.inputLastName("Smith");
        orderPage.inputEmail("test@gmail.com");
        orderPage.inputStreet("Kalmikova");
        orderPage.inputCity("NewYork");
        orderPage.inputApt("2F");
        orderPage.inputState("NY");
        orderPage.inputZipCode("11222");
        orderPage.inputCCnumber("1234123412341234");
        orderPage.inputExpDate("12/22");
        orderPage.inputCVC("366");

    }
}
