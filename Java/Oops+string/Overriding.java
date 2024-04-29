/*Write a Java Program to demonstrate Method overriding.( create class
Result with method result(). Override method result() in UGResult and
PGResult class */

class Result{
    public void result(){
        System.out.println("Result in parent class");

    }

}

class UGResult extends Result{
    @Override
    public void result(){
        System.out.println("Result in UG class");
    }
}

class PGResult extends Result{
    @Override
    public void result(){
        System.out.println("Result in PG class");
    }
}
    
public class Overriding{
    public static void main(String[] args){
        UGResult ugresult = new UGResult();
        ugresult.result();

        PGResult pgresult = new PGResult();
        pgresult.result();
    }
}
