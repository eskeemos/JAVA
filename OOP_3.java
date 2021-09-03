// import java.time.LocalDate; // import the LocalDate class

// public class Main {
//   public static void main(String[] args) {
//     LocalDate myObj = LocalDate.now(); // Create a date object
//     System.out.println(myObj); // Display the current date
//   }
// }

// import java.time.LocalDateTime; // Import the LocalDateTime class
// import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

// public class Main {
//   public static void main(String[] args) {
//     LocalDateTime myDateObj = LocalDateTime.now();
//     System.out.println("Before formatting: " + myDateObj);
//     DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

//     String formattedDate = myDateObj.format(myFormatObj);
//     System.out.println("After formatting: " + formattedDate);
//   }
// }

// import java.util.ArrayList;

// public class Main {
//   public static void main(String[] args) {
//     ArrayList<String> cars = new ArrayList<String>();
//     cars.add("Volvo");
//     cars.add("BMW");
//     cars.add("Ford");
//     cars.add("Mazda");
//     System.out.println(cars);
//   }
// }

// import java.util.ArrayList;
// import java.util.Collections;  // Import the Collections class

// public class Main {
//   public static void main(String[] args) {
//     ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//     myNumbers.add(33);
//     myNumbers.add(15);
//     myNumbers.add(20);
//     myNumbers.add(34);
//     myNumbers.add(8);
//     myNumbers.add(12);

//     Collections.sort(myNumbers);  // Sort myNumbers

//     for (int i : myNumbers) {
//       System.out.println(i);
//     }
//   }
// }

// // Import the HashMap class
// import java.util.HashMap;

// public class Main {
//   public static void main(String[] args) {
//     // Create a HashMap object called capitalCities
//     HashMap<String, String> capitalCities = new HashMap<String, String>();

//     // Add keys and values (Country, City)
//     capitalCities.put("England", "London");
//     capitalCities.put("Germany", "Berlin");
//     capitalCities.put("Norway", "Oslo");
//     capitalCities.put("USA", "Washington DC");
//     System.out.println(capitalCities);
//   }
// }

// // Import the HashMap class
// import java.util.HashMap;

// public class Main {
//   public static void main(String[] args) {

//     // Create a HashMap object called people
//     HashMap<String, Integer> people = new HashMap<String, Integer>();


//     // Add keys and values (Name, Age)
//     people.put("John", 32);
//     people.put("Steve", 30);
//     people.put("Angie", 33);

//     for (String i : people.keySet()) {
//       System.out.println("key: " + i + " value: " + people.get(i));
//     }
//   }
// }

// import java.util.HashSet;

// public class Main {
//   public static void main(String[] args) {

//     // Create a HashSet object called numbers
//     HashSet<Integer> numbers = new HashSet<Integer>();

//     // Add values to the set
//     numbers.add(4);
//     numbers.add(7);
//     numbers.add(8);

//     // Show which numbers between 1 and 10 are in the set
//     for(int i = 1; i <= 10; i++) {
//       if(numbers.contains(i)) {
//         System.out.println(i + " was found in the set.");
//       } else {
//         System.out.println(i + " was not found in the set.");
//       }
//     }
//   }
// }

// // Import the ArrayList class and the Iterator class
// import java.util.ArrayList;
// import java.util.Iterator;

// public class Main {
//   public static void main(String[] args) {

//     // Make a collection
//     ArrayList<String> cars = new ArrayList<String>();
//     cars.add("Volvo");
//     cars.add("BMW");
//     cars.add("Ford");
//     cars.add("Mazda");

//     // Get the iterator
//     Iterator<String> it = cars.iterator();

//     // Print the first item
//     System.out.println(it.next());
//   }
// }

// public class Main {
//     public static void main(String[] args) {
//       Integer myInt = 5;
//       Double myDouble = 5.99;
//       Character myChar = 'A';
//       System.out.println(myInt);
//       System.out.println(myDouble);
//       System.out.println(myChar);
//     }
//   }

// public class Main {
//     static void checkAge(int age) {
//       if (age < 18) {
//         throw new ArithmeticException("Access denied - You must be at least 18 years old.");
//       }
//       else {
//         System.out.println("Access granted - You are old enough!");
//       }
//     }
  
//     public static void main(String[] args) {
//       checkAge(15); // Set age to 15 (which is below 18...)
//     }
//   }

// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class Main {
//   public static void main(String[] args) {
//     Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
//     Matcher matcher = pattern.matcher("Visit W3Schools!");
//     boolean matchFound = matcher.find();
//     if(matchFound) {
//       System.out.println("Match found");
//     } else {
//       System.out.println("Match not found");
//     }
//   }
// }
// // Outputs Match found

// public class Main extends Thread {
//     public static void main(String[] args) {
//       Main thread = new Main();
//       thread.start();
//       System.out.println("This code is outside of the thread");
//     }
//     public void run() {
//       System.out.println("This code is running in a thread");
//     }
//   }

// public class Main extends Thread {
//     public static int amount = 0;
  
//     public static void main(String[] args) {
//       Main thread = new Main();
//       thread.start();
//       // Wait for the thread to finish
//       while(thread.isAlive()) {
//       System.out.println("Waiting...");
//     }
//     // Update amount and print its value
//     System.out.println("Main: " + amount);
//     amount++;
//     System.out.println("Main: " + amount);
//     }
//     public void run() {
//       amount++;
//     }
//   }

