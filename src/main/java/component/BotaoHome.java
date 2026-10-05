package component;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

import java.io.IOException;
import view.App;

public class BotaoHome extends VBox {
    public BotaoHome() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/component/botao_home.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException("Erro ao carregar o FXML do BotaoHome", exception);
        }
    }

    @FXML
    private void goToPrimary() throws IOException {
        App.setRoot("primary");
    }
}