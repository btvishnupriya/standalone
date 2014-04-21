package standalone;
import java.util.Date;
import java.util.Scanner;






import standalone1.Studentdetail;

public class Stand  {
	
		public static void main(String[] args)
		{
			details det=new Information();
		((Information) det).getinfo();
			((Information) det).getinfo(50,60);
			
			
		((Information) det).learn();
		det.setdetails();
		det.getdetails();
		
		//using instance of
		System.out.println("check instanceof :" + (det instanceof Viewdetails));	
		}
	}
// using interface

interface details{
abstract void setdetails();
public void getdetails();

}

//using abstract class which implements interface
abstract class Viewdetails implements details{
	protected int total;
	protected int avg;
	static Studentdetail std=new Studentdetail();
	abstract void learn();//abstract method
	
	Viewdetails()//using constructor in abstract class
	{
		System.out.println("lets see what is happening/n here we use constuctor");
	}
	

    public void  getinfo(int mark1,int mark2 )
    {
    	  total=mark1+mark2;
    			  }
    
	public final void setdetails()//use of final method
	{
		
		std.setStudentname(Studentdetail.studentname);
		std.setStudentparentname(Studentdetail.studentparentname);
		std.setPhonenum(Studentdetail.phonenum);
	}
	
	
	public final void getdetails(){
		System.out.println("STUDENT DETAILS"+"");
		System.out.println("student name:" + std.getStudentname());
		System.out.println("parent name:" +std.getStudentparentname());
		System.out.println("phone:" +std.getPhonenum());
		System.out.println("the  student total is:" +total);
	}
	
}


class Information extends  Viewdetails  {
	
	protected int total;
	protected int avg;
	Scanner sc=new Scanner(System.in);
    public void getinfo()
{
	
	System.out.println("enter the student name");
	Scanner sc=new Scanner(System.in);
	Studentdetail.studentname=sc.next();
 

	System.out.println("enter the student studentparentname");
	Studentdetail.studentparentname=sc.next();

	System.out.println("enter the student phonenum");
	Studentdetail.phonenum=sc.nextInt();
	
	
}
    public void  getinfo(int mark1,int mark2 )//overloading and overrriding 
    {
  
     super.getinfo(mark1, mark2);
      
    }
    static//use of static block
    {
    	System.out.println("static block is excecuted");
    	
    }
	
			
	
	@Override
	void learn() {
	
		System.out.println("this is the method of abstract class");
		System.out.println("pass by value");
		System.out.println("print value" +std.value);
		std.check(std);//pass by value
		System.out.println("print recent value " +std.value);
	}
	
}