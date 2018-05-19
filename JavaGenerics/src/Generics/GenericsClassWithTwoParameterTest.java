
package Generics;

/**
 *
 * @author MAHADI
 */

class Generics<T,U>{
    private T itemT;
    private  U itemU;

    public Generics(T itemT, U itemU) {
        this.itemT = itemT;
        this.itemU = itemU;
    }

    public T getItemT() {
        return itemT;
    }

    public void setItemT(T itemT) {
        this.itemT = itemT;
    }

    public U getItemU() {
        return itemU;
    }

    public void setItemU(U itemU) {
        this.itemU = itemU;
    }
    public void showItemDetails(){
        System.out.println("Value of the itemT: "+getItemT());
        System.out.println("Type of the ItemT: "+itemT.getClass().getName());
        System.out.println("Value of the itemT: "+getItemU());
        System.out.println("Type of the ItemT: "+itemU.getClass().getName());
    
    }
    
}
public class GenericsClassWithTwoParameterTest {
    public static void main(String[] args) {
        Generics<String, Integer> gn=new Generics<>("Sekh", 101);
//        gn.setItemT("Sekh Mahadi");
//        gn.setItemU(100);
//        
        gn.showItemDetails();
    }
}
