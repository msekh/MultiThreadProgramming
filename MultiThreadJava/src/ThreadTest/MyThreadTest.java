/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadTest;
class MyThread extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+"\t "+"i= "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class MyThreadTest {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.setName("T1");
        
        MyThread t2=new MyThread();
        t2.setName("T2");
        
        t1.start();
        try{
            Thread.sleep(50);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        t2.start();
    }
}
