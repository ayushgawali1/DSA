package Day3;
import java.util.*;

public class prog4 {
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Choise : ");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Hello");
        }
        else if(choice == 2){
            System.out.println("Nameste");
        }
        else if(choice == 3){
            System.out.println("Konichiwa");
        }
        else{
            System.out.println("Invalid choise");
        }
    }
}
