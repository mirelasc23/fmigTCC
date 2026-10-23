package component;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.io.InputStream;
import view.App;

public class BotaoHome extends VBox {
    @FXML private ImageView iconeHome;
    
    public BotaoHome() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/component/botao_home.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
            InputStream imageStream = getClass().getResourceAsStream("/image/Home.png");
            
            if (imageStream != null) {
                iconeHome.setImage(new Image(imageStream));
            } else {
                System.err.println("Icone home não foi encontrado no caminho informado!");
            }
        } catch (IOException exception) {
            throw new RuntimeException("Erro ao carregar o FXML do BotaoHome", exception);
        }
    }

    @FXML
    private void goToPrimary() throws IOException {
        App.setRoot("primary");
    }
}