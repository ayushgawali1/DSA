package Day3;

import java.util.*;

public class prog5 {
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Choise : ");
        int choices = sc.nextInt();

        switch(choices){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Nameste");
            break;
            case 3 : System.out.println("Konichiwa");
            break;
            default : System.out.println("Invalid choise");
        }
    }
}
