# S O L I D - Design Principles  

SOLID design principles tell us how to arrange ou
r functions and data structure into classes, and how these classes
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
   interface EmployeeService {
        void calculatePay(); //used by Accounting department.
        void reportHours(); //used by Human Resource department.
        void update(); //used by Administrative department.
    }   
```
[Employee.java](src/main/java/org/avol/java/solid/srp/Employee.java)

```markdown
- The Employee class contains three methods, each serving a different department or actor.
- Both `calculatePay()` and `reportHours()` use a shared algorithm for calculating working hours, which was placed in a common location.
- When the Human Resources department requested a change to the working hours calculation, the developer updated the shared logic, 
  unintentionally affecting the Accounting department's calculations. Violation of Single Responsibility Principle.
```

#### Solution
```markdown
- Use a dedicated class for each department's functionality, or apply the Facade pattern to create a simple interface that delegates to specialized classes.
- This keeps each class focused and maintains clear separation of responsibilities.
- See \[EmployeeFacade.java\]\(src/main/java/org/avol/java/solid/srp/solution/EmployeeFacade.java\) for an example.
```

##### What is Facade Design Pattern?  
The Facade Design Pattern is a structural pattern that provides a simplified interface to a set of interfaces in a subsystem, making it easier to use. 
It involves creating a unified interface that sits on top of a set of interfaces to simplify the usage for clients.  
**Features**
- Simplified Interface
- Loose coupling
- Improved Readability and usability
- Encapsulation
- Layered Architecture

## O - OCP: Open Closed Principle  
Must be designed to allow the behaviour of those modules to be changed by adding new code, rather than changing existing code.  
"A Software Artifact should be OPEN for Extension but CLOSED for Modifications."
```java
public class PayCalculator {

    public float calculatePay(Object o) {
        if (o instanceof FullTime ft) {
            return ft.calculatePay();
        } else if (o instanceof PartTime pt) {
            return pt.calculatePay();
        } else {
            throw new IllegalArgumentException("Invalid Instance.");
        }
    }
}
```
```markdown
- [PayCalculator.java](src/main/java/org/avol/java/solid/ocp/PayCalculator.java)  
- The `calculatePay()` method in the `PayCalculator` class violates the Open Closed Principle. If a new employee type needs to be supported, the class must be modified, which goes against OCP.
```

#### Solution
```markdown
- Define an interface called [CalculatePay.java](src/main/java/org/avol/java/solid/ocp/solution/CalculatePay.java) with an abstract `calculate()` method.
- Let classes like [FullTimeEmployeePay.java](src/main/java/org/avol/java/solid/ocp/solution/FullTimeEmployeePay.java) and [PartTimeEmployeePay.java](src/main/java/org/avol/java/solid/ocp/solution/PartTimeEmployeePay.java) implement this interface.
- To support a new employee type, simply implement the interface in a new class, without changing existing code.
- This way, `PayCalculator.java#calculatePay()` depends only on the interface, making it easy to extend for new types.
- See [PayCalculator.java](src/main/java/org/avol/java/solid/ocp/solution/PayCalculator.java) for an example.
```

## L - LSP: Liskov Substitution Principle  
Build a software module from interchangeable parts, those parts must adhere to a contract that allow those parts to be 
substituted one for another.  
```java
   public class PayCalculator {

    public static void main(String[] args) {
        Employee employee = new Employee("Avol", 13000);
        calculateBonus(employee); //it works without any issue.

        //Violates Liskov Substitution principle.
        Employee contractor = new ContractEmployee("Avol", 12000);
        calculateBonus(contractor); //it throws an exception, breaking the behavior.
        // Hence, we cannot replace parent with subclass, violates Liskov Substitution.
    }

    public static double calculateBonus(Employee employee) {
        return employee.getBonus();
    }
}
```

```markdown
- [PayCalculator.java](src/main/java/org/avol/java/solid/lsp/PayCalculator.java)
- [ContractEmployee.java](src/main/java/org/avol/java/solid/lsp/ContractEmployee.java) is extending from [Employee.java](src/main/java/org/avol/java/solid/lsp/Employee.java), 
  hence we should be able to interchange objects while calling ```PayCalculator.java#calculateBonus()``` method, But we cannot. 
  The reason is behavior of ```getBonus()``` method in  [Employee.java](src/main/java/org/avol/java/solid/lsp/solution/Employee.java) has been changed in [ContractEmployee.java](src/main/java/org/avol/java/solid/lsp/ContractEmployee.java) 
  class, which exhibits unexpected behavior by throwing an exception.
- [ContractEmployee.java](src/main/java/org/avol/java/solid/lsp/ContractEmployee.java) class implementation violates Liskov Substitute Principle.
```
 
#### Solution
```markdown
- Have an abstract class [Employee.java](src/main/java/org/avol/java/solid/lsp/solution/Employee.java), and implement
- Have an abstract class ```Employee.java``` with abstract method getBonus(), let ```FullTimeEmployee.java``` and 
```ContractEmployee.java``` to extend, and implement getBonus() method with appropriate implementation.
- Refer [PayCalculator.java](src/main/java/org/avol/java/solid/lsp/solution/PayCalculator.java)
```

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

```markdown
- See `EmployeePay.java` at `src/main/java/org/avol/java/solid/isp/EmployeePay.java`.
- The `EmployeePay.java` interface violates the Interface Segregation Principle because not all methods are relevant to every implementation (e.g., FullTime or Contract employees).
- Forcing all implementation classes to provide all interface methods leads to unnecessary and inappropriate code.
```

#### Solution
- Split large interfaces into smaller, more specific ones tailored to each implementation class. Each class should implement only the interfaces relevant to its functionality.
- See [ContractEmployeePay.java](src/main/java/org/avol/java/solid/isp/solution/ContractEmployeePay.java) and [FullTimeEmployeePay.java](src/main/java/org/avol/java/solid/isp/solution/FullTimeEmployeePay.java)


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
     
     public double calculatePay() {
         return fullTimeEmployee.getSalary();
     }
 }
```

```markdown
- `SalaryCalculator` is directly dependent on [FullTimeEmployee.java](src/main/java/org/avol/java/solid/dip/FullTimeEmployee.java), which limits its flexibility for other employee types.  
- Adding new types like Contractor or Intern would require modifying `SalaryCalculator`, violating the Open-Closed Principle.
```
#### Solution
```markdown
- Introduce an abstract class or interface [Employee.java](src/main/java/org/avol/java/solid/dip/solution/Employee.java), and implement this interface for .
- See `src/main/java/org/avol/java/solid/dip/solution/SalaryCalculator.java` for an example.
```

