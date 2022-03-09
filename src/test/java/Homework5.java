import Utils.Runner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Homework5 extends Runner {
    @Test
    public void iplus(){

        $(".cm-processed-form").shouldBe(Condition.visible,Duration.ofMillis(1000));
        $("#search_input").setValue("iphone");
        Assert.assertEquals($("#search_input").getValue(),"iphone");
        $(".ty-search-magnifier").click();
        sleep(1000);
        $("#det_img_499desktop").click();
        $("#button_cart_499").click();
        sleep(3000);

    }
    @Test
    public void iplus2(){
        SoftAssert softAssert = new SoftAssert();
        $(".ac-title").click();
        $(byText("რეგისტრაცია")).click();
        $(byName("user_data[firstname]")).setValue("Teona");
        softAssert.assertEquals($(byName("user_data[firstname]")).getValue(),"tete");
        $(byName("user_data[lastname]")).setValue("Kevlishvili");
        softAssert.assertEquals($(byName("user_data[lastname]")).getValue(),"kevl");
        $(byName("user_data[phone]")).setValue("+995598180289");
        $(byName("user_data[email]")).setValue("teokevlishvili123@gmail.com");
        $(byName("user_data[password1]")).setValue("password!123");
        softAssert.assertEquals($(byName("user_data[password1]")).getValue(),"password123");
        $(byName("user_data[password2]")).setValue("password!123");
        $(byName("dispatch[profiles.update]")).click();
        softAssert.assertAll();
        sleep(3000);

    }
}
