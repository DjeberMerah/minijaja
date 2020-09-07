package fr.femtost.disc.m1comp4.gui;

import fr.femtost.disc.m1comp4.gui.assets.Const;
import fr.femtost.disc.m1comp4.gui.utils.FXMLFileLoader;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    private static Stage app_window;

    @Override
    public void start(Stage primaryStage) {

    	app_window = primaryStage;
        app_window.setTitle(Const.APP_NAME);
        app_window.setScene(new Scene(FXMLFileLoader.loadFXMLFile(Const.APP_LAYOUT_PATH)));
        app_window.show();

    }

    public Stage getPrimaryStage() { return app_window; }

    public static void main(String[] args) { launch(args);
    }

	public static Node lookUpForNode(String selector) { return app_window.getScene().lookup(selector); }
	
}
