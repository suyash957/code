/*WAP to manage the employee allowance from a specific department by
creating class structure as follow,
InheritanceEx2
|
|
InheritanceEx2Main.java
|
|- dept | Deparment.java
|
|
|
|- emp | Employee.java extends Department
|
|
|
|- allowance | Allowance.java extends Employee
|
| [Multilevel Inheritance]*/ 

class Department{
    public void manageDept(){
        System.out.println("Department manages the employees");
    }
}

class Employee extends Department{
    public void manageEmp(){
        System.out.println("Employee manages the allowance");
    }
}

class Allowance extends Employee{
    public void manageAllowance(){
        System.out.println("Allowance manages the salary");
    }
}

public class InheritanceEx2{
    public static void main(String[] args){
        Allowance allowance = new Allowance();
        allowance.manageDept();
        allowance.manageEmp();
        allowance.manageAllowance();
    }
}