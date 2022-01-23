package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField nameTextBox;

    @FXML
    private TextField runsTextBox;

    @FXML
    private TextField boundariesTextBox;

    @FXML
    private Label msgLabel;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        msgLabel.setVisible(false);
    }

    @FXML
    private void createCricket(){
        String name=nameTextBox.getText();
        int runs=Integer.parseInt(runsTextBox.getText());
        int boundaries=Integer.parseInt(boundariesTextBox.getText());

        Cricket newPlayer= new Cricket(runs,name,boundaries);
        msgLabel.setVisible(true);
        msgLabel.setText(newPlayer.toString());
    }
}
