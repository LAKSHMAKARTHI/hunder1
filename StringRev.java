import java.io.*;
import java.util.*;

class Reverse
{
public static void main(String args[]){ 
 

Scanner sc=new Scanner(System.in);

String s1=sc.nextLine();


String[] words=s1.split("\\s");


for(String w:words){ 

StringBuilder sb=new StringBuilder(w); 
sb.reverse(); 


System.out.print(sb+" "); 

} 
}}  
