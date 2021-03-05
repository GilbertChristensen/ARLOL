/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arlol;

import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author gilbertchristensen
 */


public class DatabaseLayer {
    
    Connection connection = null;
    
    void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite"+Paths
                .get("")
                .toAbsolutePath()
                .toString()
            +"/src/arlol/ARLoL.db");
        } catch(SQLException e) {
           System.err.println(e.getMessage());
        }
    }
    
  public ObservableList championSelection() {
    this.connect();
    ObservableList championSelection = FXCollections.observableArrayList();
    String query = "SELECT * FROM League_Table";
    try {
        ResultSet result = connection
                .createStatement()
                .executeQuery(query);
        while(result.next()) {
            championSelection.add(result.getString("Name"));
        }
    } catch(SQLException ex) {
        
        }
    
        return championSelection;
    } 
  
}

