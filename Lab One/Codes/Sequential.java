import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Sequential {
    public static void main(String[] args){
      
      ArrayList<String> names = new ArrayList<String>();
      //reading of files
      BufferedReader br = null;
  
      try {
        String sCurrentLine;
    
        br = new BufferedReader(new FileReader("input.txt"));
    
        while ((sCurrentLine = br.readLine()) != null) {
          System.out.println(sCurrentLine+"");
          names.add(sCurrentLine+"");
        
        }
        
        System.out.println("goodbye!");
      } catch (IOException e) {
        e.printStackTrace();
      } finally {
        try {
          if (br != null) br.close();
        } catch (IOException ex) {
          ex.printStackTrace();
        } 
      }
      
      //process
    
      Insertion process = new Insertion(names);
      process.insert("Steven");
      names = process.getList();
      System.out.println("Done processing");
      
      for (String s: names){
        System.out.println(s);
      }
    
    }
    
    
}