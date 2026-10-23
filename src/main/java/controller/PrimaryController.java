package controller;

import java.io.IOException;
import javafx.fxml.FXML;
import view.App;

public class PrimaryController {
    @FXML
    private void switchToSearch() throws IOException {
        App.setRoot("pesquisa");
    }
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private void switchToTerciary() throws IOException {
        App.setRoot("terciary");
    }
    
    @FXML
    private void fmig_01() throws IOException {
        App.setRoot("fmig_01");
    }
    
    @FXML
    private void fmig_02() throws IOException {
        App.setRoot("fmig_02");
    }
}
