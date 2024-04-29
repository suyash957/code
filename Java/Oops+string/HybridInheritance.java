/*Implement hybrid inheritance using all access specifiers (public, private,
protected).*/

class A{
    public void display(){
        System.out.println("Class A");
    }
}

class B extends A{
    private void display(){
        System.out.println("Class B");
    }
}

class C extends A{
    protected void display(){
        System.out.println("Class C");
    }
}

class D extends B{
    public void display(){
        System.out.println("Class D");
    }
}

public class HybridInheritance{
    public static void main(String[] args){
        D d = new D();
        d.display();
    }
}


