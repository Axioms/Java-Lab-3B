import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Handler implements EventHandler<ActionEvent>{
    TextField field1, field2;
    Label output;

    public Handler(TextField field1, TextField field2, Label output) {
        this.field1 = field1;
        this.field2 = field2;
        this.output = output;
    }

    @Override
    public void handle(ActionEvent event) {
        int tempint;
        double tempdouble;

        try {
            output.setText("The Sum is " + (Integer.parseInt(field1.getText()) + Integer.parseInt(field2.getText())));
        }
        catch (NumberFormatException e){
            try {
                output.setText("The Sum is " + (Double.parseDouble(field1.getText()) + Double.parseDouble(field2.getText())));
            }
            catch (NumberFormatException e1) {
                output.setText("Invalid Entry!");
            }
        }
    }
}
