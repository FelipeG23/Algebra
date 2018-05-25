/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivelOcho;

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
public class NivelOchoController implements Initializable {

    @FXML
    private Label numeroOcho;

    @FXML
    private JFXTextField valorTres;

    @FXML
    private Label numeroSiete;

    @FXML
    private Label numeroDos;

    @FXML
    private JFXTextField valorDos;

    @FXML
    private Label numeroOnce;

    @FXML
    private JFXTextField valorOcho;

    @FXML
    private JFXTextField valorNueve;

    @FXML
    private Label numeroSeis;

    @FXML
    private Label numeroNueve;

    @FXML
    private JFXTextField valorUno;

    @FXML
    private Label numeroCuatro;

    @FXML
    private JFXTextField valorCinco;

    @FXML
    private JFXTextField valorSeis;

    @FXML
    private Label numeroUno;

    @FXML
    private Label numeroCinco;

    @FXML
    private Label numeroDiez;

    @FXML
    private Label numeroDoce;

    @FXML
    private JFXTextField valorSiete;

    @FXML
    private Label numeroTres;

    @FXML
    private JFXTextField valorCuatro;

    @FXML
    void comprobarResultado(ActionEvent event) {
        try {
            Integer resultadoUno = Integer.parseInt(numeroUno.getText()) * Integer.parseInt(numeroSiete.getText()) + Integer.parseInt(numeroDos.getText()) * Integer.parseInt(numeroDiez.getText());
            Integer resultadoDos = Integer.parseInt(numeroUno.getText()) * Integer.parseInt(numeroOcho.getText()) + Integer.parseInt(numeroDos.getText()) * Integer.parseInt(numeroOnce.getText());
            Integer resultadoTres = Integer.parseInt(numeroUno.getText()) * Integer.parseInt(numeroNueve.getText()) + Integer.parseInt(numeroDos.getText()) * Integer.parseInt(numeroDoce.getText());

            Integer resultadoCuatro = Integer.parseInt(numeroTres.getText()) * Integer.parseInt(numeroSiete.getText()) + Integer.parseInt(numeroCuatro.getText()) * Integer.parseInt(numeroDiez.getText());
            Integer resultadoCinco = Integer.parseInt(numeroTres.getText()) * Integer.parseInt(numeroOcho.getText()) + Integer.parseInt(numeroCuatro.getText()) * Integer.parseInt(numeroOnce.getText());
            Integer resultadoSeis = Integer.parseInt(numeroTres.getText()) * Integer.parseInt(numeroNueve.getText()) + Integer.parseInt(numeroCuatro.getText()) * Integer.parseInt(numeroDoce.getText());

            Integer resultadoSiete = Integer.parseInt(numeroCinco.getText()) * Integer.parseInt(numeroSiete.getText()) + Integer.parseInt(numeroSeis.getText()) * Integer.parseInt(numeroDiez.getText());
            Integer resultadoOcho = Integer.parseInt(numeroCinco.getText()) * Integer.parseInt(numeroOcho.getText()) + Integer.parseInt(numeroSeis.getText()) * Integer.parseInt(numeroOnce.getText());
            Integer resultadoNueve = Integer.parseInt(numeroCinco.getText()) * Integer.parseInt(numeroNueve.getText()) + Integer.parseInt(numeroSeis.getText()) * Integer.parseInt(numeroDoce.getText());

            if (resultadoUno.equals(Integer.parseInt(this.valorUno.getText()))
                    && resultadoDos.equals(Integer.parseInt(this.valorDos.getText()))
                    && resultadoTres.equals(Integer.parseInt(this.valorTres.getText()))
                    && resultadoCuatro.equals(Integer.parseInt(this.valorCuatro.getText()))
                    && resultadoCinco.equals(Integer.parseInt(this.valorCinco.getText()))
                    && resultadoSeis.equals(Integer.parseInt(this.valorSeis.getText()))
                    && resultadoSiete.equals(Integer.parseInt(this.valorSiete.getText()))
                    && resultadoOcho.equals(Integer.parseInt(this.valorOcho.getText()))
                    && resultadoNueve.equals(Integer.parseInt(this.valorNueve.getText()))) {

            }
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("/nivelNueve/nivelNueve.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setTitle("NIVEL NUEVE");
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
        Integer randomNum = ThreadLocalRandom.current().nextInt(1, 40 + 1);
        numeroUno.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 40 + 1);
        numeroDos.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 40 + 1);
        numeroTres.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 40 + 1);
        numeroCuatro.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 40 + 1);
        numeroCinco.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 40 + 1);
        numeroSeis.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 40 + 1);
        numeroSiete.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 40 + 1);
        numeroOcho.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 40 + 1);
        numeroNueve.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 40 + 1);
        numeroDiez.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 40 + 1);
        numeroOnce.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 40 + 1);
        numeroDoce.setText(randomNum.toString());
    }

}
