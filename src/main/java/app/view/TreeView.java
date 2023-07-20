package main.java.app.view;

import java.util.List;

import main.java.app.model.Person;

public interface TreeView {
    void display();

    void displayChildren(List<Person> children);
    // Другие методы представления

    Object getChildren();
}
