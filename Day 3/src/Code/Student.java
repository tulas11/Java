package Code;

public class Student {
    //private:accessible inside class
	private int rollno;
	private String name;
	private String qualification;
	private double m1,m2,m3;
	private String grade;
	
	//to access private data members create
	//public methods
	//accepting all details
	
	public void assignDetails(int r,String nm,String quali,double a,double b,double c) {
		rollno=r;
		name=nm;
		qualification=quali;
		m1=a;m2=b;m3=c;
		
		 
	}
	private double total;
	private void calTotal() {
		System.out.println("---Total----");
		  total=m1+m2+m3;
		
	}
	private void calPerc() {
		System.out.println("---cal Percentage-----");
	}
	private void calGrade() {
		if(total>100)
			grade="A+";
		else
			grade="B";
	}
	public void display()
	{
		calTotal();
		calPerc();
		calGrade();
		
		
		System.out.println("----Student Details----");
		System.out.println("RollNo:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Qualifications:"+qualification);
		System.out.println("M1:"+m1+"  M2:"+m2+"  M3:"+m3);
		System.out.println("Grade:"+grade);
	}
	
	
	
	
	
}