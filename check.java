import java.io.*;
class digits{
int num,temp,remainder,rev0;


Scanner s=new Scanner(System.in);
num=s.nextInt();

temp=num;

while(num>0){
remainder=num%10;
reverse=rev*10+remainder
num/=10;
}
if(num==temp){

System.out.println("this is palindrome");
}else{

System.out.println("this not palindrome");
}
}
