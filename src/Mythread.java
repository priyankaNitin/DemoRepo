package diwali;

import java.util.Scanner;

class MultiplicationTable extends Thread{
	int num;
	void setNum(int n) {
		num=n;
	}
    public void run(){
    	System.out.println("Multiplication table of "+num+" =");
    	for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}

class IncreamentBy1 extends Thread{
	int num;
	void setNum(int n) {
		num=n;
	}
    public void run(){
    	
        for(int i=0;i<11;i++){
            System.out.print(num+i+" ");
        }
    }
}
public class Mythread {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		IncreamentBy1 t1=new IncreamentBy1();
		t1.setNum(a);
		t1.start();
		MultiplicationTable t2=new MultiplicationTable();
		t2.setNum(b);
		t2.start();
	}

}
