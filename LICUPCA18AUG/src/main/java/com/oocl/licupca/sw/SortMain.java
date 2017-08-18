package com.oocl.licupca.sw;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;

public class SortMain {

	public static void main(String[] args) {
		new SortedText("D:\\temp.txt");
	}

}

class SortedText implements Comparable{

	
	
	
	public SortedText(String fileName) {
		String line = null;
        ArrayList<String> SortedStringResult = new ArrayList<>();
        try {
        	
            Reader fileReader = new InputStreamReader(new FileInputStream(fileName), "utf-8");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                SortedStringResult.add(line);
            }   
            bufferedReader.close();
            Collections.sort(SortedStringResult);
            
            Writer  writer = new OutputStreamWriter(new FileOutputStream("D:\\output.txt"), "utf-8");
            for(String str: SortedStringResult) {
              writer.write(str + "\n");
            }
            
            writer.close();
            System.out.println("File '"+fileName+"' successfully sorted. New file saved as 'D:\\output.txt'");
        
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found: '" +  fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}