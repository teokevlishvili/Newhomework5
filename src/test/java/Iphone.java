import Utils.Runner;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Iphone extends Runner {
    @Test
    public void newiphone (){
        $(".item-icon").click();
        $(byText("iPhone 12")).click();
        $("#det_img_12desktop").click();
        $("#button_cart_12").click();
        sleep(3000);
        $(byText("კალათა")).click();
        $(byText("კალათის ნახვა")).click();
        $(byText("შეკვეთის განთავსება")).click();
        sleep(3000);



    }
}
