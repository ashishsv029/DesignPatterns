package org.designpatterns.creational.abstract_factory_6.example2;

/*
Context:-
Imagine you're developing a cross-platform GUI application that needs to work on both Windows and MacOS.
You want to create UI elements like buttons and checkboxes, but the implementation for these elements is different on each platform.
The Abstract Factory pattern can help you create these UI components without coupling your code to specific platform implementations.

 */


public interface GUIFactory {
    Button createButton();
    CheckBox createCheckbox();
}
