/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivelDos;

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

/**
 * FXML Controller class
 *
 * @author Felipe
 */
public class NivelDosController implements Initializable {

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
    private Label numeroNueve;
    @FXML
    private Label numeroDiez;
    @FXML
    private Label numeroOnce;
    @FXML
    private Label numeroDoce;
    @FXML
    private Label numeroTrece;
    @FXML
    private Label numeroCatorce;
    @FXML
    private Label numeroQuince;
    @FXML
    private Label numeroDieceseis;
    @FXML
    private Label numeroDiecesiete;
    @FXML
    private Label numeroDieceocho;
    @FXML
    private JFXTextField valorUno;
    @FXML
    private JFXTextField valorDos;
    @FXML
    private JFXTextField valorTres;
    @FXML
    private JFXTextField valorCuatro;
    @FXML
    private JFXTextField valorCinco;
    @FXML
    private JFXTextField valorSeis;
    @FXML
    private JFXTextField valorSiete;
    @FXML
    private JFXTextField valorOcho;
    @FXML
    private JFXTextField valorNueve;

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
        randomNum = ThreadLocalRandom.current().nextInt(1, 80 + 1);
        numeroNueve.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 80 + 1);
        numeroDiez.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 80 + 1);
        numeroOnce.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 80 + 1);
        numeroDoce.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 80 + 1);
        numeroTrece.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 80 + 1);
        numeroCatorce.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 80 + 1);
        numeroQuince.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 80 + 1);
        numeroDieceseis.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 80 + 1);
        numeroDiecesiete.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 80 + 1);
        numeroDieceocho.setText(randomNum.toString());
    }

    public void comprobarResultado(ActionEvent event) {
        try {
            Integer resultadoUno = Integer.parseInt(numeroUno.getText()) + Integer.parseInt(numeroDiez.getText());
            Integer resultadoDos = Integer.parseInt(numeroDos.getText()) + Integer.parseInt(numeroOnce.getText());
            Integer resultadoTres = Integer.parseInt(numeroTres.getText()) + Integer.parseInt(numeroDoce.getText());
            Integer resultadoCuatro = Integer.parseInt(numeroCuatro.getText()) + Integer.parseInt(numeroTrece.getText());
            Integer resultadoQuinto = Integer.parseInt(numeroCinco.getText()) + Integer.parseInt(numeroCatorce.getText());
            Integer resultadoSexto = Integer.parseInt(numeroSeis.getText()) + Integer.parseInt(numeroQuince.getText());
            Integer resultadoSeptimo = Integer.parseInt(numeroSiete.getText()) + Integer.parseInt(numeroDieceseis.getText());
            Integer resultadoOctavo = Integer.parseInt(numeroOcho.getText()) + Integer.parseInt(numeroDiecesiete.getText());
            Integer resultadoNoveno = Integer.parseInt(numeroNueve.getText()) + Integer.parseInt(numeroDieceocho.getText());

            if (resultadoUno.equals(Integer.parseInt(this.valorUno.getText()))
                    && resultadoDos.equals(Integer.parseInt(this.valorDos.getText()))
                    && resultadoTres.equals(Integer.parseInt(this.valorTres.getText()))
                    && resultadoCuatro.equals(Integer.parseInt(this.valorCuatro.getText()))
                    && resultadoQuinto.equals(Integer.parseInt(this.valorCinco.getText()))
                    && resultadoSexto.equals(Integer.parseInt(this.valorSeis.getText()))
                    && resultadoSeptimo.equals(Integer.parseInt(this.valorSiete.getText()))
                    && resultadoOctavo.equals(Integer.parseInt(this.valorOcho.getText()))
                    && resultadoNoveno.equals(Integer.parseInt(this.valorNueve.getText()))) {

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setContentText("CORRECTO");
                alert.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
                Parent parent = FXMLLoader.load(getClass().getResource("/niveltres/NivelTres.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(parent);
                stage.setScene(scene);
                stage.setTitle("NIVEL UNO");
                stage.show();
            }
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("/niveltres/NivelTres.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setTitle("NIVEL TRES");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
