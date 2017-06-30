package ch06.exam04;

public class CarExample {

	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car("2017-03-28", "검정");
		// -------------------------------------------
		// Engine의 메소드 호출
		myCar.engine.start();
		myCar.engine.stop();
		// Dashboard의 메소드 호출
		myCar.dashboard.display(60);
		// Tire의 필드값 읽기
		System.out.println(myCar.tires[0].location);
		myCar.tires[2].roll();
		// -------------------------------------------
		// Car의 메소드 호출
		myCar.start();
		myCar.run();
		// -------------------------------------------
		// Tire(FL) 부품 교체
		myCar.tires[1] = new Tire("New FL");
		myCar.run();

	}

}
