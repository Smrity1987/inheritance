package inheritance;

public class MountainBike extends Bicycle {
	
	public int seatHeight;
	
	public MountainBike(int gear,int speed,int startHeight) {
		super (gear,speed);
		seatHeight=startHeight;
	}
	@Override
	public String toString() {
		return "MountainBike [seatHeight=" + seatHeight + " and \n "+super.toString();
	}
	public void setHeight(int newValue) {
		seatHeight=newValue;
	}

}
