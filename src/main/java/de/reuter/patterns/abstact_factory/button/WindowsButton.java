package de.reuter.patterns.abstact_factory.button;

import de.reuter.patterns.abstact_factory.button.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("this is a Windows Button!");
    }
}
