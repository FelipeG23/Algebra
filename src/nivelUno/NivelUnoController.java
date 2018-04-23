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
import javafx.scene.control.Label;
import javafx.stage.Stage;

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

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setContentText("CORRECTO");
                alert.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
                Parent parent = FXMLLoader.load(getClass().getResource("/nivelDos/NivelDos.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(parent);
                stage.setScene(scene);
                stage.setTitle("NIVEL UNO");
                stage.show();
            } else {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setContentText("INCORRECTO");
                alert.show();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
