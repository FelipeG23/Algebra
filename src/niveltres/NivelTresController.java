/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niveltres;

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
import nivelCuatro.CuartoNivelController;

/**
 * FXML Controller class
 *
 * @author Felipe
 */
public class NivelTresController implements Initializable {

    @FXML
    private JFXTextField valorUno;

    @FXML
    private Label escalar;

    @FXML
    private Label numeroCuatro;

    @FXML
    private Label numeroUno;

    @FXML
    private JFXTextField valorTres;

    @FXML
    private Label numeroDos;

    @FXML
    private JFXTextField valorDos;

    @FXML
    private Label numeroTres;

    @FXML
    private JFXTextField valorCuatro;
    private Integer puntajeFinal = 0;

    public void recibirPuntaje(Integer puntajeAnt) {
        this.puntajeFinal = puntajeAnt;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Integer randomNum = ThreadLocalRandom.current().nextInt(1, 9 + 1);
        escalar.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        numeroUno.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        numeroDos.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        numeroTres.setText(randomNum.toString());
        randomNum = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        numeroCuatro.setText(randomNum.toString());
    }

    public void comprobarResultado(ActionEvent event) {
        try {
            Integer resultadoUno = Integer.parseInt(escalar.getText()) * Integer.parseInt(numeroUno.getText());
            Integer resultadoDos = Integer.parseInt(escalar.getText()) * Integer.parseInt(numeroDos.getText());
            Integer resultadoTres = Integer.parseInt(escalar.getText()) * Integer.parseInt(numeroTres.getText());
            Integer resultadoCuatro = Integer.parseInt(escalar.getText()) * Integer.parseInt(numeroCuatro.getText());

            if (resultadoUno.equals(Integer.parseInt(valorUno.getText()))
                    && resultadoDos.equals(Integer.parseInt(valorDos.getText()))
                    && resultadoTres.equals(Integer.parseInt(valorTres.getText()))
                    && resultadoCuatro.equals(Integer.parseInt(valorCuatro.getText()))) {

                puntajeFinal = puntajeFinal + 5;
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
            FXMLLoader fxml = new FXMLLoader(getClass().getResource("/nivelCuatro/cuartoNivel.fxml"));
            Parent root = (Parent) fxml.load();
            CuartoNivelController controlador = fxml.getController();
            controlador.recibirPuntaje(puntajeFinal);
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("NIVEL CUATRO");
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
