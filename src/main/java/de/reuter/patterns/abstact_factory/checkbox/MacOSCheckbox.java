package de.reuter.patterns.abstact_factory.checkbox;

public class MacOSCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("This is a Mac Checkbox!");
    }
}
