package arlol;

import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Class til at koble databasen sammen med programmet.
 */

public class DatabaseLayer {
    
    Connection connection = null;
    
    public void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:"+Paths
                .get("")
                .toAbsolutePath()
                .toString()
            +"/src/arlol/ARLoL.db");
        } catch(SQLException e) {
           System.err.println(e.getMessage());
        }
    }

/**
 * Funktion til at finde en tilfældig Champion i databasen.
 * @param Lane Det valgte Lane fra den valgte knap i Controllor dokumentet.
 * @return Funktionen vil give resultatet result1, som vil blive brugt til den valgte knap.
 */
    public String championSelection(String Lane) {
 
    this.connect();
    String query = "SELECT Name, DMGtype, Difficulty, Lanes as \"Lane\" FROM  League_Table JOIN Lanes ON Lanes.id = League_Table.Id WHERE Lanes.Lanes = \"" + Lane + "\" ORDER BY RANDOM() LIMIT 1";
    String result1 = "";
    
    try {
        ResultSet result = connection
                .createStatement()
                .executeQuery(query);
        while(result.next()) {
           result1 = "Your chosen champion is " + result.getString("Name") +
                   ".\nThis champion has the difficulty " + result.getString("Difficulty") +
                   ". \nThe champion has the damagetype " + result.getString("DMGtype")+".";
        }
    } catch(SQLException ex) {
        
        }
    return result1;
    }
 
/**
 * Funktion til valg af tilfældig Champion. Samme princip som i forrige funktion med undtagelse af ændring i SQL-query. 
 * @return 
 */
    public String championSelectionIDC() {
 
    this.connect();
    String query = "SELECT Name, DMGtype, Difficulty, Lanes as \"Lane\" FROM  League_Table JOIN Lanes ON Lanes.id = League_Table.Id ORDER BY RANDOM() LIMIT 1";
    String result2 = "";
    
    try {
        ResultSet result = connection
                .createStatement()
                .executeQuery(query);
        while(result.next()) {
           result2 = "Your chosen champion is " + result.getString("Name") +
                   ".\nThis champion has the difficulty " + result.getString("Difficulty") +
                   ". \nThe champion has the damagetype " + result.getString("DMGtype")+".";
        }
    } catch(SQLException ex) {
        
        }
    return result2;
    }
    
}
