/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	// allosquare
/*	int n=5;
	for(int i=1;i<=n;i++)
	{
	    for(int j=1;j<=n;j++)
	    {
	        if(j==1||j==n||i==1||i==n)
	        {
	            System.out.print("*");
	        }
	        else
	        {
	            System.out.print(" ");
	        }
	    }
	    System.out.println();
	}*/
	// plus pattern
/*	int n=5;
	for(int i=0;i<=n/2;i++)
	{
	    for(int j=0;j<=n/2;j++)
	    {
	        if(i==n/2||j==n/2)
	        {
	            System.out.print("*");
	        }
	        else
	        {
	            System.out.print(" ");
	        }
	    }
	  System.out.println();  
	}*/
	//X pattern
/*	int n=5;
	for(int i=1;i<=n;i++)
	{
	    for(int j=1;j<=n;j++)
	    {
	       if(i==j||j==n-i+1) 
	       {
	           System.out.print("*");
	       }
	       else
	       {
	           System.out.print(" ");
	       }
	    }
	    System.out.println();
	}*/
	// factor program and count program
/*	int n=8;
	int count=0;
	for(int i=1;i<=n;i++)
	{
	    if(n%i==0)
	    {
	        System.out.print(i+" ");
	        count++;
	    }
	  
	}
	System.out.println(count);
	*/
	// Prime Number by count
/*	int n=17;
	int count=0;
	for(int i=1;i<=n;i++)
	{
	    if(n%i==0)
	    {
	        count++;
	    }
	}
	    if(count<=2)
	    {
	        System.out.println("Prime number");
	    }
	    else
	    {
	        System.out.println("Not a prime number");
	    }
	    */
	 // perfect number by using sum method
/*	int n=284;
	 int sum=0;
	 for(int i=1;i<n;i++)
	 {
	     if(n%i==0)
	     {
	         sum+=i;
	        
	     }
	 }
	  System.out.println(sum);
	 if(sum==n)
	 {
	     System.out.println("perfect number");
	 }
	 else if(sum<n)
	 {
	     System.out.println("deficient number ");
	 }
	else
	{
	    System.out.println("amend number");
	}*/
	//  ampicable pairs 
	 int n=284;
	 int n2=220;
	 int sum=0;
	 int sum2=0;
	 for(int i=1;i<n;i++)
	 {
	     if(n%i==0)
	     {
	         sum+=i;
	    }
	 }
	 for(int j=1;j<n2;j++)
	 {
	   if(n2%j==0)
	   {
	       sum2+=j;
	   }
	 }
	 
	 if(n==sum2&&n2==sum)
	{
	    System.out.println("Ampicable pair");
	}
	else
	{
	    System.out.println("Not an ampicable pair");
	}
	}
}
