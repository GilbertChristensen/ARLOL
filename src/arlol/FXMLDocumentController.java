/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arlol;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

/**
 *
 * @author gilbertchristensen
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button Top;
    @FXML
    private Button Jng;
    @FXML
    private Button Mid;
    @FXML
    private Button Bot;
    @FXML
    private Button Sup;
    @FXML
    private Button Idc;
    @FXML
    private Label Text;
    @FXML
    private ListView<String> championThing;
    
    DatabaseLayer db = new DatabaseLayer();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.championThing.setItems(this.db.championSelection());
    }      
    
    @FXML
    private void pickTop(ActionEvent event) {
    }   
        
    @FXML
    private void pickJng(ActionEvent event) {
    }

    @FXML
    private void pickMid(ActionEvent event) {
    }

    @FXML
    private void pickBot(ActionEvent event) {
    }

    @FXML
    private void pickSup(ActionEvent event) {
    }

    @FXML
    private void pickIdc(ActionEvent event) {
    }
    
            
}
