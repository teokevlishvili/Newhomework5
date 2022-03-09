package Chrome;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Chromerunner {
    @BeforeTest
    public static void setUp(){
        Configuration.browser="chrome";
        Configuration.baseUrl="https://www.google.com/";
        System.setProperty("webdriver.chrome.driver","files/chromedriver.exe");
        Configuration.browserSize="1980x1020";
        Selenide.open("https://iplus.com.ge/");
    }
    @AfterTest
    public static void teardown (){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();

    }
}
