package it.zuccante.pop3fxclient;

import java.io.IOException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    
    
    private Pop3Client p;
    private boolean isConnected;
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        int numOfMsg = 0;
        
        System.out.println("You clicked me!");
        
        if (isConnected) {
            try {
                numOfMsg = p.getNumOfMessages();
            } catch (IOException ex) {
                Logger.getLogger(FXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        label.setText(Integer.toString(numOfMsg) + " Messaggi");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        isConnected = false;
        try {
            // TODO
            p = new Pop3Client();
            isConnected = p.connect();
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(FXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
}
