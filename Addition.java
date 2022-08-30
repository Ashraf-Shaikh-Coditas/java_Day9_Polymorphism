package Week3.Day9;

public class Addition {
    public void add(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("Addition of above numbers is :: " + sum);
    }

}

class Varargs_Addition {
    public void add(int... number) {
        int sum = 0;

        for (int i : number) {
            sum += i;
        }

        System.out.println("Addition of above numbers using varargs is :: " + sum);
    }
}

class MainApplication {
    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.add(10, 20);

        System.out.println();

        Varargs_Addition varargs_addition = new Varargs_Addition();
        varargs_addition.add(1, 2, 3, 4, 5, 6, 7);
    }
}

/*

Addition of above numbers is :: 30

Addition of above numbers using varargs is :: 28



* */