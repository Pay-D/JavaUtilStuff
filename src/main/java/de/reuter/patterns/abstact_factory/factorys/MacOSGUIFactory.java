package de.reuter.patterns.abstact_factory.factorys;

import de.reuter.patterns.abstact_factory.button.Button;
import de.reuter.patterns.abstact_factory.checkbox.Checkbox;
import de.reuter.patterns.abstact_factory.button.MacOSButton;
import de.reuter.patterns.abstact_factory.checkbox.MacOSCheckbox;

public class MacOSGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
