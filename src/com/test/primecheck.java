package com.test;

public class primecheck {

	public static void main(String[] args) {
		 int i,n=4,count=0;
			
			for(i=1;i<=n;i++)      
			{
				if(n%i==0)         
				{
				 count=count+1;      
			    }
			}
			
			if(count==2)
			{
				System.out.println("prime number");
			}
			else
			{
				System.out.println("composite number");
			}
			

			}



	}

