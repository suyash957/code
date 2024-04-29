/**Create a thread using Thread class and Runnable class. */

class MyThread extends Threas {
    public void run(){
        System.out.println("MyThread running");
    }
}
public class ThreadExample {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();
    }
}


class MyRunnable implements Runnable {
    public void run(){
        System.out.println("MyRunnable running");
    }
}

public class RunnableExample {
    public static void main(String[] args){
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}