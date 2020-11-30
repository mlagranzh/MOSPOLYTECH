package sample;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.application.Platform;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Controller {
    @FXML public TextField name; 
    @FXML public Button BtnOK;
    @FXML public RadioButton one;
    @FXML  public RadioButton two;
    @FXML  public Button btnclick;
    public class modal_window extends Application {
        int bool;
        String name,text;
        public modal_window(int k, String s) {
            bool = k;
            name = s;
        }
        public void showWindow() {
            if (bool==1){
                 text = name + ", " + "тестирование прошло успешно!";
            }
            else{
                 text = name + ", " + "тестирование провалено :(";
            }
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Результат");
            alert.setHeaderText(null);
            alert.setContentText(text);
            alert.showAndWait();
        }
        @Override
        public void start(Stage stage) {
            showWindow();
        }
    }

    public void click(ActionEvent event) {
        String name_return = name.getText();
        Stage stage;
        stage=(Stage) BtnOK.getScene().getWindow();
        if (one.isSelected()){
            modal_window modal = new modal_window(0,name_return);
            modal.start(stage);
        }
        if (two.isSelected()){
            modal_window modal = new modal_window(1,name_return);
            modal.start(stage);
        }
        else{
            modal_window modal = new modal_window(0,name_return);
            modal.start(stage);
        }
    }

    public void inquiryQuestionBtnOK() {
        Platform.exit();
    }
}
