import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class WikiFind {
    @Test
    void WikiSelenide () {
    //Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
    //Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
    //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-pages-filter").setValue("soft");
        $("a[href='/selenide/selenide/wiki/SoftAssertions']").shouldHave(text("Soft assertions"));
    //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
    }
}





//        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
//        $$("div.markdown-body ul li a").findBy(text("Soft assertions")).shouldBe(Condition.visible);
//        Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
//        $$("div.markdown-body ul li a").findBy(text("Soft assertions")).click();
