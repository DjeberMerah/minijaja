package fr.femtost.disc.m1comp4.gui.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
*	Static class which simplify the file flows management.
*/
public final class FileFlowManager {
	
	private FileFlowManager() {}
	
	/**
	 *	Return the content of a File.
	 * 
	 *	@param f The File to read.
	 *
	 *
	 *	@return A String which contains the content of the file.
	 *
	 *	@throws FileNotFoundException
	 *	@throws IOException
	 */
	public static String readFile(File f) throws Exception {
		
		StringBuffer file_content = new StringBuffer("");
			
		FileInputStream fis = new FileInputStream(f.getAbsolutePath());
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader bf = new BufferedReader(isr);
		
		
		String line;
		while ((line = bf.readLine()) != null) {
			
			file_content.append(line);
			file_content.append("\n");
			
		}
		
		bf.close();
		
		return file_content.toString();
		
	}
	
	/**
	 *	Overwrite the content of a File.
	 * 
	 *	@param f The File to overwrite.
	 *	@param data
	 *
	 *	@throws FileNotFoundException
	 *	@throws IOException
	 */
	public static void overwriteFile(File f, String data) throws Exception {
			
		FileOutputStream fos = new FileOutputStream(f.getAbsolutePath()); 
		OutputStreamWriter osw = new OutputStreamWriter(fos);
			
		BufferedWriter bf = new BufferedWriter(osw);
		bf.write(data);
		bf.close();
		
	}
}
