package sample;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.application.Platform;

public class Controller {
    @FXML
    public TextField vector;
    @FXML
    public TextField answer;
    @FXML
    public TextArea matrix;
    @FXML
    public Button close;
    @FXML
    public Button btnclick;


    public void click_close(ActionEvent event) {
        Platform.exit();
    }

    public void click(ActionEvent event) {
        String[] x = vector.getText().split(" ");
        String[] A = matrix.getText().split(" ");
        double[] Y = new double[x.length];
        double sum_1 = 0;
        double sum_2 = 0;
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            try {
                sum_1 += Math.exp(-Math.cos(Double.valueOf(A[i])));
            } catch (NumberFormatException e) {
                sum_2 += Double.valueOf(x[j]);
                Y[j] = sum_2 / Math.log(sum_1);
                j++;
            }
        }
        Y[x.length-1] = sum_2/Math.log(sum_1);
        for (int i = 0; i < Y.length; i++) {
            answer.appendText(Double.toString(Y[i]) + " ");
        }
    }
}
