package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextField input;
    @FXML
    Label output;
    @FXML
    Label errOutput;
    @FXML
    RadioButton inputC;
    @FXML
    RadioButton outputC;
    @FXML
    RadioButton inputF;
    @FXML
    RadioButton outputF;
    @FXML
    RadioButton inputK;
    @FXML
    RadioButton outputK;


    Przelicznik przelicznik = new Przelicznik();

    public void pobierzTemp(ActionEvent actionEvent) {
        double temp;
        try {
            temp = Double.parseDouble(input.getText());
            errOutput.setVisible(false);
            output.setVisible(true);
            if (!inputC.isSelected() || !outputF.isSelected()) {
                if (inputC.isSelected() && outputK.isSelected()) {
                    temp = przelicznik.przeliczCK(temp);
                    output.setText(String.format("%.2f", temp));
                } else if (inputC.isSelected() && outputC.isSelected()) {
                    temp = przelicznik.przeliczCC(temp);
                    output.setText(String.format("%.2f", temp));
                } else if (inputF.isSelected() && outputC.isSelected()) {
                    temp = przelicznik.przeliczFC(temp);
                    output.setText(String.format("%.2f", temp));
                } else if (inputF.isSelected() && outputK.isSelected()) {
                    temp = przelicznik.przeliczFK(temp);
                    output.setText(String.format("%.2f", temp));
                } else if (inputF.isSelected() && outputF.isSelected()) {
                    temp = przelicznik.przeliczFF(temp);
                    output.setText(String.format("%.2f", temp));
                } else if (inputK.isSelected() && outputC.isSelected()) {
                    temp = przelicznik.przeliczKC(temp);
                    output.setText(String.format("%.2f", temp));
                } else if (inputK.isSelected() && outputF.isSelected()) {
                    temp = przelicznik.przeliczKF(temp);
                    output.setText(String.format("%.2f", temp));
                } else
                    //inputK.isSelected()&&outputK.isSelected()){
                    temp = przelicznik.przeliczKK(temp);
            } else {
                temp = przelicznik.przeliczCF(temp);
                output.setText(String.format("%.2f", temp));
            }
            output.setText(String.format("%.2f", temp));
        } catch (NumberFormatException e) {
            errOutput.setVisible(true);
            errOutput.setText("To nie jest format liczbowy !");
            output.setVisible(false);
        }
    }

}