package fr.femtost.disc.m1comp4.gui.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

import fr.femtost.disc.m1comp4.gui.TabFile;
import fr.femtost.disc.m1comp4.gui.assets.Const;
import fr.femtost.disc.m1comp4.lexerParser.ErrMessageConsole;
import fr.femtost.disc.m1comp4.lexerParser.OutMessageConsole;
import fr.femtost.disc.m1comp4.jajaCode.instrs.JJCInstr;
import fr.femtost.disc.m1comp4.jajaCode.visitor.JJCInterpetor;
import fr.femtost.disc.m1comp4.jajaCode.visitor.JJCPrinter;
import fr.femtost.disc.m1comp4.lexerParser.Analyzer;
import fr.femtost.disc.m1comp4.lexerParser.Converter;
import fr.femtost.disc.m1comp4.miniJaJa.MJJClass;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.MJJCompilator;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.MJJInterpretor;
import fr.femtost.disc.m1comp4.miniJaJa.visitor.typeCheck.MJJTypeChecker;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.TextFlow;
import org.antlr.runtime.tree.CommonTree;

public class MainController implements Initializable, ChangeListener<Object> {
	
	@FXML private MenuItem close;
	@FXML private MenuItem closeAll;
	@FXML private MenuItem save;
	@FXML private MenuItem saveAs;
	@FXML private MenuItem saveAll;
	@FXML private MenuItem compile;
	@FXML private MenuItem run;
	@FXML private MenuItem compileAndRun;
	@FXML private MenuItem nextStep;
	@FXML private MenuItem stepByStep;

	@FXML private TextArea memory;

	@FXML private TextFlow console;
	
	@FXML private TabPane tabs_file;
	private TabFile focus;
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		new OutMessageConsole(console).redirectOut();
		new ErrMessageConsole(console).redirectErr();
		tabs_file.getSelectionModel().selectedItemProperty().addListener(this);
		focus = null;
	}
	
	public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
		
		focus = (TabFile)newValue;
		if (focus == null) {
			
			close.setDisable(true);
			closeAll.setDisable(true);
			save.setDisable(true);
			saveAs.setDisable(true);
			saveAll.setDisable(true);
			
		} else {
			
			close.setDisable(false);
			closeAll.setDisable(false);
			save.setDisable(!focus.isDirty());
			saveAs.setDisable(false);
			saveAll.setDisable(true);
			
			int i = 0;
			while (i < tabs_file.getTabs().size() && saveAll.isDisable())
				saveAll.setDisable(!((TabFile)tabs_file.getTabs().get(i++)).isDirty());
			
		}
	}
	
	private void setFocus(TabFile tab_file) {
		if (tab_file.isLinkedToAFile())
			if (tab_file.getFileExtension().equals("mjj")){
				run.setDisable(false);
				compile.setDisable(false);
				compileAndRun.setDisable(false);
				stepByStep.setDisable(true);
				nextStep.setDisable(true);
			} else {
				run.setDisable(false);
				compile.setDisable(true);
				compileAndRun.setDisable(true);
				stepByStep.setDisable(false);
				nextStep.setDisable(true);
			}
		tabs_file.getSelectionModel().select(tab_file);
	}
	
    @FXML
    public void newFile(ActionEvent event) {
    	
    	TabFile tab_file = new TabFile();
    	tabs_file.getTabs().add(tab_file);
    	setFocus(tab_file);
    	
    }
    
    @FXML
    public void openFile(ActionEvent event) {
    	
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		jfc.setDialogTitle(Const.OPEN_WINDOW_TAG);
		jfc.setAcceptAllFileFilterUsed(false);
		jfc.addChoosableFileFilter(new FileNameExtensionFilter("JajaCode file, MiniJaja file", "jjc", "mjj"));
		
		if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			try {
				
				TabFile tab_file = new TabFile(jfc.getSelectedFile());
				tabs_file.getTabs().add(tab_file);
				setFocus(tab_file);
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
    }
    
    @FXML
    public void closeFile(ActionEvent event) { tabs_file.getTabs().remove(focus); }
    
    @FXML
    public void closeAllFiles(ActionEvent event) {
    	
    	/*for (Tab tab : tabs_file.getTabs()) {
    		TabFile tab_file = (TabFile)tab;
    		setFocus(tab_file);

    		if (tab_file.isDirty()) {
    		
    			if (tab_file.isLinkedToAFile()) saveFile(event);
    			else saveFileAs(event);
    			
    		}
    	}*/
    }

    @FXML
    public void saveFile(ActionEvent event) { 

    	try { focus.overwriteFileWithText(); }
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
    	
    }
    
    @FXML
    public void saveFileAs(ActionEvent event) {
    	
    	JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		jfc.setDialogTitle(Const.SAVE_WINDOW_TAG);
		jfc.setAcceptAllFileFilterUsed(false);
		jfc.addChoosableFileFilter(new FileNameExtensionFilter("JajaCode file, MiniJaja file", "jjc", "mjj"));

		if (jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
			try { focus.overwriteFileWithText(jfc.getSelectedFile()); }
			catch (Exception e) {
				
				e.printStackTrace();
				
			}
		}
    	
    }
    
    @FXML
    public void saveAllFiles(ActionEvent event) {
    	
    	TabFile focus_at_start = focus;
    	for (Tab tab : tabs_file.getTabs()) {
    		TabFile tab_file = (TabFile)tab;
    		setFocus(tab_file);

    		if (tab_file.isDirty()) {
    		
    			if (tab_file.isLinkedToAFile()) saveFile(event);
    			else saveFileAs(event);
    			
    		}
    	}
    	
    	setFocus(focus_at_start);
    	
    }

    private boolean isFileOpen(String operation){
		if (focus==null) {
			Alert alert = new Alert(Alert.AlertType.WARNING);
			alert.setTitle(operation+" Warning");
			alert.setHeaderText("The "+operation+" couldn't be launched");
			alert.setContentText("No file is currently open");
			alert.showAndWait();
			return false;
		}
		return true;
	}

	private boolean isFileEmpty(String operation, String code){
		if (code.equals("")){
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle(operation+" Error");
			alert.setHeaderText("The "+operation+" couldn't be pursued");
			alert.setContentText("The file is empty");
			alert.showAndWait();
			return false;
		}
		return true;
	}

	public void interpret(ActionEvent actionEvent) {
		ErrMessageConsole.reset();
		if (!isFileOpen("Interpretation")) return;
		String code = focus.getContentText();
		if (!isFileEmpty("Interpretation",code)) return;
		if (!focus.isLinkedToAFile() ||  focus.getFileExtension().equals("mjj")) {
			CommonTree AST = Analyzer.getAstFromSource(code);
			if (AST != null) {
				MJJClass classe = Converter.treeToClasses(AST);
				MJJTypeChecker.typeCheck(classe);
				if (!ErrMessageConsole.isHasSeenError()) MJJInterpretor.interpret(classe);
			}
		} else {
		}
		return;
	}

	public void compile(ActionEvent actionEvent){
		ErrMessageConsole.reset();
		if (!isFileOpen("Compilation")) return;
		String code = focus.getContentText();
		if (!isFileEmpty("Compilation",code)) return;
		CommonTree AST = Analyzer.getAstFromSource(code);
		if (AST!=null){
			MJJClass classe = Converter.treeToClasses(AST);
			MJJTypeChecker.typeCheck(classe);
			if (!ErrMessageConsole.isHasSeenError()) {
				ArrayList<JJCInstr> compiledCode = MJJCompilator.compile(classe);
				TabFile tab_file = new TabFile();
				tab_file.write(JJCPrinter.toString(compiledCode));
				tabs_file.getTabs().add(tab_file);
				setFocus(tab_file);
			}

		}
	}

	public void compileAndRun(ActionEvent actionEvent){
		if (!isFileOpen("compilation")) return;
		String code = focus.getContentText();
		if (!isFileEmpty("compilation",code));
		CommonTree AST = Analyzer.getAstFromSource(code);
		if (AST!=null){
			MJJClass classe = Converter.treeToClasses(AST);
			MJJTypeChecker.typeCheck(classe);
			if (!ErrMessageConsole.isHasSeenError()) {
				ArrayList<JJCInstr> compiledCode = MJJCompilator.compile(classe);
				JJCInterpetor.interpret(compiledCode,false);
			}
		}
	}

    public void compileAndRunByStep(ActionEvent actionEvent){
        if (!isFileOpen("compilation")) return;
        String code = focus.getContentText();
        if (!isFileEmpty("compilation",code));
        CommonTree AST = Analyzer.getAstFromSource(code);
        if (AST!=null){
            MJJClass classe = Converter.treeToClasses(AST);
            MJJTypeChecker.typeCheck(classe);
            if (!ErrMessageConsole.isHasSeenError()) {
                ArrayList<JJCInstr> compiledCode = MJJCompilator.compile(classe);
                JJCInterpetor.initInter(compiledCode);
                nextStep.setDisable(false);

            }
        }
    }

	public void clearConsole(ActionEvent actionEvent){
		console.getChildren().removeAll(console.getChildren());
	}

	public void initStepByStep(ActionEvent actionEvent){
		if (focus==null) {
			Alert alert = new Alert(Alert.AlertType.WARNING);
			alert.setTitle("Interpretation Warning");
			alert.setHeaderText("The interpretation couldn't be launched");
			alert.setContentText("No file is currently open");
			alert.showAndWait();
			return;
		}
		String code = focus.getContentText();
		if (code.equals("")){
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Interpretation Error");
			alert.setHeaderText("The interpretation couldn't be pursued");
			alert.setContentText("The file is empty");
			alert.showAndWait();
			return;
		}
		CommonTree AST = Analyzer.getAstFromSource(code);
		if (AST!=null){
			MJJClass classe = Converter.treeToClasses(AST);
			MJJTypeChecker.typeCheck(classe);
			if (!ErrMessageConsole.isHasSeenError()){
				ArrayList<JJCInstr> compiledCode = MJJCompilator.compile(classe);
				JJCInterpetor.initInter(compiledCode);
				nextStep.setDisable(false);
			}
		}
	}

	public void nextStep(ActionEvent actionEvent){
		boolean stopped = JJCInterpetor.interpretStepByStep();
		nextStep.setDisable(stopped);
		stepByStep.setDisable(!stopped);
		memory.setText(JJCInterpetor.currentMem());
	}
}
