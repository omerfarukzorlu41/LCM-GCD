import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1,number2;
        System.out.print("Please enter the first number: ");
        number1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        number2 = scanner.nextInt();

        int i = (number1<number2)? number1 : number2;

        while(true){
            if(number1 % i ==0 && number2 % i ==0){
                System.out.println("GCD: "+i);
                break;
            }
            i--;
        }
        int k = 1;
        while(k <= number1*number2){
            if(k % number1 == 0 && k % number2 == 0){
                System.out.println("LCM: "+k);
                break;
            }
            k++;
        }

    }
}
