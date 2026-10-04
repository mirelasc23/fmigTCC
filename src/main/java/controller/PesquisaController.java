package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class PesquisaController {

    @FXML private TextField txtNome;
    @FXML private ToggleGroup tgSo;
    @FXML private ToggleGroup tgLinguagem;
    @FXML private CheckBox chkFrequencia;
    @FXML private CheckBox chkGosto;

    @FXML
    private void handleSubmeter(ActionEvent event) {
        System.out.println("\t\tResultado da pesquisa para \"" + txtNome.getText() + "\"\n");

        // Verificação do Sistema Operacional
        ToggleButton tbSo = (ToggleButton) tgSo.getSelectedToggle();
        System.out.print("Sistema Operacional predileto: ");
        System.out.println(tbSo == null ? "Não selecionado." : tbSo.getText());

        // Verificação da Linguagem de Programação
        RadioButton rbLinguagem = (RadioButton) tgLinguagem.getSelectedToggle();
        System.out.print("Linguagem de programação: ");
        System.out.println(rbLinguagem == null ? "Não selecionada." : rbLinguagem.getText());

        // Verificação de Frequência
        System.out.println((chkFrequencia.isSelected() ? "P" : "Não p") + "rograma todo dia.");

        // Verificação de Preferência (3 estados: Sim, Não, Indeterminado)
        System.out.print("Gosta de programação: ");
        if (chkGosto.isIndeterminate()) {
            System.out.println("Não respondido.");
        } else if (chkGosto.isSelected()) {
            System.out.println("Sim.");
        } else {
            System.out.println("Não.");
        }

        System.out.println("\n\n");
    }
}