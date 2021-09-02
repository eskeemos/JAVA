// public class Person {
//     private String name; // private = restricted access
  
//     // Getter
//     public String getName() {
//       return name;
//     }
  
//     // Setter
//     public void setName(String newName) {
//       this.name = newName;
//     }
//   }

// import java.util.Scanner;

// class MyClass {
//   public static void main(String[] args) {
//     Scanner myObj = new Scanner(System.in);
//     System.out.println("Enter username");

//     String userName = myObj.nextLine();
//     System.out.println("Username is: " + userName);
//   }
// }

// class Vehicle {
//     protected String brand = "Ford";        // Vehicle attribute
//     public void honk() {                    // Vehicle method
//       System.out.println("Tuut, tuut!");
//     }
//   }
  
//   class Car extends Vehicle {
//     private String modelName = "Mustang";    // Car attribute
//     public static void main(String[] args) {
  
//       // Create a myCar object
//       Car myCar = new Car();
  
//       // Call the honk() method (from the Vehicle class) on the myCar object
//       myCar.honk();
  
//       // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
//       System.out.println(myCar.brand + " " + myCar.modelName);
//     }
//   }

// class Animal {
//     public void animalSound() {
//       System.out.println("The animal makes a sound");
//     }
//   }
  
//   class Pig extends Animal {
//     public void animalSound() {
//       System.out.println("The pig says: wee wee");
//     }
//   }
  
//   class Dog extends Animal {
//     public void animalSound() {
//       System.out.println("The dog says: bow wow");
//     }
//   }
  
//   class Main {
//     public static void main(String[] args) {
//       Animal myAnimal = new Animal();  // Create a Animal object
//       Animal myPig = new Pig();  // Create a Pig object
//       Animal myDog = new Dog();  // Create a Dog object
//       myAnimal.animalSound();
//       myPig.animalSound();
//       myDog.animalSound();
//     }
//   }

// class OuterClass {
//     int x = 10;
  
//     class InnerClass {
//       int y = 5;
//     }
//   }
  
//   public class Main {
//     public static void main(String[] args) {
//       OuterClass myOuter = new OuterClass();
//       OuterClass.InnerClass myInner = myOuter.new InnerClass();
//       System.out.println(myInner.y + myOuter.x);
//     }
//   }
  
//   // Outputs 15 (5 + 10)

// class OuterClass {
//     int x = 10;
  
//     static class InnerClass {
//       int y = 5;
//     }
//   }
  
//   public class Main {
//     public static void main(String[] args) {
//       OuterClass.InnerClass myInner = new OuterClass.InnerClass();
//       System.out.println(myInner.y);
//     }
//   }
  
//   // Outputs 5

// // Abstract class
// abstract class Animal {
//     // Abstract method (does not have a body)
//     public abstract void animalSound();
//     // Regular method
//     public void sleep() {
//       System.out.println("Zzz");
//     }
//   }
  
//   // Subclass (inherit from Animal)
//   class Pig extends Animal {
//     public void animalSound() {
//       // The body of animalSound() is provided here
//       System.out.println("The pig says: wee wee");
//     }
//   }
  
//   class Main {
//     public static void main(String[] args) {
//       Pig myPig = new Pig(); // Create a Pig object
//       myPig.animalSound();
//       myPig.sleep();
//     }
//   }

// // Interface
// interface Animal {
//     public void animalSound(); // interface method (does not have a body)
//     public void sleep(); // interface method (does not have a body)
//   }
  
//   // Pig "implements" the Animal interface
//   class Pig implements Animal {
//     public void animalSound() {
//       // The body of animalSound() is provided here
//       System.out.println("The pig says: wee wee");
//     }
//     public void sleep() {
//       // The body of sleep() is provided here
//       System.out.println("Zzz");
//     }
//   }
  
//   class Main {
//     public static void main(String[] args) {
//       Pig myPig = new Pig();  // Create a Pig object
//       myPig.animalSound();
//       myPig.sleep();
//     }
//   }

// enum Level {
//     LOW,
//     MEDIUM,
//     HIGH
//   }
  
//   public class Main {
//     public static void main(String[] args) {
//       Level myVar = Level.MEDIUM;
  
//       switch(myVar) {
//         case LOW:
//           System.out.println("Low level");
//           break;
//         case MEDIUM:
//            System.out.println("Medium level");
//           break;
//         case HIGH:
//           System.out.println("High level");
//           break;
//       }
//     }
//   }

// import java.util.Scanner;  // Import the Scanner class

// class Main {
//   public static void main(String[] args) {
//     Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//     System.out.println("Enter username");

//     String userName = myObj.nextLine();  // Read user input
//     System.out.println("Username is: " + userName);  // Output user input
//   }
// }

// Bis Java User Input