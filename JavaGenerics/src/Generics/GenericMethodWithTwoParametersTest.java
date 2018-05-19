
package Generics;

/**
 * @author MAHADI
 */
/* This class is used to show the use of 
 * generics method with two parameters.
*/

class GenericTest{
    //Generics method with two parameters.
    public <T,U> void showItemDetails(T itemT, U itemU){
          System.out.println("Value of the itemT: " + itemT);
	  System.out.println("Type of the itemT: " 
			  + itemT.getClass().getName());
	  System.out.println("Value of the itemU: " + itemU);
	  System.out.println("Type of the itemU: " 
			  + itemU.getClass().getName());
    }
}
public class GenericMethodWithTwoParametersTest {
    public static void main(String[] args) {
                //String type test
		GenericTest test = new GenericTest();
		test.showItemDetails("Test String.", 100);
    }
}
