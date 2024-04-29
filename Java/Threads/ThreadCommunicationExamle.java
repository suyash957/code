class SharedResource {
    private volatile boolean flag = false;

    public synchronized void waitForFlag() throws InterruptedException {
        while (!flag) {
            wait();
        }
    }

    public synchronized void setFlag() {
        flag = true;
        notify();
    }
}

class Waiter implements Runnable {
    private SharedResource sharedResource;

    public Waiter(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        try {
            sharedResource.waitForFlag();
            System.out.println("Waiter: Flag is true, continuing execution.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Setter implements Runnable {
    private SharedResource sharedResource;

    public Setter(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        try {
            Thread.sleep(2000); // Simulate some work
            sharedResource.setFlag();
            System.out.println("Setter: Flag is set to true.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadCommunicationExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread waiterThread = new Thread(new Waiter(sharedResource));
        Thread setterThread = new Thread(new Setter(sharedResource));

        waiterThread.start();
        setterThread.start();
    }
}
