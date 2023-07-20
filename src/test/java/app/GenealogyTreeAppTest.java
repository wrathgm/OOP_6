package app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.FileHandler;

import javax.swing.tree.TreeModel;

public class GenealogyTreeAppTest {

    private TreeModel treeModel;
    private TreeViewImpl treeView;
    private TreePresenterImpl treePresenter;

    @BeforeEach
    public void setUp() {
        FileHandlerImpl fileHandler = new FileHandlerImpl();
        treeModel = new TreeModel();
        treeView = new TreeViewImpl();
        treePresenter = new TreePresenterImpl(treeModel, treeView, fileHandler);
    }

    @Test
    public void testAddPerson() {
        Person person = new Person("John", "Doe", "01-01-1980", "M");
        treePresenter.addPerson(person);

        assertEquals(person, treeModel.getRoot());
    }

    private void assertEquals(Person person, Object root) {
    }

    @Test
    public void testGetChildren() {
        Person parent = new Person("John", "Doe", "01-01-1980", "M");
        Person child1 = new Person("Alice", "Doe", "01-02-2005", "F");
        Person child2 = new Person("Bob", "Doe", "05-05-2010", "M");

        ((TreePresenterImpl) treeModel).addPerson(parent);
        ((TreePresenterImpl) treeModel).addPerson(child1);
        ((TreePresenterImpl) treeModel).addPerson(child2);

        treePresenter.getChildren(parent);

        assertEquals(2, ((Object) treeView.getChildren()).size());
        assertTrue(((Object) treeView.getChildren()).contains(child1));
        assertTrue(((Object) treeView.getChildren()).contains(child2));
    }
}
