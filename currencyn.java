public class currency {

	public static void main(String[] args) {
		
		int note500, note100, note50, note20, note10, note5, note2=10, note1=1;
	   
	
		System.out.println("Enter your amount");
		
		Scanner sc= new Scanner(System.in);
		
		
		int amount=sc.nextInt();
		
		int i=0;	
		if(amount >= 1000)
	   {
		int e=amount/1000;
	       note500 = amount/1000;
	       amount -= note500 * 1000;
	       System.out.print("1000+");
	       i+=e;
	       
	   }
		
		if(amount >= 500)
		   {
			int c=amount/500;
		       note500 = amount/500;
		       amount -= note500 * 500;
		       System.out.print("500+");
		       i+=c;
		       
		   }
		if(amount >= 100)
		   {
			int b=amount/100;
		       note100 = amount/100;
		       amount -= note100 * 100;
		       System.out.print("100+");
		       i+=b;
		   }
		   if(amount >= 50)
		   {
		   	int a=amount/50;
		       note50 = amount/50;
		       amount -= note50 * 50;
		       System.out.print("50+");
		       i+=a;
		   	}
		   	 
		   
		  
		   if(amount >= 10)
		   {
		   	int l=amount/10;
		       note10 = amount/10;
		       amount -= note10 * 10;
		       i+=l;
		   	
		   	 System.out.print("10*"+l+"+");
		   }
		 
		   if(amount >= 1)
		   {
		   	int h=amount/1;
		       note1 = amount;
		       amount -= note1 * 1;
		       i+=h;
		   	
		   	System.out.print("1*"+h);
		   }

		   System.out.println();
		   System.out.println("Currency ="+i);
		   

	}
} 
