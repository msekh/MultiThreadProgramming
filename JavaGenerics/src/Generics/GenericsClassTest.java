
package Generics;

/**
 *
 * @author MAHADI
 */

class Generic<T>{
    private T item;

    public Generic(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
     public void showItemDetails(){
		  System.out.println("Value of the item: " 
				  + getItem());
		  System.out.println("Type of the item: " 
				  + item.getClass().getName());
	  }
    
}

public class GenericsClassTest {
    public static void main(String[] arg){
        Generic<String> gn=new Generic<>("Sekh mahadi");
        gn.showItemDetails();
        
        System.out.println();
        Generic<Object> gn1=new Generic<>(100);      
        gn1.showItemDetails();
        
//        Generic<Object> gn2=new Generic<>();
//        gn2.setItem("Sekh mahadi");    
//        gn2.showItemDetails();
    }
}
