package homePage;

import account.Student;
import com.jaunt.NotFound;
import com.jaunt.ResponseException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import options.OptionsPageController;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomePageController implements Initializable {
    @FXML
    public Label loginButton;
    public Button fileChooserButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(Main.student == null) {
            fileChooserButton.setVisible(false);
            fileChooserButton.setDisable(true);
            loginButton.setText("Login");
        }
        else {
            fileChooserButton.setVisible(true);
            fileChooserButton.setDisable(false);
            fileChooserButton.setText("Student: " + Main.student.firstName);
            loginButton.setText("Logout");
        }
    }

    public void accountPageButton(ActionEvent actionEvent) throws IOException, NotFound, ResponseException {
        Stage appStage = (Stage) fileChooserButton.getScene().getWindow();

        if(Main.student == null) {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open Class Schedule File");
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("HTML", "*.html"));
            File htmlFile = fileChooser.showOpenDialog(appStage);
            if(htmlFile == null)
                return;
            Student.createNewStudent(htmlFile);
        }

        Parent root= FXMLLoader.load(getClass().getResource("/account/accountPage.fxml"));
        Scene scene = new Scene(root, OptionsPageController.PREF_WITH, OptionsPageController.PREF_HEIGHT);

        appStage.setScene(scene);
        appStage.show();
    }

    @FXML
    public void loginButtonPress(MouseEvent actionEvent) throws IOException {
        Stage appStage = (Stage) loginButton.getScene().getWindow();

        if(Main.student == null) {
            Parent root = FXMLLoader.load(getClass().getResource("/login/login.fxml"));
            Scene scene = new Scene(root, OptionsPageController.PREF_WITH, OptionsPageController.PREF_HEIGHT);
            appStage.setScene(scene);
            appStage.show();
        }
        else{
            Main.student = null;
            Parent root = FXMLLoader.load(getClass().getResource("/homePage/home.fxml"));
            Scene scene = new Scene(root, OptionsPageController.PREF_WITH, OptionsPageController.PREF_HEIGHT);
            appStage.setScene(scene);
            appStage.show();
        }
    }

    @FXML
    public void optionsButtonPress(MouseEvent actionEvent) throws IOException {
        Stage appStage = (Stage) loginButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/options/options.fxml"));

        Scene scene = new Scene(root, OptionsPageController.PREF_WITH, OptionsPageController.PREF_HEIGHT);
        appStage.setScene(scene);
        appStage.show();
    }

    @FXML
    public void SchoolResourcePress(MouseEvent actionEvent) throws IOException {
        Stage appStage = (Stage) loginButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/resources.fxml"));

        Scene scene = new Scene(root, OptionsPageController.PREF_WITH, OptionsPageController.PREF_HEIGHT);
        appStage.setScene(scene);
        appStage.show();
    }

    @FXML
    public void GPACalculatorPress(MouseEvent actionEvent) throws IOException {
        Stage appStage = (Stage) loginButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/GPA/GPA.fxml"));

        Scene scene = new Scene(root, OptionsPageController.PREF_WITH, OptionsPageController.PREF_HEIGHT);
        appStage.setScene(scene);
        appStage.show();
    }

    @FXML
    public void gradeButtonPressed(MouseEvent actionEvent) throws IOException {
        Stage appStage = (Stage) loginButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/Grade/grade.fxml"));

        Scene scene = new Scene(root, OptionsPageController.PREF_WITH, OptionsPageController.PREF_HEIGHT);
        appStage.setScene(scene);
        appStage.show();
    }

    @FXML
    public void diningButtonPress(MouseEvent actionEvent) throws IOException {
        Stage appStage = (Stage) loginButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/Dining/diningCounter.fxml"));

        Scene scene = new Scene(root, OptionsPageController.PREF_WITH, OptionsPageController.PREF_HEIGHT);
        appStage.setScene(scene);
        appStage.show();
    }

    @FXML
    public void studentButtonPress(MouseEvent actionEvent) throws IOException {
        Stage appStage = (Stage) loginButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/Student/student.fxml"));

        Scene scene = new Scene(root, OptionsPageController.PREF_WITH, OptionsPageController.PREF_HEIGHT);
        appStage.setScene(scene);
        appStage.show();
    }

    @FXML
    public void classesButtonPress(MouseEvent actionEvent) throws IOException {
        Stage appStage = (Stage) loginButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/Classes/classes.fxml"));

        Scene scene = new Scene(root, OptionsPageController.PREF_WITH, OptionsPageController.PREF_HEIGHT);
        appStage.setScene(scene);
        appStage.show();
    }

    @FXML
    public void gradeButtonPress(MouseEvent actionEvent) throws IOException {
        Stage appStage = (Stage) loginButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/Grade/grade.fxml"));

        Scene scene = new Scene(root, OptionsPageController.PREF_WITH, OptionsPageController.PREF_HEIGHT);
        appStage.setScene(scene);
        appStage.show();
    }
}
