package ch06.exam04;

public class CarExample {

	public static void main(String[] args) {
		// Car ��ü ����
		Car myCar = new Car("2017-03-28", "����");
		// -------------------------------------------
		// Engine�� �޼ҵ� ȣ��
		myCar.engine.start();
		myCar.engine.stop();
		// Dashboard�� �޼ҵ� ȣ��
		myCar.dashboard.display(60);
		// Tire�� �ʵ尪 �б�
		System.out.println(myCar.tires[0].location);
		myCar.tires[2].roll();
		// -------------------------------------------
		// Car�� �޼ҵ� ȣ��
		myCar.start();
		myCar.run();
		// -------------------------------------------
		// Tire(FL) ��ǰ ��ü
		myCar.tires[1] = new Tire("New FL");
		myCar.run();

	}

}
