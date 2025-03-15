package Day4;
import java.util.*;

public class prog4 {
    void main(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the no : ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
