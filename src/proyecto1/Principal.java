
package proyecto1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author adels
 */
public class Principal extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Ventana.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Bienvenido a mi ventana");
        stage.setScene(scene);
        stage.show();
    }
}
