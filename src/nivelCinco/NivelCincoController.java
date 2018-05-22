/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivelCinco;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Felipe
 */
public class NivelCincoController implements Initializable {

    @FXML
    private JFXTextField valorUno;

    @FXML
    private Label numeroCuatro;

    @FXML
    private Label numeroOcho;

    @FXML
    private Label numeroUno;

    @FXML
    private Label numeroSiete;

    @FXML
    private JFXTextField valorTres;

    @FXML
    private Label numeroDos;

    @FXML
    private JFXTextField valorDos;

    @FXML
    private Label numeroCinco;

    @FXML
    private Label numeroSeis;

    @FXML
    private Label numeroTres;

    @FXML
    private JFXTextField valorCuatro;

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
    }

    public void comprobarResultado(ActionEvent event) {
        try {
            Integer resultadoUno = Integer.parseInt(numeroUno.getText()) * Integer.parseInt(numeroCinco.getText()) + Integer.parseInt(numeroDos.getText()) * Integer.parseInt(numeroSiete.getText());
            Integer resultadoDos = Integer.parseInt(numeroUno.getText()) * Integer.parseInt(numeroSeis.getText()) + Integer.parseInt(numeroDos.getText()) * Integer.parseInt(numeroOcho.getText());
            Integer resultadoTres = Integer.parseInt(numeroTres.getText()) * Integer.parseInt(numeroCinco.getText()) + Integer.parseInt(numeroCuatro.getText()) * Integer.parseInt(numeroSiete.getText());
            Integer resultadoCuatro = Integer.parseInt(numeroTres.getText()) * Integer.parseInt(numeroSeis.getText()) + Integer.parseInt(numeroCuatro.getText()) * Integer.parseInt(numeroOcho.getText());
            if (resultadoUno.equals(Integer.parseInt(this.valorUno.getText())) && resultadoDos.equals(Integer.parseInt(this.valorDos.getText()))
                    && resultadoTres.equals(Integer.parseInt(this.valorTres.getText())) && resultadoCuatro.equals(Integer.parseInt(this.valorCuatro.getText()))) {
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
