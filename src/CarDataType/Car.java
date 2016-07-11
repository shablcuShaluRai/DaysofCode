package CarDataType;

public class Car {

	int maxSpeed = 100;
	int minSpeed = 0;
	double weight = 145.00;
	boolean isTheCarOn = false;
	char condition = 'A';

	public void printvariable() {
		System.out.println("maxspeed " + maxSpeed);
		System.out.println("minspeed " + minSpeed);
		System.out.println(weight);
		System.out.println(isTheCarOn);
		System.out.println(condition);

	}

	public void upgardeSpeed() {
		minSpeed = maxSpeed;
		maxSpeed = maxSpeed + 1;

	}

	public static void main(String[] args) {

		Car familycar = new Car();
		System.out.println("family car");
		familycar.printvariable();
		familycar.upgardeSpeed();
		familycar.printvariable();
	}

}
