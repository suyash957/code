/*12. Write a program to implement a class Teacher contains two fields Name
and Qualification. Extend the class to Department, it contains Dept. No
and Dept. Name. An Interface named as College it contains one field
Name of the College. Using the above classes and Interface get the
appropriate information and display it.*/

class Teacher{
    String Name;
    String Qualification;
    Teacher(String Name,String Qualification){
        this.Name = Name;
        this.Qualification = Qualification;
    }
}

class Department extends Teacher{
    int DeptNo;
    String DeptName;
    Department(String Name,String Qualification,int DeptNo,String DeptName){
        super(Name,Qualification);
        this.DeptNo = DeptNo;
        this.DeptName = DeptName;
    }
}

interface College{
    String CollegeName = "VIT";
}

public class TeacherClass{
    public static void main(String[] args){
        Department d = new Department("A","B",1,"CSE");
        System.out.println("Name: "+d.Name);
        System.out.println("Qualification: "+d.Qualification);
        System.out.println("Dept No: "+d.DeptNo);
        System.out.println("Dept Name: "+d.DeptName);
        System.out.println("College Name: "+College.CollegeName);
    }
}

        