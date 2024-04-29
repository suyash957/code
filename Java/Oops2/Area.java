

abstract class Shape{
    abstract void RectangleArea(int length,int breadth);
    abstract void SquareArea(int side);
    abstract void CircleArea(int radius);
}

class Area extends Shape{
    void RectangleArea(int length,int breadth){
        System.out.println("Area of Rectangle is: "+ (length*breadth));
    }
    void SquareArea(int side){
        System.out.println("Area of Square is : "+ (side*side));
    }

    void CircleArea(int radius){
        System.out.println("Area of Circle is : "+ (3.14*radius*radius));
    }


    public static void main(String[] args){
        Area a = new Area();
        a.RectangleArea(10,12);
        a.SquareArea(10);
        a.CircleArea(10);

    }
}

