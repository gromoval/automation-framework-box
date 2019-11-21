package pages.html_elements;

import io.qameta.atlas.webdriver.extension.FindBy;
import ru.lanit.at.pages.annotations.Title;
import ru.lanit.at.pages.element.UIElement;

@Title(value = "Текстовое поле")
public interface TextArea extends UIElement {


    public interface WithTextArea extends UIElement {
        @FindBy(".//textarea")
        TextArea text();
    }
}
