package fr.femtost.disc.m1comp4.gui;

import java.io.File;

import fr.femtost.disc.m1comp4.gui.assets.Const;
import fr.femtost.disc.m1comp4.gui.utils.FXMLFileLoader;
import fr.femtost.disc.m1comp4.gui.utils.FileFlowManager;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class TabFile extends Tab {
	
	private boolean dirty;
	private File file;
	private TextArea text_area;
	
	public TabFile() {
		
		file = null;
		dirty = true;
		setText("unnamed");
		setContent(FXMLFileLoader.loadFXMLFile(Const.TAB_FILE_LAYOUT_PATH));
		text_area = (TextArea)((AnchorPane)getContent()).getChildren().get(0);
		
	}
	
	public TabFile(File f) throws Exception {
		
		file = f;
		setDirty(false);
		setContent(FXMLFileLoader.loadFXMLFile(Const.TAB_FILE_LAYOUT_PATH));
		text_area = (TextArea)((AnchorPane)getContent()).getChildren().get(0);
		text_area.setText(FileFlowManager.readFile(f));
		text_area.setOnKeyTyped(new EventHandler<Event>() { public void handle(Event event) { setDirty(true); }});
		
	}
	
	private void setDirty(boolean value) {

		dirty = value;
		setText(dirty ? "*" + file.getName() : file.getName());

	}
	
	public boolean isDirty() { return dirty; }
	
	public boolean isLinkedToAFile() { return file != null; }

	public void overwriteFileWithText() throws Exception { overwriteFileWithText(file); }
	
	public void overwriteFileWithText(File f) throws Exception {
		
		FileFlowManager.overwriteFile(f, text_area.getText());
		
		if (file == null)
			text_area.setOnKeyTyped(new EventHandler<Event>() { public void handle(Event event) { setDirty(true); }});
		
		file = f;
		setDirty(false);

	}
	
	public String getFileExtension() {
		return file.getName().substring(file.getName().lastIndexOf(".")+1);
	}

	public String getContentText(){
		return text_area.getText();
	}

	public void write(String s){
		text_area.appendText(s);
	}
	
}
