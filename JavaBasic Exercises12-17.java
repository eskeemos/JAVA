// 12
import java.util.Scanner; 
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        System.out.printf("%.2f",((a+b+c) / 3f));
    }
}
// 13
class Main {
    public static void main(String[] args) {
        double w = 5.6;
        double h = 8.5;
        System.out.printf("Area is %.1f * %.1f = %.2f\n", w,h, (w*h));
        System.out.printf("Perimeter is 2 * (%.1f * %.1f) = %.2f", w,h, ((w+h)*2));
    }
}
// 14
class Main {
    public static void main(String[] args) {
        System.out.print("* * * * * * ==================================\n" +
                         " * * * * *  ==================================\n" +
                         "* * * * * * ==================================\n" +
                         " * * * * *  ==================================\n" +
                         "* * * * * * ==================================\n" +
                         " * * * * *  ==================================\n" +
                         "* * * * * * ==================================\n" +
                         " * * * * *  ==================================\n" +
                         "* * * * * * ==================================\n" +
                         "==============================================\n" +
                         "==============================================\n" +
                         "==============================================\n" +
                         "==============================================\n" +
                         "==============================================\n" + 
                         "==============================================");
    }
}
// 15
class Main {
    public static void main(String[] args) {
        int a, b, c;
        a = 5;b=13;
        System.out.printf("Before : a = %d, b = %d\n",a,b);
        c = a;a = b;b = c;
        System.out.printf("After : a = %d, b = %d",a,b);
    }
}
// 16
class Main {
    public static void main(String[] args) {
        System.out.print(" +\"\"\"\"\"+ \n" +
                         "[| o o |]\n" +
                         " |  ^  | \n" +
                         " | '-' | \n" +
                         " +-----+\n");
    }
}
// 17
class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 11;

        int[] r = new int[3];
        int i = 0, remainder = 0;

        while(a != 0 || b != 0){
            r[i++] = (int)((a % 10 + b % 10 + remainder) % 2);
            remainder = (int)((a % 10 + b % 10 + remainder) / 2);
            a /= 10;
            b /= 10;
        }
        if (remainder != 0) {
            r[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(r[i--]);
        }
    }
}