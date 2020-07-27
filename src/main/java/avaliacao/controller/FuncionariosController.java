/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class FuncionariosController implements Initializable {

    @FXML
    private AnchorPane anchorPnlParent;
    @FXML
    private Label lblAvalie;

    @FXML
    private AnchorPane anchorPnlFuncionario1;
    @FXML
    private ImageView imgViewFoto1;
    @FXML
    private Label lblNome1;

    @FXML
    private AnchorPane anchorPnlFuncionario2;
    @FXML
    private ImageView imgViewFoto2;
    @FXML
    private Label lblNome2;

    @FXML
    private AnchorPane anchorPnlFuncionario3;
    @FXML
    private ImageView imgViewFoto3;
    @FXML
    private Label lblNome3;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void votarFuncionario1(MouseEvent event) {
    }

    @FXML
    private void votarFuncionario2(MouseEvent event) {
    }

    @FXML
    private void votarFuncionario3(MouseEvent event) {
    }

    @FXML
    private void previous(ActionEvent event) {
    }

    @FXML
    private void next(ActionEvent event) {
    }

}
