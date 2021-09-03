import java.util.Scanner;
class QuestionScope {
int sum(int a, int b){ //non-static method
        return a + b;
    }
static int multiply(int a, int b){ //static method
        return a * b;
    }
}
public class Exercise3_4{
public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();

//Called the method sum() to find the sum of two numbers.
//Called the method multiply() to find the product of two numbers.
QuestionScope st = new QuestionScope(); // Create an object to
//static method
int result1=st.sum(n1,n2); // Call the method
int result2=QuestionScope.multiply(n1,n2);
System.out.println(result1);
System.out.println(result2);
	}
}
