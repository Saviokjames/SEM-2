import java.util.*;

class Student
      {
             String name;
             float percent;
        Student(String name,float percent)
        {
        this.name=name;
        this.percent=percent;
        }     
        
        void display()
        {
        System.out.println("name="+name+"/tpercent="+percent);
        
        }
      }  
      
interface Sports
      {
       
        
       public void show();   
        
      }
           
class Result extends Student implements Sports
      {
      float score;
      Result(String na,float per,float sc)
      {
      super(na,per);
      this.score=sc;
      }
      
       public void show()
       {
       super.display();
       System.out.println("score="+score);
       }
      }
      
                 
           
public class Sport
{
	 public static void main(String ar[])
	 {
	 Scanner obj =new Scanner (System.in);
	 System.out.println("enter name");
	 String n=obj.nextLine();
	 System.out.println("enter percent");
	 float p=obj.nextFloat();
	 System.out.println("enter score");
	 float s=obj.nextFloat();
	 Result r = new Result(n,p,s);
	 r.show();
	}	 
}	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
                  
