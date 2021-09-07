// 1
public class Main {
    public static void main(String[] args){
        System.out.println("Hello");
        System.out.println("Alexandra Abramov");
    }
}
// 2
public class Main {
    public static void main(String[] args){
        System.out.println(74 + 36);
    }
}
// 3
public class Main {
    public static void main(String[] args){
        System.out.println(50/3);
    }
}
// 4
public class Main {
    public static void main(String[] args){
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }
}
// 5
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int r = a * b;
        System.out.printf("%d x %d = %d", a, b ,r)  ;  
    }
}
// 6
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.printf("%d + %d = %d\n", a, b, (a+b));
        System.out.printf("%d - %d = %d\n", a, b, (a-b)); 
        System.out.printf("%d x %d = %d\n", a, b, (a*b)); 
        System.out.printf("%d / %d = %d\n", a, b, (a/b)); 
        System.out.printf("%d mod %d = %d", a, b, (a%b));   
    }
}
// 7
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i =0;i<=10;i++){
            System.out.printf("%d x %d = %d\n",a,i,(a*i));
        } 
    }
}
// 8
public class Main {
    public static void main(String[] args){
        System.out.println("   J    a   v     v  a   ");
        System.out.println("   J   a a   v   v  a a  ");
        System.out.println("J  J  aaaaa   V V  aaaaa ");
        System.out.println(" JJ  a     a   V  a     a");
    }
}
// 9
public class Main {
    public static void main(String[] args){
        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    }
}
// 10
public class Main {
    public static void main(String[] args){
        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
    }
}
// 11
public class Main {
    public static void main(String[] args){
        double radius = 7.5;
        System.out.println("Perimeter is = " + 2*radius*Math.PI);
        System.out.println("Area is = " + radius*radius*Math.PI);
    }
}