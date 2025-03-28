//2. Запрограммируйте Drag&Drop с помощью Selenide.actions()
// - Откройте https://the-internet.herokuapp.com/drag_and_drop
//  - Перенесите прямоугольник А на место В
// - Проверьте, что прямоугольники действительно поменялись
// - В Selenide есть команда $(element).dragAndDrop($(to-element)),
// проверьте работает ли тест, если использовать её вместо actions()

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @Test
    void actions() {
     open("https://the-internet.herokuapp.com/drag_and_drop");
     SelenideElement letterA = $("#column-a");
     SelenideElement letterB = $("#column-b");
//     Selenide.actions()
//             .clickAndHold(letterA)
//             .moveToElement(letterB)
//             .release(letterA).perform();
     Selenide.actions().dragAndDrop(letterA, letterB).perform();
     $("#column-a").shouldHave(Condition.text("B"));
     $("#column-b").shouldHave(Condition.text("A"));
    }
}
