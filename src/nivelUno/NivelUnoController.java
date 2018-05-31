/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivelUno;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import nivelDos.NivelDosController;

/**
 * FXML Controller class
 *
 * @author Felipe
 */
public class NivelUnoController implements Initializable {

    @FXML
    private Label numeroUno;
    @FXML
    private Label numeroDos;
    @FXML
    private Label numeroTres;
    @FXML
    private Label numeroCuatro;
    @FXML
    private Label numeroCinco;
    @FXML
    private Label numeroSeis;
    @FXML
    private Label numeroSiete;
    @FXML
    private Label numeroOcho;
    @FXML
    private JFXTextField valorUno;
    @FXML
    private JFXTextField valorDos;
    @FXML
    private JFXTextField valorTres;
    @FXML
    private JFXTextField valorCuatro;

    Integer puntajeFinal = 0;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Integer randomNum = ThreadLocalRandom.current().nextInt(1, 80 + 1);
        numeroUno.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 80 + 1);
        numeroDos.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 80 + 1);
        numeroTres.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 80 + 1);
        numeroCuatro.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 80 + 1);
        numeroCinco.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 80 + 1);
        numeroSeis.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 80 + 1);
        numeroSiete.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 80 + 1);
        numeroOcho.setText(randomNum.toString());
    }

    public void comprobarResultado(ActionEvent event) {
        try {
            Integer resultadoUno = Integer.parseInt(numeroUno.getText()) + Integer.parseInt(numeroCinco.getText());
            Integer resultadoDos = Integer.parseInt(numeroDos.getText()) + Integer.parseInt(numeroSeis.getText());
            Integer resultadoTres = Integer.parseInt(numeroTres.getText()) + Integer.parseInt(numeroSiete.getText());
            Integer resultadoCuatro = Integer.parseInt(numeroCuatro.getText()) + Integer.parseInt(numeroOcho.getText());

            if (resultadoUno.equals(Integer.parseInt(this.valorUno.getText())) && resultadoDos.equals(Integer.parseInt(this.valorDos.getText()))
                    && resultadoTres.equals(Integer.parseInt(this.valorTres.getText())) && resultadoCuatro.equals(Integer.parseInt(this.valorCuatro.getText()))) {
                puntajeFinal = 1;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Atención");
                alert.setHeaderText(null);
                alert.setContentText("Respuesta correcta!");

                alert.showAndWait();
            } else {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Atención");
                alert.setHeaderText(null);
                alert.setContentText("Respuesta Incorrecta!");

                alert.showAndWait();
            }
            ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxml = new FXMLLoader(getClass().getResource("/nivelDos/NivelDos.fxml"));
            Parent root = (Parent) fxml.load();
            NivelDosController controlador = fxml.getController();
            controlador.recibirPuntaje(puntajeFinal);
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);

            stage.setTitle("NIVEL DOS");
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
