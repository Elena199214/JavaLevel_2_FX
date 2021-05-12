package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class Controller {
    @FXML
    TextArea mainTextArea;
    public void sendOneClickAction(ActionEvent actionEvent) {
        mainTextArea.appendText("1\n");

        //Button thisButton = (Button)actionEvent.getSource(); // Вот так можно получить ссылку на кнопку,
        // которая была нажата (например, есл и вы одно и то же действие повесили на десяток кнопок)
    }





//
//
//    public void sendOneClickAction(ActionEvent actionEvent) {
//        mainTextArea.appendText("1\n");
//    }
}
