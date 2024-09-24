package org.designpatterns.creational.abstract_factory_6.example2.gui_factories_impl;

import org.designpatterns.creational.abstract_factory_6.example2.Button;
import org.designpatterns.creational.abstract_factory_6.example2.CheckBox;
import org.designpatterns.creational.abstract_factory_6.example2.GUIFactory;
import org.designpatterns.creational.abstract_factory_6.example2.buttons_impl.WindowsButton;
import org.designpatterns.creational.abstract_factory_6.example2.checkboxes_impl.WindowsCheckbox;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckbox();
    }
}
