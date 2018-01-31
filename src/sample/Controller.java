package sample;

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
    
    public void pobierzTemp() {
        double temp;
        try {
            temp = Double.parseDouble(input.getText());
            errOutput.setVisible(false);
            output.setVisible(true);
            if(inputF.isSelected()){
                temp=przelicznik.przeliczFC(temp);
            }else if(inputK.isSelected()){
                temp=przelicznik.przeliczKC(temp);
            }
            if(outputF.isSelected()){
                temp=przelicznik.przeliczCF(temp);
                output.setText(String.format("%.2f", temp));
            }else if(outputK.isSelected()){
                temp=przelicznik.przeliczCK(temp);
                output.setText(String.format("%.2f", temp));
            }else{
                output.setText(String.format("%.2f", temp));
            }
        } catch (NumberFormatException e) {
            errOutput.setVisible(true);
            errOutput.setText("To nie jest format liczbowy !");
            output.setVisible(false);
        }
    }
}