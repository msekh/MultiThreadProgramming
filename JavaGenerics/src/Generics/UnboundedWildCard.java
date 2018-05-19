
package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAHADI
 */
public class UnboundedWildCard {
    public static void printItems(List<Object> list){
        //Only work for the list of object type
        for(Object listItem: list){
              // list.forEach((listItem) ->{
            System.out.println(listItem);
        }
        }
        //Work for the list of any type.
       public static void printListItems(List<?> list){
           list.forEach((listItem) -> {
               System.out.println(listItem);
        });
    }
       
       public static void main(String[] args){
           List<Object> list1=new ArrayList<>();
           //Arraylist of Object type.
           list1.add("Sekh");
           list1.add("Mahadi");
           list1.add(101);
           
           //Arraylist of String type.
           List<String> list2=new ArrayList<>();
           
           list2.add("Shekh");
           list2.add("Rupon");
           list2.add("Niaj");
           
           //Only accept Object type list.
		System.out.println("List of object " +
				"using displayItems method:");
		         printItems(list1);
             //Accept list of any type.
		System.out.println("List of object using " +
				"displayListItems method:");
		printListItems(list1);
		System.out.println("List of strin using " +
				"displayListItems method:");
		printListItems(list2);            
       }
}
