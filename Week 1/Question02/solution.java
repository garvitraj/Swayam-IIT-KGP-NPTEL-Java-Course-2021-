import java.util.Scanner;  
public class Exercise1_2 {
       public static void main(String[] args) {
Scanner s = new Scanner(System.in); 
        int x = s.nextInt(); 
        int y = s.nextInt();
int z = s.nextInt();
int result = 0;
 if (x>=y) {
        result = x;
    }
    if (z>y) {
        result = z;
    }
    else{
        result=y;
    }
    System.out.println(result);
  
 }
}
