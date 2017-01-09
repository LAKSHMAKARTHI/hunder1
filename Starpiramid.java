package com.cogzidel.lk;

import java.util.*;
public class Sample {

	
	  public static void main(String args[]){
	    Scanner in=new Scanner(System.in);
	
	    int a=in.nextInt();
	    String ans="";
	    for(int i=0;i<a;i++){
	        for(int k=0;k<2;k++){
	            for(int j=i;j<a;j++){
	                System.out.print("*");
	            }
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
	}
	    
	    
	   
	  }
	

	   
