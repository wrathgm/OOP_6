package main.java.app;

import main.java.app.model.PersonRepository;
import main.java.app.presenter.TreePresenter;
import main.java.app.presenter.TreePresenterImpl;
import main.java.app.utils.FileHandlerImpl;
import main.java.app.view.TreeView;
import main.java.app.view.TreeViewImpl;

public class GenealogyTreeApp {
    public static void main(String[] args) {
        FileHandlerImpl fileHandler = new FileHandlerImpl();
        PersonRepository personRepository = new PersonRepository();
        TreeView treeView = new TreeViewImpl();
        TreePresenter treePresenter = new TreePresenterImpl(personRepository, treeView, fileHandler);

        treePresenter.run();
    }
}
