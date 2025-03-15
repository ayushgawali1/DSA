package Day4;

import java.util.Scanner;

public class prog5 {
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n = sc.nextInt();
        for(int i=1 ; i<11 ; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
