package controller;

import java.io.IOException;
import javafx.fxml.FXML;
import view.App;

public class TelaInicialController {
    
    
    @FXML
    private void switchToSearch() throws IOException {
        App.setRoot("pesquisa");
    }
    
    @FXML
    private void handleSalvar() throws IOException {
        App.setRoot("pesquisa");
    }
    
    @FXML
    private void telaComScroll() throws IOException {
        App.setRoot("tela_com_scroll");
    }
}
