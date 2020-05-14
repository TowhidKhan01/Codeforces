import static java.lang.System.*;
import java.util.*;
public class Watermelon{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n>2 && n%2==0){
    out.println("YES");
    }
    else{
    out.println("NO");
    }
  }
}