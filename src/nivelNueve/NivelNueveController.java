/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivelNueve;

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
import javafx.scene.control.Label;
import javafx.stage.Stage;
import nivelDiez.NivelDiezController;

/**
 * FXML Controller class
 *
 * @author Felipe
 */
public class NivelNueveController implements Initializable {

    @FXML
    private Label numeroCuatro;

    @FXML
    private JFXTextField resultadoInput;

    @FXML
    private Label numeroUno;

    @FXML
    private Label numeroDos;

    @FXML
    private Label numeroTres;
    Integer puntajeFinal = 0;

    public void recibirPuntaje(Integer puntajeAnt) {
        this.puntajeFinal = puntajeAnt;
    }

    @FXML
    void comprobarResultado(ActionEvent event) {
        try {
            Integer resultado = Integer.parseInt(numeroUno.getText()) * Integer.parseInt(numeroCuatro.getText()) - Integer.parseInt(numeroDos.getText()) * Integer.parseInt(numeroTres.getText());
            if (resultado.equals(Integer.parseInt(resultadoInput.getText()))) {
                puntajeFinal = puntajeFinal + 17;
                 Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Atención");
                alert.setHeaderText(null);
                alert.setContentText("Respuesta correcta!");

                alert.showAndWait();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Atención");
                alert.setHeaderText(null);
                alert.setContentText("Respuesta Incorrecta!");

                alert.showAndWait();
            }
            ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxml = new FXMLLoader(getClass().getResource("/nivelDiez/nivelDiez.fxml"));
            Parent root = (Parent) fxml.load();
            NivelDiezController controlador = fxml.getController();
            controlador.recibirPuntaje(puntajeFinal);
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);

            stage.setTitle("NIVEL DIEZ" );
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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

    }

}
