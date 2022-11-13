package ArralListLoop;

public abstract class Truck implements Vehicle {
	
	// gears: int, horn: int
	int gears = 0;
	int honk = 0;
	
	// all methods of Vehicle.java will be implemented with Truck class
	public void drive(String newValue) {
		String drive = newValue;
	}
	
	public void stop(String newValue) {
		String stop = newValue;
	}
	
	public void steer(int newValue) {
		int steer = newValue;
	}
	
	public void geers(int newValue) {
		int geers = newValue;
	}
	
	public void honk(int increment) {
		int honk = increment;
	}

}
