package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAHADI
 */
public class LowerBoundWildCard {

    //Only work for the list of Number type.
    static void printListItems1(List<Integer> list) {
        for (Integer num : list) {
            System.out.println(num);
        }
    }

    //Work for Number and any of its sub types.
    static void printListItems2(List<? super Integer> list) {
        list.forEach((num) -> {
            System.out.println(num);
        });
    }

    public static void main(String args[]) {
        //Arraylist of Integer type.	
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        //Arraylist of Number type.	
        List<Number> list2 = new ArrayList<>();
        list2.add(1.4);
        list2.add(2L);
        list2.add(3);

        //Only accept Integer type list.
        System.out.println("Print of List of Integer type"
                + " using printListItems1 method:");
        printListItems1(list1);

        //Accept Integer and any of its super types.
        System.out.println("Print of List of Integer type"
                + " using printListItems2 method:");;
        printListItems2(list1);
        System.out.println("Print of List of Number type using"
                + " printListItems2 method:");
        printListItems2(list2);

    }
}
