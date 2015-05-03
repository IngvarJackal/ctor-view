import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;

public class SampleController {


    public HBox optionsHBox;
    public Button expandOptionsButton;

    private boolean expandedOptions = true;

    public void expandOptions(ActionEvent actionEvent) {
        if (expandedOptions) {
            optionsHBox.setPrefWidth(0.0);
            expandedOptions = false;
        } else {
            optionsHBox.setPrefWidth(optionsHBox.USE_COMPUTED_SIZE);
            expandedOptions = true;
        }
    }
}
