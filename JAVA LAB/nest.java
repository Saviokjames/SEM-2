class outer
{
  int x,y;
     void test()
      {
	System.out.println("test fun is working");
      }
      
      class inner
      {
         void print()
         {
	  System.out.println("print from inner fun is working");
         }
      }
      static class staticinner
      {
      void display()
         {
	  System.out.println("disp from static inner fun is working");
         }
         
       static  void output()
         {
	  System.out.println("output from static inner fun is working");
         }
      
      }  
      
}



class nest
{
 	public static void main(String[] arg)
 		{
 		 outer obj=new outer();
 		 obj.test();
 		 
 		 
 		 outer.inner ob=obj.new inner();   //class inner te object
 		 ob.print();
 		 
 		 
 		 outer.staticinner object=new outer.staticinner(); // static illatha functionte object vech call
 		 object.display();
 		 
 		 
 		 
 		 outer.staticinner.output();//static fun call
 		 }
} 		 
