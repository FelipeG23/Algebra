/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivelDiez;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Felipe
 */
public class NivelDiezController implements Initializable {

    @FXML
    private Label numeroNueve;

    @FXML
    private Label numeroCuatro;

    @FXML
    private JFXTextField valorRespuesta;

    @FXML
    private Label numeroOcho;

    @FXML
    private Label numeroSiete;

    @FXML
    private Label numeroUno;

    @FXML
    private Label numeroDos;

    @FXML
    private Label numeroCinco;

    @FXML
    private Label numeroSeis;

    @FXML
    private Label numeroTres;
    Integer puntajeFinal = 0;

    public void recibirPuntaje(Integer puntajeAnt) {
        this.puntajeFinal = puntajeAnt;
    }

    @FXML
    void comprobarResultado(ActionEvent event) {
        try {

            Integer subUno = Integer.parseInt(numeroCinco.getText()) * Integer.parseInt(numeroNueve.getText()) - Integer.parseInt(numeroSeis.getText()) * Integer.parseInt(numeroOcho.getText());
            Integer subDos = Integer.parseInt(numeroCuatro.getText()) * Integer.parseInt(numeroNueve.getText()) - Integer.parseInt(numeroSeis.getText()) * Integer.parseInt(numeroSiete.getText());
            Integer subTres = Integer.parseInt(numeroCuatro.getText()) * Integer.parseInt(numeroOcho.getText()) - Integer.parseInt(numeroCinco.getText()) * Integer.parseInt(numeroSiete.getText());
            Integer resultado1 = Integer.parseInt(numeroUno.getText()) * subUno;
            Integer resultado2 = Integer.parseInt(numeroDos.getText()) * subDos;
            Integer resultado3 = Integer.parseInt(numeroTres.getText()) * subTres;

            Integer resultado = resultado1 - resultado2 + resultado3;

            if (resultado.equals(Integer.parseInt(valorRespuesta.getText()))) {
                puntajeFinal = puntajeFinal + 19;
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

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("EL PUNTAJE TOTAL ES DE " + puntajeFinal + " /100");
            alert.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Integer randomNum = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        numeroUno.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        numeroDos.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        numeroTres.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        numeroCuatro.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        numeroCinco.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        numeroSeis.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        numeroSiete.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        numeroOcho.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        numeroNueve.setText(randomNum.toString());
    }

}
