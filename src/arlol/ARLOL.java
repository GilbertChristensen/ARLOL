package arlol;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Class til at starte programmet med forskellige restriktioner (opsætning af vindue osv.).
 */
public class ARLOL extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        scene.getStylesheets().add(FXMLDocumentController.class.getResource("newCascadeStyleSheet.css").toExternalForm());
        
        stage.setScene(scene);        
        stage.setResizable(false);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
