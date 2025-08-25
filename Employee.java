
package lab1;

public class Employee {
   String name;
   String id;
   double salary;

   Employee(String var1, String var2, int var3) {
      this.name = var1;
      this.id = var2;
      this.salary = (double)var3;
   }

   void displaydetails() {
      System.out.println("Employee name: " + this.name);
      System.out.println("Employee ID: " + this.id);
      System.out.println("Employee Salary: " + this.salary);
   }

   void increaseinsalary(int var1) {
      double var2 = (double)var1 * this.salary / 100.0;
      this.salary += var2;
      System.out.println("Incremented salary of the employee is " + this.salary);
   }

}