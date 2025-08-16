package lab1;


public class Employee {
        String name;
        String id;
        double salary;
        //storing Employee details
        Employee(String name,String id, int salary ){
                this.name = name;
                this.id = id;
                this.salary= salary;
        }
        //displaying the  details
        void displaydetails() {
                System.out.println("Employee name: "+this.name);
                System.out.println("Employee ID: "+this.id);
                System.out.println("Employee Salary: "+this.salary);

        }
        //salary increment
        void increaseinsalary(int percentage) {
                double  increment = (percentage*this.salary)/100;
                this.salary=increment+this.salary;
                System.out.println("Incremented salary of the employee is "+this.salary );
        }



public static void main(String []args) {
        //Employee details
        Employee e1 =new Employee("Kshithij","NNM24IS113",50000);
        Employee e2 =new Employee("Dhanush","NNM24IS008",58000);
        //intial Details
        //Employee 1
        System.out.println(e1.name +" Initial details :");
        System.out.println("Employee name is "+e1.name);
        System.out.println("Employee ID is "+e1.id);
        System.out.println("Employee salary is "+e1.salary);
        e1.displaydetails();

        //Employee 2
        System.out.println(e2.name +" Initial details :");
        System.out.println("Employee name is "+e2.name);
        System.out.println("Employee ID is "+e2.id);
        System.out.println("Employee salary is "+e2.salary);
        e2.displaydetails();

        //increasing salary
        e1.increaseinsalary(20);
        e2.increaseinsalary(10);
        //final deatails
        //Employee 1
               System.out.println(e1.name +" Initial details :");
                System.out.println("Employee name is "+e1.name);
                System.out.println("Employee ID is "+e1.id);
                System.out.println("Employee salary is "+e1.salary);
                e1.displaydetails();
                //Employee
                
                System.out.println(e2.name +" Initial details :");
                System.out.println("Employee name is "+e2.name);
                System.out.println("Employee ID is "+e2.id);
                System.out.println("Employee salary is "+e2.salary);
                e2.displaydetails();




}

    
    
}
