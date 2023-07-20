package main.java.app.presenter;

import main.java.app.model.Person;
import main.java.app.model.PersonRepository;
import main.java.app.model.TreeModel;
import main.java.app.utils.FileHandler;
import main.java.app.view.TreeView;

public class TreePresenterImpl implements TreePresenter {

    public TreePresenterImpl(PersonRepository personRepository, TreeView treeView, FileHandler fileHandler) {
    }

    public TreePresenterImpl(TreeModel treeModel, TreeView treeView, FileHandler fileHandler) {
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
    // Код класса TreePresenterImpl

    @Override
    public void addPerson(Person person) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addPerson'");
    }

    @Override
    public void getChildren(Person parent) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChildren'");
    }
}
