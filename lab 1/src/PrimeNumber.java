
import java.util.*;

public class PrimeNumber {
public static void main(String[] args)

{
	Scanner sc = new Scanner (System.in);
	int n,c,i,j;
	System.out.println("Enterthe number till you want prime number");
	n=sc.nextInt();
	System.out.println("Prime numbers are:-");
	for(i=2;i<=n;i++)
		{c=0;
		for(j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.print(i+" ");
		}
		}
	}
		

	}


