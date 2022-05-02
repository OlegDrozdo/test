import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
//Разобрать принцип работы
    public static void main(String[] args) {
        int operand1 = nextInt();
        int operand2 = nextInt();
        char operation = getOperation();
        int result = calc(operand1,operand2,operation);
        System.out.println("Rezul'tat: "+result);
    }

    public static int nextInt(){
        System.out.println("Vvedite chislo :");
        int operand;
        if(scanner.hasNextInt()){
            operand = scanner.nextInt();
        } else {
            System.out.println("ERROR!");
            scanner.next();//рекурсия
            operand = nextInt();
        }
        return operand;
    }

    public static char getOperation(){
        System.out.println("Vvedite operatsiyu:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("ERROR!");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int operand1, int operand2, char operation){
        int result;
        switch (operation) {
            case '+' -> result = operand1 + operand2;
            case '-' -> result = operand1 - operand2;
            case '*' -> result = operand1 * operand2;
            case '/' -> result = operand1 / operand2;
            default -> {
                System.out.println("Povtorite vvod");
                result = calc(operand1, operand2, getOperation());//рекурсия
            }
        }
        return result;
    }
}
