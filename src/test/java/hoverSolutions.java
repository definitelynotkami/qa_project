import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

//1. На главной странице GitHub выберите меню Solutions -> Enterprize с помощью команды hover для Solutions.
//Убедитесь что загрузилась нужная страница (например что заголовок - "Build like the best."

        public class hoverSolutions {
    @Test
    void lesson5 () {
        open("https://github.com/home");
        $(".HeaderMenu").find(byText("Solutions")).hover();
        $("a[href='https://github.com/enterprise']").click();
        $("p.Primer_Brand__Text-module__Text___pecHN")
                .shouldHave(Condition.text("To build, scale, and deliver secure software."));
        sleep(2000);
    }
}
