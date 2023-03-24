class Sum
{
int a,b;
 int total;
     Sum()
     {
  	  a=10;
  	  b=20;
  	  System.out.println("constructor is working");
     }
  	 	
	 void add()
	 {
	
	 total=a+b;
	 System.out.println("sum="+total);
	 } 
	 
	 void add(int a,int b)
	 {
	
	 total=a+b;
	 System.out.println("sum="+total);
	 } 
	 
	 int addition(int a,int b)
	 {
	 return a+b;
	 } 
}

 class call
  {
    public static void main(String a[])
    {
      Sum obj1=new Sum();
      obj1.add();
      		Sum obj2=new Sum();
      		obj2.add(50,30);
      Sum obj3=new Sum();
      int f=obj3.addition(10,4);
      System.out.println("sum="+f);
      
    			  if(obj1.total > obj2.total)//&& obj1>obj3)
     			  {
     			   System.out.println("1st obj is large");
   			   }
     			   else if(obj2.total >obj1.total )//&&obj2>obj3)
      			  {
    			    System.out.println("2nd object is large");
      			  }
      			  else
      			  {
      			  System.out.println("3rd obj is large");
      			  }
       
    } 
  } 
