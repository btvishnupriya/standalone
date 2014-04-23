package standalone1;
//here  encapsulation is implemented 


public class StudentDetail {
	public static String studentName;
	public static String studentParentName;
	public static int phoneNum;
	public static int value=20;
	
	public static String getStudentName() {
		return studentName;
	}
	
	public  void setstudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getstudentParentName() {
		return studentParentName;
	}
	
	public void setstudentParentName(String studentParentName) {
		this.studentParentName = studentParentName;
	}
	
	public int getPhoneNum() {
		return phoneNum;
	}
	
	public void setphoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void check(StudentDetail std)
	{
		 std.value=std.value-10;
	}

	
}
