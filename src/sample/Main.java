package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.logging.Logger;

public
class Main
        extends Application {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static
    void main( final String[] args ) {
        launch(args);
    }

    @Override
    public
    void start( final Stage primaryStage )
            throws Exception {
        final Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
}
