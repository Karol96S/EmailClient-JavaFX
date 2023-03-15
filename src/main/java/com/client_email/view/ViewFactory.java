package com.client_email.view;

import com.client_email.EmailManager;
import com.client_email.controller.BaseController;
import com.client_email.controller.LoginWindowController;
import com.client_email.controller.MainWindowController;
import com.client_email.controller.OptionsWindowController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {

    private EmailManager emailManager;

    public ViewFactory(EmailManager emailManager) {
        this.emailManager = emailManager;
    }

    //View options handling:
    private ColorTheme colorTheme = ColorTheme.DEFAULT;

    public ColorTheme getColorTheme() {
        return colorTheme;
    }

    public void setColorTheme(ColorTheme colorTheme) {
        this.colorTheme = colorTheme;
    }

    public FontSize getFontSize() {
        return fontSize;
    }

    public void setFontSize(FontSize fontSize) {
        this.fontSize = fontSize;
    }

    private FontSize fontSize = FontSize.MEDIUM;

    public void showLoginWindow() {

        System.out.println("show login window called");

        BaseController controller = new LoginWindowController(emailManager, this, "/LoginWindow.fxml");
        initializeStage(controller);

    }

    public void showMainWindow() {

        System.out.println("main window called");

        BaseController controller = new MainWindowController(emailManager, this, "/MainWindow.fxml");
        initializeStage(controller);

    }

    public void showOptionsWindow() {

        System.out.println("options window called");

        BaseController controller = new OptionsWindowController(emailManager, this, "/OptionsWindow.fxml");
        initializeStage(controller);

    }

    private void initializeStage(BaseController baseController) {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(baseController.getFxmlName()));
        fxmlLoader.setController(baseController);
        Parent parent;

        try {
            parent = fxmlLoader.load();
        } catch(IOException e) {
            e.printStackTrace();
            return;
        }

        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

    public void closeStage(Stage stageToClose) {
        stageToClose.close();
    }
}