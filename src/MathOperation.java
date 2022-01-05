package diwali;

import java.util.Scanner;

public class MathOperation {

	int x,y,r;
	void init() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x ");
		x=sc.nextInt();
		System.out.println("Enter value of y");
		y=sc.nextInt();
	}
	void add() {
		r=x+y;
	}
	void multiply() {
		r=x*y;
	}
	void power() {
		r=(int) Math.pow(x, y);
	}
	void display() {
		System.out.println("Result= "+r);
	}
	public static void main(String[] args) {
		MathOperation op=new MathOperation();
		op.init();
		op.add();
		op.display();
		op.multiply();
		op.display();
		op.power();
		op.display();
	}

}
