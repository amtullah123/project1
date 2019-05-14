import java.util.Scanner;
public class Class5 {
    public static void main(String[] args) {
        int num, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of elements in an array");
        num=sc.nextInt();
        int a[]=new int[num];
        System.out.println("enter the elements");
        for(int i=0;i<num;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println("sum is" +sum);
    }
}
