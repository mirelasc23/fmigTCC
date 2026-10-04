package controller;

import java.io.IOException;
import javafx.fxml.FXML;
import view.App;

public class PrimaryController {
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private void switchToTerciary() throws IOException {
        App.setRoot("terciary");
    }
}
