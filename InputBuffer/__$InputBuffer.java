
import java.util.InputMismatchException;
import java.util.Scanner;

public class __$InputBuffer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String errorInfo = "输入有误，请重新输入: ";
        int input = 0;

        while (true) {
            try {
                input = in.nextInt();
                if (input == 1 || input == 2 || input == 3 || input == 4) {
                    break;
                }
                System.out.print(errorInfo);
            } catch (InputMismatchException exception) {
                System.out.print(errorInfo);
            }
        }


    }
}
