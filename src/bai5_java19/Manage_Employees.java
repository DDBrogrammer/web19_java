package bai5_java19;
import java.util.Arrays;
import  java.util.Scanner;

public class Manage_Employees {
    static Scanner sc = new Scanner(System.in);
    static void Enter_Employee(Employee employees) {
        System.out.println("Enter employee name: ");
        employees.setName(sc.nextLine());
        System.out.println("Enter employee ID: ");
        employees.setId(sc.nextLine());
        System.out.println("Enter employee age: ");
        employees.setAge(sc.nextLine());
        System.out.println("Enter employee position: ");
        employees.setPosition(sc.nextLine());
        System.out.println("Enter employee salary : ");
        employees.setSalary(sc.nextInt());}

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of employee: ");
       int number_of_Employees=sc.nextInt();


       Employee []employees=new Employee[number_of_Employees];

        for (int i = 0; i < number_of_Employees; i++) {
            System.out.println("Khách hàng số: " + (i+1));
            employees[i] = new Employee();
            Enter_Employee(employees[i]);
        }
        Employee sort=new Employee() ;
        for(int u=0;u<number_of_Employees;u++){
            for (int n=0;n<number_of_Employees;n++){
                if (employees[u].getSalary()>=employees[n].getSalary()){
                    sort=employees[u] ;
                    employees[u]=employees[n];
                    employees[n]=sort;
                }
            }
        }
        System.out.println("Find employees that have age above: ");
        int age=sc.nextInt();
        for(int x=0; x<number_of_Employees;x++){
            if(Integer.parseInt(employees[x].getAge())>=age){
                System.out.println("Employee number: "+x);
                System.out.println("Name: "+employees[x].getName());
                System.out.println("ID"+employees[x].getId());
                System.out.println("Age"+employees[x].getAge());
                System.out.println("Position: "+employees[x].getPosition());
                System.out.println("Salary: "+employees[x].getSalary());
            }
        }
    }



}
