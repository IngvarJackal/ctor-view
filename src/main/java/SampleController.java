import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class SampleController {


    public Label helloLabel;

    public void setMessage(ActionEvent actionEvent) {
        helloLabel.setText("Hello, world!");
    }

    public void clearMessage(ActionEvent actionEvent) {
        helloLabel.setText("");
    }
}
