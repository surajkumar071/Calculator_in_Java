



ad Kolkata dj remix songs in the world of 






import java.util.*;

class CalculatorExample {
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.println("choose the operators (+, -, *, /, %): ");
    char operator = obj.next() .charAt(0);

    System.out.println("Enter the value of first number: ");
    int a = obj.nextInt();

    System.out.println("Enter the value of Second Number: ");
    int b = obj.nextInt();

    
    double result;
    switch (operator) {
        case '+':
        result = a + b;
        System.out.println(result);
        break;

        case '-':
        result = a - b;
        System.out.println(result);
        break;

        case '*':
        result = a * b;
        System.out.println(result);
        break;

        case '/':
        result = a / b;
        System.out.println(result);
        break;

        case '%':
        result = a % b;
        System.out.println(result);
        break;

        default:
        System.out.println("Invalid operator");
        break;
        }
        }


}


