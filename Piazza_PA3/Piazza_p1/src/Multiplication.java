import java.security.SecureRandom;
import java.util.Scanner;

public class Multiplication {
}
    static int answer;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        boolean validate = true;
        String question = "";
        while(true){
            if(validate){
                question = getQuestion();
            }
            System.out.print(question+":");
            int input = scan.nextInt();
            if(input == answer){
                validate = true;
                System.out.println("Very Good!");
            }
            else{
                validate = false;
                System.out.println("No. Please try again.");
            }
        }
    }
    public static String getQuestion(){
        SecureRandom sr = new SecureRandom();
        int num1 = sr.nextInt(9)+1;
        int num2 = sr.nextInt(9)+1;
        answer = num1 * num2;
        String q = "How much is "+num1+" times "+num2;
        return q;
    }
}
