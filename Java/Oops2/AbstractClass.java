/**An abstract class has a construtor which prints &quot;This is constructor of
abstract class&quot;, an abstract method named &#39;a_method&#39; and a non-abstract
method which prints &quot;This is a normal method of abstract class&quot;. A class
&#39;SubClass&#39; inherits the abstract class and has a method named &#39;a_method&#39;
which prints &quot;This is abstract method&quot;. Now create an object of
&#39;SubClass&#39; and call the abstract method and the non-abstract method.*/ 

abstract class Abstract{
    Abstract(){
        System.out.println("This is constructor of abstract class");
    }
    abstract void a_method();
    void normal_method(){
        System.out.println("This is a normal method of abstract class");
    }
}

class SubClass extends Abstract{
    void a_method(){
        System.out.println("This is abstract method");
    }
}

public class AbstractClass{
    public static void main(String[] args){
        SubClass s = new SubClass();
        s.a_method();
        s.normal_method();
    }
}

