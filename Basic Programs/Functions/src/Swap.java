import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        swap(a,b);
        System.out.println(a + " "  +b);

    }
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;

    }
}
