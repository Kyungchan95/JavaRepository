package ch12.exam09;

public class PrintThread2 extends Thread {
	// Field
	// Constructor
	// Method
	public void run() {
		while (true) {
			System.out.println("실행 중...");
			System.out.println("실행 중...");
			// Thread.sleep(1);
			if (isInterrupted()) {
				break;
			}
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
