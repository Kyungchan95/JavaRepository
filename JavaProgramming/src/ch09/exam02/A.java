package ch09.exam02;

public class A {
	// Field
	int aField;

	// Constructor
	A() {
		// 로컬 클래스
		class D {
			// Field
			// Constructor
			// Method
			void dMethod() {
				aField = 10;
			}
		}

		class E {
			// Field
			// Constructor
			// Method
			void eMethod() {
				aField = 10;
			}
		}

	}

	// Method
	void aMethod() {
		// 로컬 클래스
		class D {
		}
		class E {
		}

	}

	// 중첩 멤버 클래스
	class B {
		// Field
		// Constructor
		// Method
		void bMethod() {
			aField = 10;
		}

	}

	static class C {
		void cMethod() {
//			aField = 10;
		}

	}

}
