package Week1.Day2;

public class Sumofdigits {
public static void main(String[] args) {
	int number=34523;
	int a,b=0;
while(number/10!=0)	{
int q=number%10;	
b=b+q;
//System.out.println(b);
a=number/10;
number=a;
if(number<10) {
	b=b+number;
	System.out.println(b);
	//break;
}
}
}
}