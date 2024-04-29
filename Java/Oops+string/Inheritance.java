/*Create game characters using the concept of inheritance. Suppose, in your
game, you want three characters - a maths teacher, a footballer and a
businessman. Since, all of the characters are persons, they can walk and
talk. However, they also have some special skills.*/

class Person{
    public void walk(){
        System.out.println("Person can walk");
    }
    public void talk(){
        System.out.println("Person can talk");  
    }

}

class MathTeacher extends Person{
    public void teachMaths(){
        System.out.println("Math teacher can teach maths");
    }
}

class FootBaller extends Person{
    public void PlayFootball(){
        System.out.println("FootBaller can play footbal");
    }
}

class BusinessMan extends Public{
    public void doBusiness(){
        System.out.println("Businessman can do business");
    }
}

public class Inheritance{
    public static void main(String[] args){
        MathTeacher mathteacher = new MathTeacher();
        mathteacher.walk();
        mathteacher.talk();
        mathteacher.teachMaths();

        FootBaller footballer = new FootBaller();
        footballer.walk();
        footballer.talk();
        footballer.PlayFootball();

        BusinessMan businessman = new BusinessMan();
        businessman.walk();
        businessman.talk();
        businessman.doBusiness();

        
    }
}