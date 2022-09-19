package de.reuter.patterns.abstact_factory;

import de.reuter.patterns.abstact_factory.button.Button;
import de.reuter.patterns.abstact_factory.checkbox.Checkbox;
import de.reuter.patterns.abstact_factory.factorys.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
