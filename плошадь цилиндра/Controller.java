package sample;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.lang.Math;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
 import javafx.application.Platform;

public class Controller {
    @FXML
    public TextField first_number;
    @FXML
    public TextField second_number;
    @FXML
    public TextField result_form;
    @FXML
    public Button btn;
    
    public void click(ActionEvent event) {
        double first_number_value = Double.parseDouble(first_number.getText());
        double second_number_value = Double.parseDouble(second_number.getText());
        double result = 2*Math.PI * first_number_value * (first_number_value + second_number_value);
        result_form.setText(String.valueOf(result));
    }

   public void inquiryQuestionBtnOK() {
       Platform.exit();
    }

    public void clearbtn() {
        first_number.clear();
        second_number.clear();
        result.clear();
    }
}

