package de.reuter.patterns.factory_method;

import de.reuter.patterns.factory_method.factory.Dialog;
import de.reuter.patterns.factory_method.factory.HtmlDialog;
import de.reuter.patterns.factory_method.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
