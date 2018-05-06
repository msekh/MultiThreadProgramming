/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Synchrronization;
class First1{
    
    //Using Synchronized method
    public synchronized void display(String msg){
        System.out.print("["+ msg);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("]");
    }
    
}

class Second1 extends Thread{
    First1 obj;
    String msg;

    public Second1(First1 obj, String str) {
        this.obj = obj;
        this.msg = str;
       // start();
    }
    public void run(){
       // Using Synchronized block
       // synchronized(obj){
            obj.display(msg);
       // }
    }
    
    
}
public class ExWithSynchronization {
    public static void main(String[] args) {
        First1 fnew =new First1();
        
        Second1 s=new Second1(fnew,"welcome");
        Second1 ss=new Second1( fnew,"new");
        Second1 sss=new Second1(fnew,"programmer");
        
        s.start();
        ss.start();
        sss.start();
    }
}
