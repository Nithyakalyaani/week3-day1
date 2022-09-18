package Week3day1;

public class Student extends Department {

	public void studentName()
	{
		System.out.println("Nithya");
	}
	public void studentDept() {
		System.out.println("CSE");
	}
	public void studentId()
	{
		System.out.println("ID:345");
	}
	
	
	public static void main(String[] args) {
		
   Student st=new Student();
   st.studentName();
   st.studentId();
   st.studentDept();
   st.collegeCode();
   st.collegeName();
   st.collgeRank();
   st.deptName();
   
	}

}
