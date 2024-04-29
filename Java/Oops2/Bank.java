/*Create an abstract class &#39;Bank&#39; with an abstract method &#39;getBalance&#39;.
$100, $150 and $200 are deposited in banks A, B and C respectively.
&#39;BankA&#39;, &#39;BankB&#39; and &#39;BankC&#39; are subclasses of class &#39;Bank&#39;, each having
a method named &#39;getBalance&#39;. Call this method by creating an object of
each of the three classes.*/


abstract class Bankm{
    abstract int getBalance();
}

class BankA extends Bankm{
    int getBalance(){
        return 100;


    }
}

class BankB extends Bankm{
    int getBalance(){
        return 150;
    }
}

class BankC extends Bankm{
    int getBalance(){
        return 200;

    }
}

public class Bank{
    public static void main(String[] args){
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();

        System.out.println("Balance in Bank A: " + a.getBalance());
        System.out.println("Balance in Bank B: " + b.getBalance());
        System.out.println("Balance in Bank C: " + c.getBalance());


    }
}
