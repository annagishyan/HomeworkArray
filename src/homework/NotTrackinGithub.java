package homework;

public class NotTrackinGithub {
    static void swap(int x, int y) {
        int num;
        System.out.println("before swapping x: " + x + ", y: " + y);
        num = x; //num ==12
        x = y; // x == 5;
        y = num; //y == 12
        System.out.println("After swapping x: " + x + ", y: " + y);

    }

    static void charValue(char d) {
        System.out.println(d);


    }

    static long factorial(int n) {
        if (n == 1) return 1;
        else
            return n * factorial(n - 1);

    }


    static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);

    }

    public static void main(String[] args) {
//        int a = 12;
//        int b = 5;
//        int c = 10;
//        swap(a, b);
//        swap(-15, 205);
//        System.out.println(" x: " + a +", y: " + b);
//        System.out.println();
//        charValue('a');
//        System.out.println(fib(9));
        System.out.println(factorial(5));


    }
}

