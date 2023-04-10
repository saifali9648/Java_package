package Question.Shivam;
public class Palindrom{
	public void getFunction(int n){	
	int rem,temp,sum=0;
	temp=n;
	while (n>0) {
		rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
	}
	if (temp==sum) {
		System.out.println("palindrom number");
	}
	else{
		System.out.println("not palindrom no");
	}
	}
}