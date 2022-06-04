import java.util.*;
import java.lang.*;

public class LabUnit2_3 {
    public static void main(String[] args){
        System.out.println("Lab Unit 2, Part 3");
        exercise7();
        exercise8();

    }

    public static void exercise7() {
        System.out.println("Enter 10 numbers: \n");
        Scanner input = new Scanner(System.in);
        int n;
        int[] array = new int[10];

        //Collecting data into array
        for (int i = 0; i < 10; i++) {
            n = Integer.parseInt(input.nextLine());
            array[i] = n;
        }

        //Selection Sort
        for (int i = 0; i < (array.length - 1); i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }

        for (int j : array) System.out.println(j);
    }

    public static void exercise8(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a quadratic equation, in the form of Ax^2 + Bx + C \n");
        System.out.println("A:");
        int a_num = Integer.parseInt(input.nextLine());
        System.out.println("B:");
        int b_num = Integer.parseInt(input.nextLine());
        System.out.println("C:");
        int c_num = Integer.parseInt(input.nextLine());

        double discriminant = (b_num*b_num)-(4*a_num*c_num);
        System.out.println(discriminant);
        if(discriminant < 0)
            System.out.println("Unable to solve");
        else {
            double root1 = ((-b_num + Math.sqrt(discriminant))) / (2 * a_num);
            double root2 = ((-b_num - Math.sqrt(discriminant))) / (2 * a_num);
            System.out.println("Answer 1: " + root1);
            System.out.println("Answer 2: " + root2);
        }
    }
}
