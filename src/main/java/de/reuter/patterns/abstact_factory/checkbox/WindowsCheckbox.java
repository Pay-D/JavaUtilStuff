package de.reuter.patterns.abstact_factory.checkbox;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("This is a Windows Checkbox!");
    }
}
