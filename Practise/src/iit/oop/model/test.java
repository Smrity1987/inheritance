package iit.oop.model;

public class test {

	public static void main(String[] args) {
		Triangle t1=new Triangle();
		double disp=t1.display(22,50.5);
		System.out.println("triagle_area = "+disp);
		
		circle c1=new circle();
		double res=c1.display2(10);
		System.out.println("circle_area = "+res);
		

	}

}
