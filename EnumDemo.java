package Week3.Day9;


enum EnumDemo {
    RED("STOP"),
    GREEN("GO"),
    YELLOW("GO VERY SLOW");

    public final String instruction;


    EnumDemo(String instruction) {
        this.instruction = instruction;
    }

    public static void main(String[] args) {
        for (EnumDemo e : values()) {
            System.out.println(e + " MEANS " + e.instruction);
        }
    }
}

/*

RED MEANS STOP
GREEN MEANS GO
YELLOW MEANS GO VERY SLOW


* */