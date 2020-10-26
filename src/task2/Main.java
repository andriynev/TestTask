package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        SymmetricallyChecker checker = new SymmetricallyChecker();

        if (checker.check(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
