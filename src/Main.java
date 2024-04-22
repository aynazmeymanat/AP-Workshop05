/**
 * @author aynaz meymanat
 * @author aynazmeymanat@aut.ac.ir
 * @version 1.0.2
 * @since 2024/04/13
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("choose one of the following item");
        System.out.println("1:sum   2:subtract  3:multiply  4:divide    5:factorial   6:pow");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n==1){
            System.out.println("enter a first number");
            int x = input.nextInt();
            System.out.println("enter a second number");
            int y = input.nextInt();
            int res;
            AUTMath temp = new AUTMath();
            res = temp.sum(x,y);
            System.out.println(res);
        }
        else if (n==2){
            System.out.println("enter a first number");
            int x = input.nextInt();
            System.out.println("enter a second number");
            int y = input.nextInt();
            int res;
            AUTMath temp = new AUTMath();
            res = temp.subtract(x,y);
            System.out.println(res);
        }
        else if (n==3){
            System.out.println("enter a first number");
            int x = input.nextInt();
            System.out.println("enter a second number");
            int y = input.nextInt();
            int res;
            AUTMath temp = new AUTMath();
            res = temp.multiply(x,y);
            System.out.println(res);
        }
        else if (n==4){
            System.out.println("enter a first number");
            int x = input.nextInt();
            System.out.println("enter a second number");
            int y = input.nextInt();
            int res;
            AUTMath temp = new AUTMath();
            res = temp.divide(x,y);
            System.out.println(res);
        }
        else if (n==5){
            System.out.println("enter a first number");
            int x = input.nextInt();
            int res;
            AUTMath temp = new AUTMath();
            res = temp.factorial(x);
            System.out.println(res);
        }
        else if (n==6){
            System.out.println("enter a first number");
            int x = input.nextInt();
            System.out.println("enter a second number");
            int y = input.nextInt();
            int res;
            AUTMath temp = new AUTMath();
            res = temp.pow(x,y);
            System.out.println(res);
        }


    }


}
