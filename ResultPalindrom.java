import java.util.Scanner;
import Question.Shivam.*;
public class ResultPalindrom{
	public static void main(String[] args){
	Scanner num=new Scanner(System.in);
	System.out.println("enter a number:-");
	int n=num.nextInt();
	Question.Shivam.Palindrom get=new Question.Shivam.Palindrom();
	get.getFunction(n);
	}
}