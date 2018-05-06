/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Synchrronization;

class Table{
    synchronized static void printtable(int n){
        for(int i=1; i<=10; i++){
            int result=n*i;
            System.out.println(n+" * "+i+"= "+ result);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread{
    public void run(){
        Table.printtable(1);
    }
}
public class StaticSynchronization {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
         t1.start();
    }
}
