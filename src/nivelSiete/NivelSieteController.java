/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivelSiete;

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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Felipe
 */
public class NivelSieteController implements Initializable {

    @FXML
    private Label numeroOcho;

    @FXML
    private Label numeroSiete;

    @FXML
    private JFXTextField valorTres;

    @FXML
    private JFXTextField valorDos;

    @FXML
    private Label numeroDos;

    @FXML
    private Label numeroOnce;

    @FXML
    private Label numeroSeis;

    @FXML
    private Label numeroNueve;

    @FXML
    private JFXTextField valorUno;

    @FXML
    private Label numeroCuatro;

    @FXML
    private Label numeroUno;

    @FXML
    private Label numeroDoce;

    @FXML
    private Label numeroDiez;

    @FXML
    private Label numeroCinco;

    @FXML
    private JFXTextField valorCuatro;

    @FXML
    private Label numeroTres;

    @FXML
    void comprobarResultado(ActionEvent event) {
        try {
            Integer resultadoUno = Integer.parseInt(numeroUno.getText()) * Integer.parseInt(numeroSiete.getText()) + Integer.parseInt(numeroDos.getText()) * Integer.parseInt(numeroNueve.getText()) + Integer.parseInt(numeroTres.getText()) * Integer.parseInt(numeroOnce.getText());
            Integer resultadoDos = Integer.parseInt(numeroUno.getText()) * Integer.parseInt(numeroOcho.getText()) + Integer.parseInt(numeroDos.getText()) * Integer.parseInt(numeroDiez.getText()) + Integer.parseInt(numeroTres.getText()) * Integer.parseInt(numeroDoce.getText());
            Integer resultadoTres = Integer.parseInt(numeroCuatro.getText()) * Integer.parseInt(numeroSiete.getText()) + Integer.parseInt(numeroCinco.getText()) * Integer.parseInt(numeroNueve.getText()) + Integer.parseInt(numeroSeis.getText()) * Integer.parseInt(numeroOnce.getText());
            Integer resultadoCuatro = Integer.parseInt(numeroCuatro.getText()) * Integer.parseInt(numeroOcho.getText()) + Integer.parseInt(numeroCinco.getText()) * Integer.parseInt(numeroDiez.getText()) + Integer.parseInt(numeroSeis.getText()) * Integer.parseInt(numeroDoce.getText());

            if (resultadoUno.equals(Integer.parseInt(this.valorUno.getText()))
                    && resultadoDos.equals(Integer.parseInt(this.valorDos.getText()))
                    && resultadoTres.equals(Integer.parseInt(this.valorTres.getText()))
                    && resultadoCuatro.equals(Integer.parseInt(this.valorCuatro.getText()))) {

            }
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("/nivelOcho/nivelOcho.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setTitle("NIVEL OCHO");
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
        Integer randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        numeroUno.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        numeroDos.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        numeroTres.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        numeroCuatro.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        numeroCinco.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        numeroSeis.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        numeroSiete.setText(randomNum.toString());
    }

}
