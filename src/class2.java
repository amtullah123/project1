import java.util.Scanner;
class class2 {
public static void main(String[]args){
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter an integer");
    num=sc.nextInt();
    if((num%2!=0)&&(num>20) && (num<30))
        System.out.println("Tom");
    else if((num%2==0)&&(num>20) && (num<30))
        System.out.println("Jerry");

}
}
