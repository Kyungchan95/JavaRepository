package ch06.exam03;

public class Calculator {
	// Field
	// Constructor
	// Method
	void powerOn() {
		System.out.println("������ �մϴ�.");
		
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
		
	}
	
	String info() {
		return "�Ｚ����-2017-03-28";
		
	}
	
	int[] changeArray(int x, int y, int z) {
		int[] array = {x, y, z};
		return array;
		
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
		
	}
	
	double plus(double x, double y) {
		double result = x + y;
		return result;
		
	}
	
	double divide(double x, double y) {
		double result = x / y;
		return result;
		
	}
	
	Car makeCar(String color, boolean airback) {
		Car car = new Car(color, airback);
		return car;
		
	}

}
