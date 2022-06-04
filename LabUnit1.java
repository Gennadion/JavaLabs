public class LabUnit1
{
    public static void main(String[] args) {
        //exercise 1
        System.out.println("Lab Unit 1");
        exercise2();
        exercise3();
    }

    public static void exercise2(){
        int a1 = 0;
        System.out.println(a1);
        float a2 = 12;
        System.out.println(a2);
        double a3 = 3.6;
        System.out.println(a3);
        char a4 = '@';
        System.out.println(a4);
        String a5 = "Hello";
        System.out.println(a5);
        boolean a6 = true;
        System.out.println(a6);
    }

    public static void exercise3(){
        String first = "Test";
        String second = "NotTest";

        if(first == second)
            System.out.println("The strings are equal");
        else
            System.out.println("Strings are not the same!");

    }
}