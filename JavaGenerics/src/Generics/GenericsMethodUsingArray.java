/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *
 * @author MAHADI
 */
class GenericsArray {

    public <E> void printArray(E[] inputArray) {
        // display array elements
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }

        System.out.println();
    }
}

public class GenericsMethodUsingArray {

    public static void main(String args[]) {
        GenericsArray arr = new GenericsArray();
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray contains:");
        arr.printArray(integerArray); // pass an Integer array
        System.out.println("\nArray doubleArray contains:");
        arr.printArray(doubleArray); // pass a Double array
        System.out.println("\nArray characterArray contains:");
        arr.printArray(characterArray); // pass a Character array
    } // end main
}
