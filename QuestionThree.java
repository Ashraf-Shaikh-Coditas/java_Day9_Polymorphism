package Week3.Day9;

public class QuestionThree {
    public void add(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("Sum is :: "+sum);
    }

    public int add(int number1 , int number2) {
        int sum = number1 + number2;
        return sum;
    }
}

// Changing return type doesnt supports Overloading .

/*

COMPILE TIME ERROR :
add(int, int)' is already defined in 'Week3.Day9.QuestionThree

* */