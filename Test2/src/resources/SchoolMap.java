package resources;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import options.OptionsPageController;
import java.io.IOException;


public class SchoolMap {

    @FXML
    public Button backButton;

    public void pageBack(ActionEvent actionEvent) throws IOException {
        Stage appStage;
        Parent root;
        appStage = (Stage) backButton.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("/resources/resources.fxml"));
        Scene scene = new Scene(root, OptionsPageController.PREF_WITH, OptionsPageController.PREF_HEIGHT);
        appStage.setScene(scene);
        appStage.show();
    }

}

