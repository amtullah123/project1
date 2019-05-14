import java.util.Scanner;
public class Class6 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        char var;
        System.out.println("ENTER character");
        var=sc.next().charAt(0);
        if(var>='a'&&var<='z')
            System.out.println("input is lowercase");
        else if(var>='A'&&var<='Z')
            System.out.println("input is uppercase");
        else if(var>='0'&&var<='9')
            System.out.println("input is digit");
    }
    }

