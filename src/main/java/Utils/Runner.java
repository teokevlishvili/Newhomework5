package Utils;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import static com.codeborne.selenide.Selenide.open;

public class Runner {
    @BeforeTest
    public static void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        open("https://iplus.com.ge/");
    }}
