package de.reuter.patterns.factory_method.factory;

import de.reuter.patterns.factory_method.buttons.Button;
import de.reuter.patterns.factory_method.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
