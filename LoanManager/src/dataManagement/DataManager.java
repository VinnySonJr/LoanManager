package dataManagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class DataManager {
       public TreeMap<String,String> readFile(){
	    	TreeMap<String,String> dataMap = new TreeMap<String,String>();
	    	try {
	    		Scanner x = new Scanner(new File("textData.txt"));
	    		while(x.hasNext()){
	    			String line = x.nextLine();
	    			String words[]= line.split(",");
	    			dataMap.put(words[0]+","+words[1], words[2]);
	    		}
	    		x.close();
	    	} catch (FileNotFoundException e) {
	    		e.printStackTrace();
	    	}
    	  return dataMap;
       }    
}
