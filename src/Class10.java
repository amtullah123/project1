import java.util.Scanner;
public class Class10 {
    public static void main(String[]args)
    {
        String s;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        s=sc.nextLine();
        System.out.println("enter a number");
        n=sc.nextInt();
        String sub=s.substring(s.length()-n);
        for(int i=0;i<n;i++)
        {
            s=s+sub;
        }
        System.out.println(s);
    }
}
