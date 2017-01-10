package com.cogzidel.lk;


import java.util.*;

public class Sample10 {

	public static void main(String[] args) {
		
		String day="Sunday";


		
		System.out.println("Enter your day for whether day is leave or b=not..");
		Scanner sc=new Scanner(System.in); 	
		
		String str=sc.nextLine();
		
		
		if(str.equals(day)){
			System.out.println("That day is Leave day");
			
		}
		else
		{
			System.out.println( str +"is Working days");
			
		}
		
		

	}

}
