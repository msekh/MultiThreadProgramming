/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 ** This class is used to show the use of generics method.
 * @author MAHADI
 */
 class Test{
     public <T> void showItemDetails(T item){
         System.out.println("Value of the item: "+ item);
         System.out.println("Type of the item: "+ item.getClass().getName());
     }
 }
public class GenericsMethodTest {
    public static void main(String[] args) {
        Test test=new Test();
        
        test.showItemDetails("Mahadi");
        test.showItemDetails(101);
    }
}
