package ArralListLoop;

public abstract class Car implements Vehicle {
	
	// doors(int), wheels(int), color(String)
	int doors = 0;
	int wheels = 0;
	String color = null;
	
	// all methods of Vehicle.java will be implemented with Car class
	public void drive(String newValue) {
		String drive = newValue;
	}
	
	public void stop(String newValue) {
		String stop = newValue;
	}
	
	public void steer(int newValue) {
		int steer = newValue;
	}
	
	public void doors(int increment) {
		int doors = increment;
	}
	
	public void wheels(int increment) {
		int wheels = increment;
	}
	
	public void color(String newValue) {
		String color = newValue;
	}

}
