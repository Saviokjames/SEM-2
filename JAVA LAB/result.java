import java.util.Scanner;

	class demo
	{
	int a;
	int b;	
	         void enter()
		{
		System.out.println("enter real part of number");
		Scanner ob=new Scanner(System.in);
		a=ob.nextInt();
		
		
		System.out.println("enter complex part of number");
		Scanner ob1=new Scanner(System.in);
		b=ob1.nextInt();
		
		
		System.out.println("NUMBER="+a+"+"+b+"i");

	
		}
		
		
			void complex()
			{
			demo object1=new demo();
			demo object2=new demo();
			System.out.println("1st number");
		
		
		
			object1.enter();
			System.out.println("2st number");
			object2.enter();
			
			int real,img;
	        	real=object1.a+object2.a;
	       	img=object1.b+object2.b;
	        	System.out.println("SUM OF THE COMPLEX="+real+"+"+img+"i");
			
			}
			 	
			 	

	}
		
		
	class result
	{
	 	public static void main(String[] arg)	
	 	{
	 		demo obj=new demo();
	 		obj.complex();
	 		
	        }
	}
