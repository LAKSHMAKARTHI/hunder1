package com.cogzidel.lk;


import java.util.*;

public class Sample10 {

	public static void main(String[] args) {
		
		String day="Sunday";


		
		System.out.println("Enter your String");
		Scanner sc=new Scanner(System.in); 	
		
		String str=sc.nextLine();
		
		StringBuffer sb=new StringBuffer(str);
		
		sb.reverse();
		
		System.out.println("The String is "+sb+"\n Removed Vowel");
		
		
		for(int i=0;i<=sb.length();i++){
			
			char ch=sb.charAt(i);
			if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				
				
			}else{
			
			System.out.print(ch);
			}
			
		}
		

	}

}
