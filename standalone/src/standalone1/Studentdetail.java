package standalone1;
//here  encapsulation is implemented 


public class Studentdetail {
	public static String studentname;
	public static String studentparentname;
	public static int phonenum;
	public static int value=20;
	
	public static String getStudentname() {
		return studentname;
	}
	
	public  void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	
	public String getStudentparentname() {
		return studentparentname;
	}
	
	public void setStudentparentname(String studentparentname) {
		this.studentparentname = studentparentname;
	}
	
	public int getPhonenum() {
		return phonenum;
	}
	
	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}
	public void check(Studentdetail std)
	{
		 std.value=std.value-10;
	}
}
