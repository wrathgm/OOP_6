package main.java.app.presenter;

import main.java.app.model.Person;

public interface TreePresenter {
    void run();
    // Другие методы презентера

    void addPerson(Person person);

    void getChildren(Person parent);
}
