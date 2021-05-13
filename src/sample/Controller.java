package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    TextArea mainTextArea;

    @FXML
    TextField textField;

    @FXML
    Button sendButton;


    public void sendOneClickAction(ActionEvent actionEvent) {
//        if (!(textField.getText().equals(""))) {
//            mainTextArea.appendText(textField.getText() + "\n");
//            textField.setText("");
//
//        }


            if(!textField.getText().equals("")) {
                mainTextArea.appendText(textField.getText() +"\n" + "\n");
                textField.setText("");
            }
        }


    public void seOneClickAction(ActionEvent actionEvent) {

            if(!textField.getText().equals("")) {
                mainTextArea.appendText(textField.getText() +"\n" + "\n");
                textField.setText("");
            }
        }


        }





