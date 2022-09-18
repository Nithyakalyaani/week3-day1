package Week3day1;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("Student Id " +id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student Id " +id+"Name is"+name);
	}

public void getStudentInfo(String email,int phoneno)
{
	System.out.println("Student email Id " +email+"Phone number is"+phoneno);
}
	public static void main(String[] args) {
		Students st=new Students();
		st.getStudentInfo(12);
		st.getStudentInfo(13,"Nithya");
		st.getStudentInfo("abc@gmail.com", 897654321);
		

	}

}
