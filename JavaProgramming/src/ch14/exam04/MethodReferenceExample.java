package ch14.exam04;

public class MethodReferenceExample {
	public static void main(String[] args) {
		method1(new FunctionalInterface1() {
			@Override
			public int method(int a, int b) {
				return Math.max(a, b);
			}
		});

		method1(new FunctionalInterface1() {
			@Override
			public int method(int a, int b) {
				return Math.min(a, b);
			}
		});

		method1(new FunctionalInterface1() {
			@Override
			public int method(int a, int b) {
				return a + b;
			}
		});

		method1(new FunctionalInterface1() {
			@Override
			public int method(int a, int b) {
				return a * b;
			}
		});

		method1((a, b) -> {
			return Math.max(a, b);
		});

		method1((a, b) -> Math.max(a, b));

		method1(Math::max);

		method1(Math::min);

		method1((a, b) -> {
			return Calculator.staticsum(a, b);
		});

		method1((a, b) -> Calculator.staticsum(a, b));

		method1(Calculator::staticsum);

		method1((a, b) -> {
			return Calculator.staticMulti(a, b);
		});

		method1((a, b) -> Calculator.staticMulti(a, b));

		method1(Calculator::staticMulti);

		Calculator calc = new Calculator();
		method1((a, b) -> {
			return calc.minus(a, b);
		});

		method1((a, b) -> calc.minus(a, b));

		method1(calc::minus);

	}

	public static void method1(FunctionalInterface1 i) {
		int result = i.method(3, 5);
		System.out.println(result);
	}

}
