 import java.util.Scanner;




class cpu
{

Scanner sc=new Scanner(System.in);

        int price;
        void get()
        {
        System.out.println("Enter price");
		price=sc.nextInt();
        
        }
	void print()
		{
		System.out.println("price="+price);
		}
	
	class processor
	{
		int no;
		String manufac;
		void get()
		{
		System.out.println("Enter no of core and manufacures");
		no=sc.nextInt();
		manufac=sc.next();
		}
		void print()
		{
		System.out.println("no of cores="+no+"\n"+"manufacture ="+manufac);
		}
	}
	
	
	static class ram
	{
		int memory;
		String manufac;
		
		void get()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter memory and manufacures");
		memory=sc.nextInt();
		manufac=sc.next();
		}
		void print()
		{
		
		System.out.println("memory="+memory+"\n"+"manufacturer"+manufac);
		}
	}
}


class nesting
{
	public static void main(String[] arg)
	{
		cpu obj=new cpu();  //cpu te object creation
		obj.get();
		
		
		cpu.processor ob=obj.new processor();//processor class te object
		ob.get();
		
		cpu.ram object=new cpu.ram(); // static illatha functionte object vech call
		object.get();
		 
		 
		 
		 obj.print();
		 ob.print();
 		 object.print();
 	}
 }
		
		

