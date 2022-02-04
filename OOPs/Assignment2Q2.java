class Employee{
    int getSalary(int salary){
        return salary;
    }
}

class Manager extends Employee{
    @Override
    int getSalary(int salary){
        int incentive = 5000;
        return (incentive + salary);
    }
}

class Labour extends Employee{
    @Override
    int getSalary(int salary){
        int overtime = 500;
        return (overtime + salary);
    }
}


public class Assignment2Q2 {

    public static void main(String[] args) {
        int salary = 10000;
        
        Manager manager = new Manager();

        
        Labour labour = new Labour();

        System.out.println("Salary of the Manager in the Organization: "+manager.getSalary(salary));

        System.out.println("Salary of the Labour in the Organization: "+labour.getSalary(salary));

    }
}