import java.util.*;  
public class HashMapRemove{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
   map.put(1,"paranoid");  //Put elements in Map  
   map.put(2,"are");    
   map.put(3,"not");   
   map.put(4,"paranoid");
   map.put(5,"beacause");
   map.put(6,"they");
   map.put(7,"keep");   
   map.put(8,"putting");
   map.put(9,"themseleves");
   map.put(10,"delibertaly");
   map.put(11,"into");
   map.put(12,"paranoid");
   map.put(13,"avoidable");
   map.put(14,"situation");
       
   System.out.println("before removing element");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
     map.remove(13);
	System.out.println("after removing element");  
   }  
}  
}  