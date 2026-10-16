import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value a");
        int a=sc.nextInt();
        System.out.println("Enter the value b");
        int b=sc.nextInt();
        System.out.println("1.Addtion\n"+"2.Subtraction\n"+"3.Multiplication\n"+"4.Division\n");
        int operator=sc.nextInt();
        switch(operator){
            case 1:
            System.out.println("Addtion="+(a+b));
        break;
                case 2:
            System.out.println("Subtraction="+(a-b));
        break;
                case 3:
            System.out.println("Multiplication="+(a*b));
        break;
                case 4:
            System.out.println("Division="+(a/b));
        break;
    }
    }
}