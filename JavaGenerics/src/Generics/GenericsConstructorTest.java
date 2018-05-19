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
class GenericConstructor{
    
    public <T> GenericConstructor(T item){
         System.out.println("Value of the item: " + item);
		 System.out.println("Type of the item: " 
				 + item.getClass().getName());
    } 
}
public class GenericsConstructorTest {
    public static void main(String args[]){
		//String type test
		GenericConstructor test1 = new GenericConstructor("Test String.");
		GenericConstructor test2 = new GenericConstructor(100);
	}
}
