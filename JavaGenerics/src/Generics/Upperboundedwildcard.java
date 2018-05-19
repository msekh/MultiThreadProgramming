
package Generics;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author MAHADI
 */
public class Upperboundedwildcard {
    //Only work for the list of Number type
    public static void squareOfListItems1(List<Number> list){
        double number;
        for(Number num: list){
            number=num.doubleValue();
            System.out.println(number*number);
        }
    }//Work for Number and any of its sub types.
	static void squareOfListItems2(List<? extends Number> list){
		double number;
	    for (Number num : list){
	    	number = num.doubleValue();
	        System.out.println(number * number);
	    }
        }
        static void printOfListItems2(List<? extends Object> list){
            for(Object str : list){
                System.out.println(str);
            }
        }
    public static void main(String args[]){
		//Arraylist of Number type.	
		List list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
 
 
		//Arraylist of Double type.	
		List list2 = new ArrayList();
		list2.add(1.3);
		list2.add(2.5);
		list2.add(3.8);	
 
                List list3=new ArrayList();
                
                list3.add("Sekh");
                list3.add(101);
                list3.add(2.9999);
                list3.add(9L);
                
		//Only accept Number type list.
		System.out.println("Square of List of Number " +
			"type using squareOfListItems1 method:");
		squareOfListItems1(list1);
 
		//Accept Number and any of its sub types.
		System.out.println("Square of List of Number " +
			"type using squareOfListItems2 method:");;
		squareOfListItems2(list1);
		System.out.println("Square of List of Double " +
			"type using squareOfListItems2 method:");
		squareOfListItems2(list2);
 
                System.out.println("Square of List of Double " +
			"type using printOfListItems2 method:");
		      printOfListItems2(list3);
	}
}
