import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int number;
        System.out.println("please enter the number :");
        Scanner r = new Scanner(System.in);
        number=r.nextInt();
        for(int i=0; i<number; i++){
            System.out.println(i);
        }
    }
}