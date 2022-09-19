package de.reuter.patterns.abstact_factory.button;

import de.reuter.patterns.abstact_factory.button.Button;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("This is a Mac Button!");
    }
}
