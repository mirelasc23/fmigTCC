package component;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class PasswordFieldRevelavelComponent extends HBox {

    @FXML private PasswordField passwordField;
    @FXML private TextField textField;
    @FXML private Button btnMostrarOcultar;

    public PasswordFieldRevelavelComponent() {
        // Carrega o FXML associado ao componente customizado
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PasswordFieldRevelavel.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    @FXML
    private void alternarVisibilidade() {
        if (passwordField.isVisible()) {
            textField.setText(passwordField.getText());
            
            passwordField.setVisible(false);
            passwordField.setManaged(false);
            textField.setVisible(true);
            textField.setManaged(true);
            
            btnMostrarOcultar.setText("🔒");
        } else {
            passwordField.setText(textField.getText());
            
            textField.setVisible(false);
            textField.setManaged(false);
            passwordField.setVisible(true);
            passwordField.setManaged(true);
            
            btnMostrarOcultar.setText("👁");
        }
    }

    /**
     * Retorna a senha atual digitada, independente de estar oculta ou visível.
     */
    public String getText() {
        return passwordField.isVisible() ? passwordField.getText() : textField.getText();
    }

    /**
     * Permite limpar o campo externamente.
     */
    public void clear() {
        passwordField.clear();
        textField.clear();
    }
    
    /**
     * Permite definir o prompt text externamente.
     */
    public void setPromptText(String promptText) {
        passwordField.setPromptText(promptText);
        textField.setPromptText(promptText);
    }
}
