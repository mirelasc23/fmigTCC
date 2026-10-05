package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.image.Image;

/**
 * JavaFX App
 */
public class App extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("tela_inicial"), 640, 480);
        
        // --- ADICIONE ESTAS LINHAS PARA CARREGAR O CSS ---
        String cssPath = getClass().getResource("/css/style.css").toExternalForm();
        scene.getStylesheets().add(cssPath);
        // -------------------------------------------------
        
        // Define o título da janela
        stage.setTitle("Migração de Firewall");
        
        // EQUIVALENTE AO SETICONIMAGE EM JAVAFX:
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/image/logo_fmig.png")));
        
        stage.setScene(scene);
        stage.show();
    }
    
    /*@Override
    public void start(Stage palco) throws Exception {
        Parent raiz = FXMLLoader.load(getClass().getResource("pesquisa.fxml"));

        Scene cena = new Scene(raiz, 550, 280);
        palco.setTitle("Pesquisa sobre Programação");
        palco.setScene(cena);
        palco.show();
    }*/

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/fxml/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}