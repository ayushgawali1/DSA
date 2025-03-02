package Day3;

import java.util.*;

public class prog1 {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int no = sc.nextInt();
        if (no%2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
