package main.java.app.utils;

import java.util.List;

import main.java.app.model.Person;

public interface FileHandler {
    void saveToFile(List<Person> tree, String fileName);

    List<Person> loadFromFile(String fileName);
}
