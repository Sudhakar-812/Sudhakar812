package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseofString {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("please enter the string:");
	     String str=br.readLine();
	     String rev = "";
	     int i=0;
	     for(i=str.length()-1;i>=0;i--)
	     {
	    	 rev = rev + str.charAt(i);
	     }
	     System.out.println(rev);
	}

}
