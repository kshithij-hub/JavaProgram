package lab1;

public class Main {

public static void main (String[] var0) {
	
	
      Employee var1 = new Employee("Kshithij", "NNM24IS113", 50000);
      Employee var2 = new Employee("Dhanush", "NNM24IS008", 58000);
      System.out.println(var1.name + " Initial details :");
      System.out.println("Employee name is " + var1.name);
      System.out.println("Employee ID is " + var1.id);
      System.out.println("Employee salary is " + var1.salary);
      var1.displaydetails();
      
      
      System.out.println(var2.name + " Initial details :");
      System.out.println("Employee name is " + var2.name);
      System.out.println("Employee ID is " + var2.id);
      System.out.println("Employee salary is " + var2.salary);
      var2.displaydetails();
      
      
      var1.increaseinsalary(20);
      var2.increaseinsalary(10);
      
      
      System.out.println(var1.name + " Initial details :");
      System.out.println("Employee name is " + var1.name);
      System.out.println("Employee ID is " + var1.id);
      System.out.println("Employee salary is " + var1.salary);
      var1.displaydetails();
      
      
      System.out.println(var2.name + " Initial details :");
      System.out.println("Employee name is " + var2.name);
      System.out.println("Employee ID is " + var2.id);
      System.out.println("Employee salary is " + var2.salary);
      var2.displaydetails();
      
      
   }
}


