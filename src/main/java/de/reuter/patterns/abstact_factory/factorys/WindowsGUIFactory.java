package de.reuter.patterns.abstact_factory.factorys;

import de.reuter.patterns.abstact_factory.button.Button;
import de.reuter.patterns.abstact_factory.checkbox.Checkbox;
import de.reuter.patterns.abstact_factory.button.WindowsButton;
import de.reuter.patterns.abstact_factory.checkbox.WindowsCheckbox;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
