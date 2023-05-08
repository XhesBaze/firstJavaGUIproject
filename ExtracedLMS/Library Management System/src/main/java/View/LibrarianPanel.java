package View;

import javafx.scene.layout.BorderPane;
import Controllers.Controller;
import Models.Person;

public class LibrarianPanel extends BorderPane {

    private Person person;
    public LibrarianPanel() {

        BillView billView = new BillView(Controller.books);
        billView.setUser(person);
        setCenter(billView);

    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
