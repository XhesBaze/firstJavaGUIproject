module src.librarymanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens src.librarymanagementsystem to javafx.fxml;
    exports View;
    opens View to javafx.fxml;
    exports UI;
    opens UI to javafx.fxml;
    exports helperClasses;
    opens helperClasses to javafx.fxml;
    exports Models;
}