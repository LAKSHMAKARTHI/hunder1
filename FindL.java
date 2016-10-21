import java.util.Scanner;

public class Scanning {

    public static void main(String[] args) {
        String str;
int find=0 ;        
        System.out.println("Input number one : ");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        
        StringBuffer sb=new StringBuffer(str);
        
        for(int j=0;j<sb.length();j++){
            
            char ff=sb.charAt(j);
            int l=ff;
            
            
            if(l==123){
                
                sb=sb.deleteCharAt(j);
            }             
            if(l==125){
                sb=sb.deleteCharAt(j);
            }
            
        }
        
        
        System.out.println("Input number two :");
        Scanner sc1=new Scanner(System.in);
        int no=sc1.nextInt();
       no*=no;
      int cc=1;
       
        for(int i=1;i<sb.length();i++){
            
            char aa=sb.charAt(i);
            int a1=aa;

            if(a1==34){
            
                cc+=1;
                }
            
        if(cc==no){
            z:
            for(int ff=i;ff<sb.length();ff++){
                
                char kk=sb.charAt(ff);
                
                int a2=kk;
                
                find+=1;
                if(a2==34){
                    break z;
                }
                System.out.println("output :");
        System.out.println(find);        
            }    
        }   
    }
    }
}
