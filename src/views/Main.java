package views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*
         * Create a window based on the design instructions in main_view.fxml file
         * then set the title of the window
         * then show it
         */
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("../fxml_files/main_view.fxml"));
        primaryStage.setTitle("Char Counter");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
