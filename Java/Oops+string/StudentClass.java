/*Write a java program to create a class called STUDENT with data
members PRN, Name and age. Using inheritance, create a classes called
UGSTUDENT and PGSTUDENT having fields as semester, fees and
stipend. Enter the data for at least 5 students. Find the semester wise
average age for all UG and PG students separately. */

class Student{
    int PRN;
    String Name;
    int age;
    Student(int PRN,String Name,int age){
        this.PRN = PRN;
        this.Name = Name;
        this.age = age;
    }
}

class UGStudent extends Student{
    int semester;
    int fees;
    int stipend;
    UGStudent(int PRN,String Name,int age,int semester,int fees,int stipend){
        super(PRN,Name,age);
        this.semester = semester;
        this.fees = fees;
        this.stipend = stipend;
    }
}

class PGStudent extends Student{
    int semester;
    int fees;
    int stipend;
    PGStudent(int PRN,String Name,int age,int semester,int fees,int stipend){
        super(PRN,Name,age);
        this.semester = semester;
        this.fees = fees;
        this.stipend = stipend;
    }
}

public class StudentClass{
    public static void main(String[] args){
        UGStudent[] ug = new UGStudent[5];
        PGStudent[] pg = new PGStudent[5];
        ug[0] = new UGStudent(1,"A",20,1,10000,5000);
        ug[1] = new UGStudent(2,"B",21,2,10000,5000);
        ug[2] = new UGStudent(3,"C",22,3,10000,5000);
        ug[3] = new UGStudent(4,"D",23,4,10000,5000);
        ug[4] = new UGStudent(5,"E",24,5,10000,5000);
        pg[0] = new PGStudent(6,"F",25,1,20000,10000);
        pg[1] = new PGStudent(7,"G",26,2,20000,10000);
        pg[2] = new PGStudent(8,"H",27,3,20000,10000);
        pg[3] = new PGStudent(9,"I",28,4,20000,10000);
        pg[4] = new PGStudent(10,"J",29,5,20000,10000);
        int sumUG = 0;
        int sumPG = 0;
        for(int i=0;i<5;i++){
            sumUG += ug[i].age;
            sumPG += pg[i].age;
        }
        System.out.println("Average age of UG students: "+ sumUG/5);
        System.out.println("Average age of PG students: "+ sumPG/5);
    }
}