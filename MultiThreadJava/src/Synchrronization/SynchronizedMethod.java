/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Synchrronization;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

//class Tithy{
//    String name="";
//    private int count;
//    
//    public synchronized  void name(String str, List<String> list){
//        name=str;
//        count++;
//        
//        list.add(name);
//    }
//}

class Line{
    synchronized void getLine(){
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

class Train extends Thread{
    Line line;

    public Train(Line line) {
        this.line = line;
    }
    
   public void run(){
     line.getLine();
    }
}
public class SynchronizedMethod {
    public static void main(String[] args) {
   Line obj=new Line();
   
   Train tr1=new Train(obj);
   Train tr2=new Train(obj);
   
   // both threads start executing
   tr1.start();
   tr2.start();
    }
}
