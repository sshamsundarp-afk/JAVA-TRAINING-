import java.util.Scanner;
public class question4{
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NAME");
        String NAME=sc.nextLine();
        System.out.println("Enter the ROLL NUMBER");  
        String  ROLLNUMBER=sc.nextLine();
        System.out.println("Enter the AGE");
        int AGE=sc.nextInt();
        System.out.println("Enter the DEPARTMENT");
        String DEPARTMENT=sc.nextLine();
        System.out.println("Enter the EMAIL ADDRESS");
        String EMAILADDRESS=sc.nextLine();
        System.out.println("THE STUDENTS DETAILS ARE");
            System.out.println("NAME:"+NAME);
            System.out.println("ROLL NUMBER:"+ROLLNUMBER);
            System.out.println("AGE:"+AGE);
            System.out.println("DEPARTMENT:"+DEPARTMENT);
            System.out.println("EMAIL ADDRESS:"+EMAILADDRESS);
            
    }
}