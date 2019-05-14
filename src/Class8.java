import java.util.Scanner;
public class Class8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int guess = 30;
        System.out.println("enter a number");
        num = sc.nextInt();
        do {
            if (num > 30)
                System.out.println("Number guessed is more than original number");
            else if (num < 30)
                System.out.println("Number guessed is less than original number");
            else if (num == 30)
                System.out.println("Number guessed is equal to original number");
            return;
        }
        while (num != guess);
    }
}