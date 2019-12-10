package wagwalking;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected static WebDriver driver;
    protected HomePage homePage;
    protected ApplyPage applyPage;
    protected LoginPage loginPage;
    protected WagTagPage wagTagPage;
    protected OrderPage orderPage;

    protected static User user;

    protected static User user1;

    protected static User user2;

    @BeforeClass
    public static void start() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://wagwalking.com");
        String actualTitle = driver.getTitle();

        String expectedTitle = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";
        Assert.assertEquals(expectedTitle, actualTitle);

        user = new User("testing@yahoo.com", "RQWE123!#", "Ivan", "Smith", "" +
                "3471234567");
        user1 = new User("123456", "RFQWSD123!@","Sam","8549873","ggggg");

        user2 = new User("intel_centrino@bk.ru", "TSLA@2019", "Sam", "Smith",
                "123456789");
    }
//    @AfterClass
//    public static void finish() {
//        driver.quit();
//    }
}
