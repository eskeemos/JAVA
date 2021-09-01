// public class Main {
//     int x = 5;
  
//     public static void main(String[] args) {
//       Main myObj = new Main();
//       System.out.println(myObj.x);
//     }
//   }

// public class Main {
//     int x = 5;
  
//     public static void main(String[] args) {
//       Main myObj1 = new Main();  // Object 1
//       Main myObj2 = new Main();  // Object 2
//       myObj2.x = 25;
//       System.out.println(myObj1.x);  // Outputs 5
//       System.out.println(myObj2.x);  // Outputs 25
//     }
//   }

// public class Main {
//     // Static method
//     static void myStaticMethod() {
//       System.out.println("Static methods can be called without creating objects");
//     }
  
//     // Public method
//     public void myPublicMethod() {
//       System.out.println("Public methods must be called by creating objects");
//     }
  
//     // Main method
//     public static void main(String[] args) {
//       myStaticMethod(); // Call the static method
//       // myPublicMethod(); This would compile an error
  
//       Main myObj = new Main(); // Create an object of Main
//       myObj.myPublicMethod(); // Call the public method on the object
//     }
//   }

// // Create a Main class
// public class Main {
 
//     // Create a fullThrottle() method
//     public void fullThrottle() {
//       System.out.println("The car is going as fast as it can!");
//     }
  
//     // Create a speed() method and add a parameter
//     public void speed(int maxSpeed) {
//       System.out.println("Max speed is: " + maxSpeed);
//     }
  
//     // Inside main, call the methods on the myCar object
//     public static void main(String[] args) {
//       Main myCar = new Main();   // Create a myCar object
//       myCar.fullThrottle();      // Call the fullThrottle() method
//       myCar.speed(200);          // Call the speed() method
//     }
//   }
  
//   // The car is going as fast as it can!
//   // Max speed is: 200

// // Create a Main class
// public class Main {
//     int x;  // Create a class attribute
  
//     // Create a class constructor for the Main class
//     public Main() {
//       x = 5;  // Set the initial value for the class attribute x
//     }
  
//     public static void main(String[] args) {
//       Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
//       System.out.println(myObj.x); // Print the value of x
//     }
//   }
  
//   // Outputs 5

// // Code from filename: Main.java
// // abstract class
// abstract class Main {
//     public String fname = "John";
//     public int age = 24;
//     public abstract void study(); // abstract method
//   }
  
//   // Subclass (inherit from Main)
//   class Student extends Main {
//     public int graduationYear = 2018;
//     public void study() { // the body of the abstract method is provided here
//       System.out.println("Studying all day long");
//     }
//   }
//   // End code from filename: Main.java
  
//   // Code from filename: Second.java
//   class Second {
//     public static void main(String[] args) {
//       // create an object of the Student class (which inherits attributes and methods from Main)
//       Student myObj = new Student();
  
//       System.out.println("Name: " + myObj.fname);
//       System.out.println("Age: " + myObj.age);
//       System.out.println("Graduation Year: " + myObj.graduationYear);
//       myObj.study(); // call abstract method
//     }
//   }

// Encapsulation

