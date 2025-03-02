package Day3;

import java.util.*;

public class prog2 {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int no = sc.nextInt();
        if (no >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
