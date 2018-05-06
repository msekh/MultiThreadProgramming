/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadPriority;

/**
 *
 * @author MAHADI
 */
class ThreadPriority implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() +"\t"+ " i= " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPriorityTest {
 public static void main(String[] args) {
        ThreadPriority r = new ThreadPriority();
        Thread t1 = new Thread(r, "T1");
        Thread t2 = new Thread(r, "T2");
        Thread t3 = new Thread(r, "T3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t3);
        
        t1.start();
        t2.start();
        t3.start();
    }   
}
