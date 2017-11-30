package dataManagement;

import java.io.File;
import java.util.Scanner;

public class DataManager {
       private Scanner x;
       
       public void openFile(){
    	   try{
    		   x = new Scanner(new File("textData.txt"));
    	   }
    		   catch(Exception e){
    			   System.out.print("could not find file");
    		   }
       }
       public void readFile(){
    	   while(x.hasNext()){
    		    String a = x.next();
    		    String b = x.next();
    		    String c = x.next();
    		    System.out.println(a);
    		    System.out.println(b);
    		    System.out.println(c);
    	   }
       }
       public void closeFile(){
    	   x.close();
       }
}
