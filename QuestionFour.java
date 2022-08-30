package Week3.Day9;

class Parent {
//    public void display() {
//        System.out.println("This is a Parent");
//    }

    public Parent add() {
        System.out.println("This is Parent's add() method");
        return null;
    }
}

class Child extends Parent {
//    public String display() {
//        return "This is a Child";
//    }

    public Child add() {
        System.out.println("This is Child's add() method");
        return null;
    }

}

public class QuestionFour {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.add();

        Child child = new Child();
        child.add();

    }
}
// Till 1.4 for overriding parent class's method in child class , return type of both methods should be same.
// From 1.5 onwards COVARIANT return types are allowed.
/*

This is Parent's add() method
This is Child's add() method


* */
