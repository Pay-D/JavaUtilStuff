package de.reuter.patterns.abstact_factory;

import de.reuter.patterns.abstact_factory.factorys.GUIFactory;
import de.reuter.patterns.abstact_factory.factorys.MacOSGUIFactory;
import de.reuter.patterns.abstact_factory.factorys.WindowsGUIFactory;

public class Demo {

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

    public static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osname = System.getProperty("os.name").toLowerCase();
        if(osname.contains("mac")) {
            factory = new MacOSGUIFactory();
        }else {
            factory = new WindowsGUIFactory();
        }
        app = new Application(factory);
        return app;
    }
}
