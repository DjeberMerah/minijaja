package fr.femtost.disc.m1comp4.gui.utils;

import java.io.IOException;

import fr.femtost.disc.m1comp4.gui.MainApp;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
*	Static class which simplify the FXML files loading.
*/
public final class FXMLFileLoader {
	
	private FXMLFileLoader() {}
	
	/**
	 *	Load an FXML file.
	 * 
	 *	@param path Path to the FXML file to load.
	 *
	 *
	 *	@return The parent element contained in the loaded FXML file.
	 */
	public static Parent loadFXMLFile(String path) {
		
		Parent p = null;
        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource(path));
            p = loader.load();

        } catch (IOException e) { e.printStackTrace(); }
        return p;
	}
}
