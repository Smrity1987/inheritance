package inheritance;

public class Bicycle {
	public int gear;
	public int speed;
	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}
	
	public Bicycle() {
		
	}
	public void applyBrake(int decrement) {
		speed-=decrement;
	}
	public void speedup(int increment) {
		speed+=increment;
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}

	public void MountainBikeInter() {
		// TODO Auto-generated method stub
		
	}
	public void parent_class() {
		System.out.println("parent class");
	}
	

}
