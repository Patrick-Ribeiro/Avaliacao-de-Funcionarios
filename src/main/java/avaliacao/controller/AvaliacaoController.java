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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class AvaliacaoController implements Initializable {

    @FXML
    private ImageView imgViewFoto;
    @FXML
    private Label lblNome;
    
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnEnviar;
    @FXML
    private TextArea textAreaObservacoes;
    
    @FXML
    private Button btnPessimo;
    @FXML
    private ImageView imgPessimo;
    
    @FXML
    private Button btnRuim;
    @FXML
    private ImageView imgRuim;
    
    @FXML
    private Button btnRegular;
    @FXML
    private ImageView imgRegular;
    
    @FXML
    private Button btnBom;
    @FXML
    private ImageView imgBom;
    
    @FXML
    private Button btnOtimo;
    @FXML
    private ImageView imgOtimo;

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
    private void voltar(ActionEvent event) {
    }

    @FXML
    private void enviarVoto(ActionEvent event) {
    }

    @FXML
    private void verificarTecla(KeyEvent event) {
    }

    @FXML
    private void setAvaliacaoPessimo(ActionEvent event) {
    }

    @FXML
    private void setAvaliacaoRuim(ActionEvent event) {
    }

    @FXML
    private void setAvaliacaoRegular(ActionEvent event) {
    }

    @FXML
    private void setAvaliacaoBom(ActionEvent event) {
    }

    @FXML
    private void setAvaliacaoOtimo(ActionEvent event) {
    }

}
