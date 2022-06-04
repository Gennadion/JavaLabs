public class LabUnit2_1
{
    public static void main(String[] args){
        System.out.println("Lab Unit 2, Part 1");
        exercise1();
        exercise2();
        exercise3();
    }

    //Write a program to give the examples of operators.
    public static void exercise1 (){
        System.out.println("Exercise 2.1");
        int var = 5;

        System.out.println(var++); //Increment
        System.out.println(var--); //Decrement
        System.out.println(~var); //bitwise complement

        int var_2 = 10;

        System.out.println(var + var_2); //Arithmetic
        System.out.println(var < var_2); //Relational
        System.out.println(var & var_2); //Bitwise
        System.out.println(var != var_2 || var < var_2); //Conditional
    }

    public static void exercise2 (){
        System.out.println("Exercise 2.2");
        int a = 10;

        //do and while loop statement
        do{
            a++;
        } while(a < 10);

        //For loop and if statement
        for(int i = 0; i < 10; i++){
            if(i == a)
                System.out.println("BooM!");
            a--;
        }
        //Switch statement
        switch(a){
            case 0: System.out.println("Success!");
                    break;
            case 1:System.out.println("Not Right");
            case 2: System.out.println("Wrong");
                    break;
            default: System.out.println("Lucky");
                    break;
        }
    }

    public static void exercise3 (){
        System.out.println("Exercise 2.3");
        int[] array = {1, 9, 6, 4, 0, 5, 3, 5, 56, 29, 1, 2, 3, 0}; //1D array
        System.out.println(array.length); //Array length

        String[][] two_d = {{"abc", "def", "ghi"},
                {"John", "Mary", "Alvin", "Olive"},
                {"I", "love", "pizza"}}; //2D array

        char[][][] next_gen = {{{'a', 'b'}, {'c', 'd'}, {'e', 'f'},
                {'g', 'h'}, {'i', 'j'}, {'k', 'l'}}, {{'m', 'n'}, {'o', 'p'}, {'q', 'r'},
                {'s', 't'}, {'u', 'v'}, {'w', 'x'}}}; //Multi-dimensional array

        System.out.println(next_gen[0][1][1]);
    }
}
