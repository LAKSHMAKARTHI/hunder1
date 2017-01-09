public class count {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of range");
		int s=input.nextInt();
		int count=0;
        int div=0;
        int mod=0;
       for(int i=0;i<=s;i++)
       {
				div=i/10;
				mod=i%10;
				if(div==2)
				{
				 count++;
				}
				 if(mod==2)
				{
					count++;
					
				}
				
			}
		System.out.println("count is : "+count);
	}
}

