public class Duplicate {

	public static void main(String[] args) {

		System.out.println("Enter your Input :");
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		int a=0,b=0,c=0,d=0;
		
		for(int i=0;i<str.length();i++){
			
			char ch=str.charAt(i);
			
			int ch1=ch;
			
			if(ch1==97){
				
				a++;
			}else if(ch1==98){
				b++;
			}else if(ch1==99){
				c++;
			}else if(ch1==100){
				d++;
			}else {
				
			}
			}

		System.out.println("a"+a+"b"+b+"c"+c+"d"+d);
	}

}
