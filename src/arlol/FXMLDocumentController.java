package arlol;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


/**
 * Class med liste over variabler (objekter der bruges), samt sammenkobling af databaselayer (med variablen db).
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
    
    DatabaseLayer db = new DatabaseLayer();
    
 /**
 * Funktioner til alle knapper, tekstfelter osv. i FXML-dokumentet.
 * ActionEvent er et klik på den enkelte knap.
 * Text.setText(db.championSelection("")) bruges til funktionerne i databaselayer, hvor de tilfældige valg foretages, og derefter ændres label'et.
 */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }      
    
    @FXML
    private void pickTop(ActionEvent event) {
        
        Text.setText(db.championSelection("Top"));
    }   
        
    @FXML
    private void pickJng(ActionEvent event) {
        
        Text.setText(db.championSelection("Jng"));
    }

    @FXML
    private void pickMid(ActionEvent event) {
        
        Text.setText(db.championSelection("Mid"));
    }

    @FXML
    private void pickBot(ActionEvent event) {
        
        Text.setText(db.championSelection("Bot"));
    }

    @FXML
    private void pickSup(ActionEvent event) {
        
        Text.setText(db.championSelection("Sup"));
    }

    @FXML
    private void pickIdc(ActionEvent event) {
       
       Text.setText(db.championSelectionIDC()); 
    }
                
}
