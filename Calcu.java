import java.util.*;
class calu{
    public static void main(String arg[]){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=ob.nextInt();
        System.out.println("Enter 2nd number");
        int b=ob.nextInt();
        System.out.println("Add="+(a+b));
        System.out.println("Sub="+(a-b));
        System.out.println("Mul="+(a*b));
        System.out.println("Div="+(a/b));
        System.out.println("Rem="+(a%b));
    }
}