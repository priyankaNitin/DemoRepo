package diwali;

import java.util.Scanner;

class Faculty{
	int fid;
	double salary;
	
}
class FullTimeFaculty extends Faculty{
	double basic, allowance;
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fid,basic,allowance ");
		fid=sc.nextInt();
		basic=sc.nextDouble();
		allowance=sc.nextDouble();
		salary=basic+allowance;
	}
	void display() {
		System.out.println("id= "+fid+" Basic= "+basic+" Allowance= "+allowance+" Salary= "+salary);
	}
}
class PartTimeFaculty extends Faculty{
	double hour,rate;
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fid,hour,rate ");
		fid=sc.nextInt();
		hour=sc.nextDouble();
		rate=sc.nextDouble();
		salary=hour*rate;
	}
	void display() {
		System.out.println("id= "+fid+" Hour= "+hour+" Rate= "+rate+" Salary= "+salary);
	}
}
public class FacultyDemo {

	public static void main(String[] args) {
		FullTimeFaculty f=new FullTimeFaculty();
		f.accept();
		f.display();
		
		PartTimeFaculty p=new PartTimeFaculty();
		p.accept();
		p.display();
	}

}
