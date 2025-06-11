# S O L I D - Design Principles  

SOLID design principles tell us how to arrange our functions and data structure into classes, and how these classes
should be interconnected.

Here a class is simply a coupled grouping of functions and data. Every programming language/Software system has such 
a groupings, whether it is a class or some other structure.  

The goal of the SOLID principles is the creation of mid level software structure that:  
- Tolerate for changes  
- Are easy to understand, and  
- Are the basis of components that can be used in many software systems.

## S - SRP: Single Responsibility Principle  
Each software module has one, and only one reason to change.  
"The module should be responsible to one, and only one actor."
```java
   interface Employee {
        void calculatePay(); //used by Accounting department.
        void reportHours(); //used by Human Resource department.
        void save(); //used by Database Administration department.
    }   
```
[Employee.java](src/main/java/org/avol/java/solid/srp/Employee.java)
- Employee class has 3 methods are responsible to perform actions for three different departments/actors.
- Assume both calculatePay() and reportHours() shares common algorithm to calculate working hours, and the developer decided to keep this logic in common place.
- Now Human Resource department want to make some change to calculate working hours, and developer made changes to common algorithm, 
and it mess up the Accounting department calculations. 

#### Solution
- Either use dedicated class for each department functionality OR Use Facade pattern to hold very 
little code and responsible for instantiating and delegating to the classes with the functions. 
- Refer [EmployeeFacade.java](src/main/java/org/avol/java/solid/srp/solution/EmployeeFacade.java)

##### Facade Design Pattern  
The Facade Design Pattern is a structural pattern that provides a simplified interface to a set of interfaces in a subsystem, making it easier to use. 
It involves creating a unified interface that sits on top of a set of interfaces to simplify the usage for clients.  
**Features**
- Simplified Interface
- Loose coupling
- Improved Readability and usability
- Encapsulation
- Layered Architecture

## O - OCP: Open Closed Principle  
Must be designed to allow the behaviour of those modules to be changed by adding new code, 
rather than changing existing code.  
"A Software Artifact should be OPEN for Extension but CLOSED for Modifications."
```java
public class PayCalculator {

    public float calculatePay(Object o) {
        if (o instanceof FullTime ft) {
            return ft.calculate();
        } else if (o instanceof PartTime pt) {
            return pt.calculate();
        } else {
            throw new IllegalArgumentException("Invalid Instance.");
        }
    }
}
```
[PayCalculator.java](src/main/java/org/avol/java/solid/ocp/PayCalculator.java)  
- PayCalculator class method calculatePay() is violating Open Closed Principles, what if we want to support new type of employee, 
to do we must make changes to PayCalculator class, which is against OCP.

#### Solution
- Introduce a interface called ```Calculator.java``` and have an abstract method called calculate(), and 
allow ```FullTime, PartTime``` classes to implement.
- If any new type of Employee to be supported, we just have to implement this interface and provide new implementation 
without modifying any existing code.
- So, ```PayCalculator.java#calculatePay()``` is no longer depend on concrete classes, hence it can be extendable to support 
 new employment type by extending ```Calculate.java``` interface.
- [PayCalculator.java](src/main/java/org/avol/java/solid/ocp/solution/PayCalculator.java)

## L - LSP: Liskov Substitution Principle  
Build a software module from interchangeable parts, those parts must adhere to a contract that allow those parts to be 
substituted one for another.  
```java
    public static void main(String[] args) {
      Employee employee = new Employee("Avol", 13000);
      System.out.println(employee.getBonus()); //it returns bonus.
     
      //Violates Liskov Substitution principle.
      Employee contractor = new Contractor("Avol", 12000);
      System.out.println(contractor.getBonus()); //it throws an exception, breaking the behavior. 
                                                    // Hence, we cannot replace parent with subclass.
    }
```
[PayCalculator.java](src/main/java/org/avol/java/solid/lsp/PayCalculator.java)
- We cannot substitute ``` Contractor.java ``` with ```Employee.java``` object, as it breaks the behavior.
- 
#### Solution
- Have an abstract class ```Employee.java``` with abstract method getBonus(), let ```FullTimeEmployee.java``` and 
```ContractEmployee.java``` to extend, and implement getBonus() method with appropriate implementation.
- Refer [PayCalculator.java](src/main/java/org/avol/java/solid/lsp/solution/PayCalculator.java)  

## I - ISP: Interface Segregation Principle
Avoid depending on things that they don't use.    
Client should not be forced to depend on interfaces they do not use. Instead of creating large/bloated interfaces, we should 
split them into smaller, more specific interfaces.  

```java
  public interface EmployeePay {
      /**
       * Applies to all employees.
       * @return
       *  double.
       */
      double getPay();
      /**
       * Applies to only Full time employee.
       * @return
       *  double.
       */
      double getBonus();
      /**
       * Applies to only Contract Employees.
       * @return
       *  double.
       */
      double getShiftAllowances();
  }
```
[EmployeePay.java](src/main/java/org/avol/java/solid/isp/EmployeePay.java)
- ```EmployeePay.java``` interface violates Interface Segregation Principle, not all method applicable to either FullTime or Contract employee.
- It is not a good practice to force implementation classes to implement all methods from interface.

#### Solution
- Split large interface into small interfaces, more specific to implementation classes. Each class should only implement relevant to its.
- Refer [ContractEmployeePay.java](src/main/java/org/avol/java/solid/isp/solution/ContractEmployeePay.java) and [FullTimeEmployeePay.java](src/main/java/org/avol/java/solid/isp/solution/FullTimeEmployeePay.java)

## D - DIP: Dependency Inversion Principle
The code that implements high level policy should not depend on the code that implement low level details. 
Rather, details should depend on policies. It helps to decoupling components, making system more flexible and maintainable.

```java
 public class SalaryCalculator {
 
     private final FullTimeEmployee fullTimeEmployee;
     
     //tightly coupled with FullTimeEmployee object.
     public SalaryCalculator(FullTimeEmployee fullTimeEmployee) {
         this.fullTimeEmployee = fullTimeEmployee;
     }
     
     public double calculate() {
         return fullTimeEmployee.getSalary();
     }
 }
```
- SalaryCalculator is tightly coupled to FullTimeEmployee, making it hard to extend for other employee types. 
- If we introduce Contractor or Intern, we must modify SalaryCalculator, it breaks Open-Closed Principle.

#### Solution
- Introduce a abstract/interface class, and let the SalaryCalculator accepts abstract/interface type instead of Concrete class.
- Refer [SalaryCalculator.java](src/main/java/org/avol/java/solid/dip/solution/SalaryCalculator.java)

