package classes_objects.assigment_problems;

public class EmployeeCompanyInformation {static class Employee{String empName;double salary;static String companyName="Bright Horizon Technologies";static int employeeCount=0;Employee(String n,double s){empName=n;salary=s;employeeCount++;}static void printCompanyInfo(){System.out.println(companyName+" | Employees: "+employeeCount);}}public static void main(String[] x){new Employee("Asha",50000);new Employee("Ravi",60000);new Employee("Neha",55000);Employee.printCompanyInfo();}}
