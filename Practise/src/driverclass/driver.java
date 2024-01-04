package driverclass;
import Hierarcical_inheritance.child_class2;
import Hierarcical_inheritance.childclass_1;
import inheritance.Derived_bike;
import inheritance.MountainBike;
import multiple_inheritance.childClass2;
public class driver {

	public static void main(String[] args) {
		//single inheritance
//		MountainBike bike=new MountainBike(3,200,10);
//		System.out.println(bike.toString());
		
		
		//multi level inheritance
//		Derived_bike bike=new Derived_bike();
//		bike.parent_class();
//		bike.childDerivedBike();
//		bike.MountainBikeInter();
//		
		
		//heirarchical inheritance
//		childclass_1 chi1=new childclass_1();
//		chi1.Baseclassprint();
//		chi1.printChildClass1();
//		
//		child_class2 chi2=new child_class2();
//		chi2.Baseclassprint();
//		chi2.printChildClass2();
		
		//multiple inheritance
		childClass2 chi2=new childClass2();
		chi2.printClass1();
		chi2.getT();
		
		
		

	}

}
