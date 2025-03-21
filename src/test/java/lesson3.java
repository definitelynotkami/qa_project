import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class lesson3 {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void fillFormTest() {
    open("/automation-practice-form");

    $("#firstName").setValue("Max");
    $("#lastName").setValue("Payne");
    $("#userEmail").setValue("maxpayne@gmail.com");
    $("label[for='gender-radio-1']").click();
    $("#userNumber").setValue("89170000000");

    $("#dateOfBirthInput").click();
    $(".react-datepicker__year-select").selectOption("1999");
    $(".react-datepicker__month-select").selectOption("October");
    $(".react-datepicker__day--008").click();

    $("#subjectsInput").setValue("Maths").pressEnter();
    $("label[for='hobbies-checkbox-1']").click();

    $("#uploadPicture").uploadFile(new File("/Users/kamilla/Desktop/capybara.jpg"));

    $("#currentAddress").setValue("г. Москва, ул. Тихомирная, д.1, кв 67");
    $("#react-select-3-input").setValue("NCR").pressEnter();
    $("#react-select-4-input").setValue("Delhi").pressEnter();
    $("#submit").click();

    $(".table-responsive").shouldHave(
            text("Max Payne"),
            text("maxpayne@gmail.com"),
            text("Male"),
            text("8917000000"),
            text("08 October,1999"),
            text("Maths"),
            text("Sports"),
            text("capybara.jpg"),
            text("г. Москва, ул. Тихомирная, д.1, кв 67"),
            text("NCR Delhi"));
    }
}
