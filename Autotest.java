
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class Autotest {

    @Test
    public void myfirstautotest() {
        // sleep გავუწერე რადგან დავალებისთვის უფრო ლამაზი საყურებელია, ტესტირებისთვის არ გამოვიყენებ ხოლმე :D
        open("https://www.facebook.com/");
        $(byText("Create new account")).click();
        sleep(1000);
        $(byName("firstname")).setValue("shako");
        sleep(1000);
        $(byName("lastname")).setValue("sadunashvili");
        sleep(1000);
        $("select[name='birthday_month']").selectOption("May");
        sleep(1000);
        $("select[name='birthday_day']").selectOption("24");
        sleep(1000);
        $("select[name='birthday_year']").selectOption("1994");
        sleep(1000);
        $(byName("reg_email__")).setValue("sh.sadunashvili@gmail.com");
        sleep(1000);
        $(byCssSelector("input[name='sex'][value='-1']")).click();
        sleep(1000);
        $("select[name='preferred_pronoun']").selectOptionByValue("2");
        sleep(1000);
        $(byCssSelector("input[name='sex'][value='2']")).click();
        sleep(1000);
        $(byName("reg_passwd__")).setValue("Test1234@");
        sleep(1000);
//        $(byText("Sign Up")).sendKeys(Keys.ENTER);


    }
}



