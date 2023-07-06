import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        int num1 = in.nextInt();
        System.out.print("Input a number 2: ");
        int num2 = in.nextInt();
        System.out.print("Input operator (+, -, *, /) : ");
        char operator = in.next().charAt(0);
        in.close();
        int result = 0;
        switch (operator){
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2;
                break;
            case '/': result = num1 / num2;
                break;
        }
        System.out.print(result);

    }
    
}
