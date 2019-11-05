package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class maincontroller 
{
    @FXML
    private Label lblstatus;
    @FXML
    private TextField txtusername;
    @FXML
    private TextField txtpassword;
    
    public void Login(ActionEvent event) throws Exception
    {
        if(txtusername.getText().equals("Abhishek") && txtpassword.getText().equals("Doshi"))
        {
            lblstatus.setText("Login Success");
            Stage primaryStage=new Stage();
        Parent root=FXMLLoader.load(getClass().getResource("mainfxml.fxml"));
        Scene scene = new Scene(root, 300, 300);
       // scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
        }
        else
            lblstatus.setText("Login Failed");
    }
    public void exit(ActionEvent event)
    {
        System.exit(0);
    }
    
    
}
