import java.util.*;
import java.lang.String;

public class Insertion{

  private ArrayList<String> names;
  private int size;
  
  public Insertion(){
    names = new ArrayList<String>();
    size = 0;
  }
  
  public Insertion(ArrayList<String> names){
    this.names = names;
    size = names.size();
  }
  
  public void insert(String name){
    int i = 0;
    for (String s: names){
      if (s.compareTo(name) > 0){
        break;
      }
      i++;
    }
    names.add(i, name);
    size++;
  }
  
 
  public ArrayList getList(){
    return names;
  }
  

}
