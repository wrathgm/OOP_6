package main.java.app.view;

import java.util.List;
import java.util.Scanner;

import main.java.app.model.Person;
import main.java.app.model.Tree;

public class UserInterface {
    private Tree<Person> personTree;

    public Tree<Person> getPersonTree() {
        return personTree;
    }

    public void setPersonTree(Tree<Person> personTree) {
        this.personTree = personTree;
    }

    public UserInterface(Tree<Person> personTree) {
        this.personTree = personTree;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            String command = scanner.nextLine();
            processCommand(command);

            // Условие для выхода из цикла
            if (command.equals("exit")) {
                running = false;
            }
        }

        scanner.close();
    }

    private void processCommand(String command) {
        // Логика обработки команды пользователя
    }

    private void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add person");
        System.out.println("2. Display children");
        System.out.println("3. Exit");
        System.out.print("Enter command: ");
    }

    public Person getSelectedPerson() {
        return null;
    }

    public void displayChildren(List<Person> children) {
    }

    public void display() {
    }
}
