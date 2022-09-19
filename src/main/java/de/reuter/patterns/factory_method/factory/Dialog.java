package de.reuter.patterns.factory_method.factory;

import de.reuter.patterns.factory_method.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
