package Day3;

import java.util.*;

public class prog3 {
    void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("A is grater");
        } else {
            System.out.println("B is grater");
        }
    }
}
