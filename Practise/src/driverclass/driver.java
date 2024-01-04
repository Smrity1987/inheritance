package driverclass;
import inheritance.Derived_bike;
import inheritance.MountainBike;
public class driver {

	public static void main(String[] args) {
//		MountainBike bike=new MountainBike(3,200,10);
//		System.out.println(bike.toString());
		
		Derived_bike bike=new Derived_bike();
		bike.parent_class();
		bike.childDerivedBike();
		bike.MountainBikeInter();
		

	}

}
