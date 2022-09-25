package com.test;

public class primechecking2 {

	public static void main(String[] args) {
		
			int i,n=57;
			boolean flag=true;
			
			for(i=3;i<=n/2;i++)     // 23 -  2 - half of the number  2-11   37 (2 - 18) 68 - (2- 34)
			{
				if(n%i==0)         //if true then it is a composite number
				{
				  
				  flag=false;
				  break;
			    }
			}
			
			if(flag)
			{
				System.out.println("prime number");
			}
			else
			{
				System.out.println("composite number");
			}
			

			}
	}


