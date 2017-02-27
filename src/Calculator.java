
public class Calculator {

	public Calculator() 
	{
		
	}
	
	public int Add(int x,int y)
	{
		return x + y ;
	}
	public int Subtract(int x , int y)
	{
		return x - y ;
	}
	public double Divide(int x , int y)
	{
			return x/y ;
	}
	public int Multiplication(int x , int y)
	{
		return x*y ;
	}
	public boolean IsPrime(int n)
	{
	    if (n < 2) return false;

		for(int i = 2; i*i <= n;i++)
		{
			if(n%i==0)
				return false ;
		}
		return true ;
	}
/*    for (int i=2; (i*i) <= number; i+=2) {
        if (number % i == 0 ) return false;
    }*/

}
