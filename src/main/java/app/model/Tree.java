package main.java.app.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tree<T> implements Iterable<T> {
    private T root;

    public T getRoot() {
        return root;
    }

    public void setRoot(T root) {
        this.root = root;
    }

    private List<T> elements;

    public Tree(T root) {
        this.root = root;
        this.elements = new ArrayList<>();
        this.elements.add(root);
    }

    public void addElement(T element) {
        elements.add(element);
    }

    public List<T> getChildren(T element) {
        List<T> children = new ArrayList<>();
        // Логика получения детей
        return children;
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }
}
