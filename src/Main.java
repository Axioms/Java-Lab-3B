import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Arrays;


public class Main extends Application {
    public static void main(String[] args)  {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label1 = new Label("Insert two numbers to be added.");
        Label label2 = new Label("First Number:");
        Label label3 = new Label("Second Number:");
        Label label4 = new Label("");

        TextField field1 = new TextField("");
        TextField field2 = new TextField("");

        Button button1 = new Button("Sum");

        HBox hb1 = new HBox();
        HBox hb2 = new HBox();
        HBox hb3 = new HBox();
        HBox hb4 = new HBox();
        HBox hb5 = new HBox();
        VBox vb = new VBox();

        hb1.getChildren().addAll(new Node[]{label1});
        hb2.getChildren().addAll(new Node[]{label2, field1});
        hb3.getChildren().addAll(new Node[]{label3, field2});
        hb4.getChildren().addAll(new Node[]{button1});
        hb5.getChildren().addAll(new Node[]{label4});

        vb.getChildren().addAll(new Node[]{hb1, hb2, hb3, hb4, hb5});

        for(HBox b : Arrays.asList(hb1, hb2, hb3, hb4, hb5)) {
            b.setAlignment(Pos.CENTER);
            b.getStyleClass().add("hbox");
        }

        Handler h1 = new Handler(field1, field2, label4);
        button1.setOnAction(h1);

        vb.setAlignment(Pos.CENTER);
        vb.getStyleClass().add("mainWindow");

        Scene mainScene = new Scene(vb, 500,500);
        mainScene.getStylesheets().add("styles.css");
        primaryStage.setTitle("Lab 3B");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
}
