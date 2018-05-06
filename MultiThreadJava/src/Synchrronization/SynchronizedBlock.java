/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Synchrronization;

import java.util.ArrayList;
import java.util.List;

//class mahadi{
//    String name="";
//    private int count=0;
//    
//    public void mahadiName(String str, List<String> list){
//         // Only one thread is permitted
//        // to change geek's name at a time
//        synchronized(this){
//            name=str;
//            count++;
//        }
//         // All other threads are permitted
//        // to add geek name into list.
//        list.add(name);
//    }
//}
class Line1{
 public void getLine(){
        for(int i=0; i<3; i++){
            System.out.println(i);
            try
            {
                Thread.sleep(400);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

class Train1 extends Thread{
    Line1 line;

    public Train1(Line1 line) {
        this.line = line;
    }
    
    public void run(){
        synchronized(line){
            line.getLine();
        }
    }
}
public class SynchronizedBlock {
    public static void main(String[] args) {
        Line1 l=new Line1();
        Train1 tr=new Train1(l);
        Train1 tr1=new Train1(l);
        
        tr.start();
        tr1.start();
    }
}
