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
class GenericConstructorWithTwoParameters{

    public <T,U>GenericConstructorWithTwoParameters(T itemT, U itemU) {
    
     System.out.println("Value of the itemT: " + itemT);
		 System.out.println("Type of the itemT: " 
				 + itemT.getClass().getName());
		 System.out.println("Value of the itemU: " + itemU);
		 System.out.println("Type of the itemU: " 
				 + itemU.getClass().getName());
    }
    
}
public class GenericConstructorWithTwoParametersTest {
    public static void main(String[] args) {
        GenericConstructorWithTwoParameters test=new GenericConstructorWithTwoParameters("Sekh", 100);
    }
}
