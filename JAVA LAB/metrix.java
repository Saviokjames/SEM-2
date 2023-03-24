import java.util.Scanner;
 	
  class sample
  {
  	int row,col;
  	int [][] a= new int[5][5];
  	
  	
  	Scanner obj= new Scanner(System.in);
  	
  	void enter()
  	{
  	System.out.println("enter no of rows");
  	row=obj.nextInt();
  	System.out.println("enter no of colums");
  	col=obj.nextInt();
  	System.out.println("enter metrix");
  	for(int i=0;i<row;i++)
  		for(int j=0;j<col;j++)
  		a[i][j]=obj.nextInt();
        }
        
  }
 class metrix       
  {      
    public static void main(String arg[])
    {
    int [][] b= new int[5][5];
    sample object1=new sample();
    sample object2=new sample();
    object1.enter();
    object2.enter();
    for(int i=0;i<5;i++)
  		for(int j=0;j<3;j++)
  		b[i][j]=object1.a[i][j]+object2.a[i][j];
  
  
    for(int i=0;i<3;i++)
    {
  		for(int j=0;j<3;j++)
  		{
  	            System.out.print(b[i][j]+"");
  	            }
    System.out.print("\n");
    }
     }   
  }      
        
        
  			
  		
  	
  	
