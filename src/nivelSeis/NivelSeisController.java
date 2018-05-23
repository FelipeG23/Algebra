/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivelSeis;

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
public class NivelSeisController implements Initializable {

    @FXML
    private Label numeroOcho;

    @FXML
    private JFXTextField valorTres;

    @FXML
    private Label numeroSiete;

    @FXML
    private JFXTextField valorDos;

    @FXML
    private Label numeroDieciOcho;

    @FXML
    private Label numeroCatorce;

    @FXML
    private JFXTextField valorCinco;

    @FXML
    private Label numeroDiecisiete;

    @FXML
    private Label numeroUno;

    @FXML
    private Label numeroDieciseis;

    @FXML
    private Label numeroTrece;

    @FXML
    private Label numeroCinco;

    @FXML
    private Label numeroDos;

    @FXML
    private Label numeroOnce;

    @FXML
    private JFXTextField valorNueve;

    @FXML
    private JFXTextField valorOcho;

    @FXML
    private Label numeroSeis;

    @FXML
    private Label numeroNueve;

    @FXML
    private JFXTextField valorUno;

    @FXML
    private Label numeroCuatro;

    @FXML
    private Label numeroQuince;

    @FXML
    private JFXTextField valorSeis;

    @FXML
    private Label numeroDiez;

    @FXML
    private Label numeroDoce;

    @FXML
    private JFXTextField valorSiete;

    @FXML
    private JFXTextField valorCuatro;

    @FXML
    private Label numeroTres;

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
        randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        numeroOcho.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        numeroNueve.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        numeroDiez.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        numeroOnce.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        numeroDoce.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        numeroTrece.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        numeroCatorce.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        numeroQuince.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        numeroDieciseis.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        numeroDiecisiete.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 50 + 1);
        numeroDieciOcho.setText(randomNum.toString());
    }

    @FXML
    void comprobarResultado(ActionEvent event) {
        try {
            Integer resultadoUno = Integer.parseInt(numeroUno.getText()) * Integer.parseInt(numeroDiez.getText()) + Integer.parseInt(numeroDos.getText()) * Integer.parseInt(numeroTrece.getText()) + Integer.parseInt(numeroTres.getText()) * Integer.parseInt(numeroDieciseis.getText());
            Integer resultadoDos = Integer.parseInt(numeroUno.getText()) * Integer.parseInt(numeroOnce.getText()) + Integer.parseInt(numeroDos.getText()) * Integer.parseInt(numeroCatorce.getText()) + Integer.parseInt(numeroTres.getText()) * Integer.parseInt(numeroDiecisiete.getText());
            Integer resultadoTres = Integer.parseInt(numeroUno.getText()) * Integer.parseInt(numeroDoce.getText()) + Integer.parseInt(numeroDos.getText()) * Integer.parseInt(numeroQuince.getText()) + Integer.parseInt(numeroTres.getText()) * Integer.parseInt(numeroDieciOcho.getText());

            Integer resultadoCuatro = Integer.parseInt(numeroCuatro.getText()) * Integer.parseInt(numeroDiez.getText()) + Integer.parseInt(numeroCinco.getText()) * Integer.parseInt(numeroTrece.getText()) + Integer.parseInt(numeroSeis.getText()) * Integer.parseInt(numeroDieciseis.getText());
            Integer resultadoCinco = Integer.parseInt(numeroCuatro.getText()) * Integer.parseInt(numeroOnce.getText()) + Integer.parseInt(numeroCinco.getText()) * Integer.parseInt(numeroCatorce.getText()) + Integer.parseInt(numeroSeis.getText()) * Integer.parseInt(numeroDiecisiete.getText());
            Integer resultadoSeis = Integer.parseInt(numeroCuatro.getText()) * Integer.parseInt(numeroDoce.getText()) + Integer.parseInt(numeroCinco.getText()) * Integer.parseInt(numeroQuince.getText()) + Integer.parseInt(numeroSeis.getText()) * Integer.parseInt(numeroDieciOcho.getText());

            Integer resultadoSiete = Integer.parseInt(numeroSiete.getText()) * Integer.parseInt(numeroDiez.getText()) + Integer.parseInt(numeroOcho.getText()) * Integer.parseInt(numeroTrece.getText()) + Integer.parseInt(numeroNueve.getText()) * Integer.parseInt(numeroDieciseis.getText());
            Integer resultadoOcho = Integer.parseInt(numeroSiete.getText()) * Integer.parseInt(numeroOnce.getText()) + Integer.parseInt(numeroOcho.getText()) * Integer.parseInt(numeroCatorce.getText()) + Integer.parseInt(numeroNueve.getText()) * Integer.parseInt(numeroDiecisiete.getText());
            Integer resultadoNueve = Integer.parseInt(numeroSiete.getText()) * Integer.parseInt(numeroDoce.getText()) + Integer.parseInt(numeroOcho.getText()) * Integer.parseInt(numeroQuince.getText()) + Integer.parseInt(numeroNueve.getText()) * Integer.parseInt(numeroDieciOcho.getText());
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
            Parent parent = FXMLLoader.load(getClass().getResource("/nivelSiete/nivelSiete.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setTitle("NIVEL SIETE");
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
