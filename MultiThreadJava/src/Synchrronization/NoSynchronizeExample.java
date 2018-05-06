package Synchrronization;

class First {

    public void display(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}

class Second extends Thread {

    String msg;
    First obj;

    public Second(String str, First fobj) {
        this.msg = str;
        this.obj = fobj;
        start();
    }

    public void run() {
        obj.display(msg);
    }
}

public class NoSynchronizeExample {
    public static void main(String[] args) {
        First fnew =new First();
        
        Second s=new Second("welcome", fnew);
        Second ss=new Second("new", fnew);
        Second sss=new Second("programmer", fnew);
        
        
    }
}
