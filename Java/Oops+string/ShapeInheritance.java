/*Create a class named &#39;Shape&#39; with a method to print &quot;This is This is
shape&quot;. Then create two other classes named &#39;Rectangle&#39;, &#39;Circle&#39;
inheriting the Shape class, both having a method to print &quot;This is
rectangular shape&quot; and &quot;This is circular shape&quot; respectively. Create a
subclass &#39;Square&#39; of &#39;Rectangle&#39; having a method to print &quot;Square is a
rectangle&quot;. Now call the method of &#39;Shape&#39; and &#39;Rectangle&#39; class by the
object of &#39;Square&#39; class.*/

class Shape{
    public void printShape(){
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape{
    public void printRectangle(){
        System.out.println("This is rectangular shape");

    }
}

class Circle extends Shape{
    public void printCircle(){
        System.out.println("This is circular shape");   
    }
}

class Square extends Rectangle{
    public void printSquare(){
        System.out.println("This is a square shape");

    }

    //override the printshape method of the shape class to print square is a rectangle  
    @Override
    public void printShape(){
        System.out.println("Square is a rectangle");
    }
}

public class ShapeInheritance{
    public static void main(String[] args){
        Square square = new Square();
        square.printShape(); //calling the orintShape method of the shape class
        square.printRectangle(); //calling the printRectangle method of the Rectangle class     

         
    }
}
