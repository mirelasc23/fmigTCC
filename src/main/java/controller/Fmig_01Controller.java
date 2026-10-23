package controller;

import java.io.IOException;
import javafx.fxml.FXML;
import view.App;

public class Fmig_01Controller {
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    @FXML
    private void switchToTerciary() throws IOException {
        App.setRoot("terciary");
    }
    
    @FXML
    private void goToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    @FXML
    private void fmig_02() throws IOException {
        App.setRoot("fmig_02");
    }
}