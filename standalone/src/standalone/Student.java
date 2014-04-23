package standalone;

import java.util.Scanner;
import standalone1.StudentDetail;


public class Student  {
	
		public static void main(String[] args)
		{
			Details det=new Information();//upcasting
		((Information) det).getInformation();
			((Information) det).getInformation(50,60);
			
			
		((Information) det).learn();
		det.setDetails();
		det.getDetails();
		
		//using instance of
		System.out.println("check instanceof :" + (det instanceof ViewDetails));	
		}
	}
// using interface

interface Details{
abstract void setDetails();
public void getDetails();

}

//using abstract class which implements interface
abstract class ViewDetails implements Details{
	protected int total;
	protected int avg;
	static StudentDetail std=new StudentDetail();
	abstract void learn();//abstract method
	
	ViewDetails()//using constructor in abstract class
	{
		System.out.println("lets see what is happening/n here we use constuctor");
	}
	

    public void  getInformation(int mark1,int mark2 )
    {
    	  total=mark1+mark2;
    			  }
    
	public final void setDetails()//use of final method
	{
		
		std. setstudentName(StudentDetail.studentName);
		std.setstudentParentName(StudentDetail.studentParentName);
		std.setphoneNum(StudentDetail.phoneNum);
	}
	
	
	public final void getDetails(){
		System.out.println("STUDENT DETAILS"+"");
		System.out.println("student name:" + std.getStudentName());
		System.out.println("parent name:" +std.getstudentParentName());
		System.out.println("phone:" +std.getPhoneNum());
		System.out.println("the  student total is:" +total);
	}

	
}


class Information extends  ViewDetails  {
	
	protected int total;
	protected int avg;
	Scanner sc=new Scanner(System.in);
    public void getInformation()
{
	
	System.out.println("enter the student name");
	Scanner sc=new Scanner(System.in);
	StudentDetail.studentName=sc.next();
 

	System.out.println("enter the student studentparentname");
	StudentDetail.studentParentName=sc.next();

	System.out.println("enter the student phonenum");
	StudentDetail.phoneNum=sc.nextInt();
	
	
}
    public void  getInformation(int mark1,int mark2 )//overloading and overrriding 
    {
  
     super.getInformation(mark1, mark2);
      
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