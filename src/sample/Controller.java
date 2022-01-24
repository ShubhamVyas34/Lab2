/*
* Name : Shubham Vyas
* Enroll : 200469159
* Description : This is controller class, which has the methods and objects of gui components
* Date : 1/22/2022
* Time : 20:00
* */


package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    //Object creations of the gui components
    @FXML
    private TextField nameTextBox;

    @FXML
    private TextField runsTextBox;

    @FXML
    private TextField boundariesTextBox;

    @FXML
    private Label msgLabel;


    //Initialize method same as init method of applet i.e this method executed before all methods
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        msgLabel.setVisible(false);
    }

    //Create class method, i.e executed when button is clicked cause, we have selected this method as onButtonClick in scenebuilder
    @FXML
    private void createCricket(){
        //Storing values of the inputted data into string and displaying them using parameterized constructor.
        String name=nameTextBox.getText();
        int runs=Integer.parseInt(runsTextBox.getText());
        int boundaries=Integer.parseInt(boundariesTextBox.getText());

        Cricket newPlayer= new Cricket(runs,name,boundaries);
        //Making the label visible, and setting text of label using toString method.
        msgLabel.setVisible(true);
        msgLabel.setText(newPlayer.toString());
    }
}
