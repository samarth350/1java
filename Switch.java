import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        int a=10,b=5;
        float c=1.2f,d=1.1f;
        double h=2.24d,g=1.12d;
        short i=5,j=5;
        long o=6l,p=3l;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        switch(n){
            case 1:
            System.out.println("Addition is:"+(a+b));
            break;
            case 2:
            System.out.println("Subtraction is is:"+(c-d));
            break;
            case 3:
            System.out.println("Multiplication is:"+(h*g));
            break;
            case 4:
            System.out.println("Division is:"+(i/j));
            break;
            case 5:
            System.out.println("Modulus is:"+(o%p));
            break;
            default:
            System.out.println("Invalid operation");
            break;
        }
    }
}

