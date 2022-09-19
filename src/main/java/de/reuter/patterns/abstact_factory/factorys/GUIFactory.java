package de.reuter.patterns.abstact_factory.factorys;

import de.reuter.patterns.abstact_factory.button.Button;
import de.reuter.patterns.abstact_factory.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
