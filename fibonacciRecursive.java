import java.util.Scanner;

public class fibonacciRecursive {
    static int f(int n){

if ((n==1) || (n==2)) {
    return 1 ;
}
        return f(n-1) + f(n-2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci değerini bulmak istediğiniz sayıyı giriniz : ");
        int number = input.nextInt();
        System.out.println();
        System.out.println("Girdiğiniz sayının fibonacci değeri = " + f(number));
    }
}
