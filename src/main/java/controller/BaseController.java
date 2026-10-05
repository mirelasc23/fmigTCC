package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import java.io.IOException;

public class BaseController {

    @FXML
    private BorderPane mainPane;

    // Método para trocar apenas o conteúdo do centro
    public void carregarTela(String fxmlPath) {
        try {
            Parent novaTela = FXMLLoader.load(getClass().getResource(fxmlPath));
            mainPane.setCenter(novaTela);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

