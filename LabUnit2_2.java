import java.util.*;
public class LabUnit2_2
{
    public static void main(String args[]){
        System.out.println("Lab Unit 2, Part 2");
        exercise4(args);
        exercise5();
        exercise6();
    }

    public static void exercise4(String args[]){
        int sum = 0;
        int non_int = 0;
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                non_int++;
            }
        }
        System.out.println("The sum of arguments is: " + sum);
        System.out.println("Invalid integers entered: " + non_int);
    }

    public static void exercise5(){
        //2.5.1
        int num1 = 1;
        System.out.println(num1);
        for(int i = 2; i < 10; i+=2){
            for(int j = 0; j < i; j++){
                num1 *= 10;
            }
            System.out.println(num1+1);
            num1 = 1;
        }
    }
    public static void exercise6(){
        //2.6.1 prime numbers (it became really long - surely there is a more optimal way)
        int[] prime_array = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: \n");
        boolean prim = false;
        for(int i = 0; i < 10; i++){
            String number = input.nextLine();
            int n = Integer.parseInt(number);
            if(n == 0 || n == 1);
            else if(n == 2 || n == 3){
                prim = true;
            }
            else{
                for(int j=2; j<=(n/2);j++){
                    prim = n % j != 0;
                }
            }
            if(prim)
                prime_array[i] = n;
            prim = false;
        }
        System.out.println("The prime numbers are: ");
        for (int j : prime_array) System.out.println(j);

        //2.6.2 Sum of digit
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter a number: \n");
        int nomer = Integer.parseInt(input2.nextLine());
        int sum = 0;
        while(nomer / 10 != 0){
            sum += nomer % 10;
            nomer = nomer / 10;
        }
        sum += nomer;
        System.out.println(sum);
    }
}
