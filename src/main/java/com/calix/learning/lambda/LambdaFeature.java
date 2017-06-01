
public class LambdaFeature {
	
	public static void main(String[] args) {
		
		MathOperation addition = (int a, int b) -> a + b;
		MathOperation subtraction = (a, b) -> a - b;
		MathOperation multiplication = (int a, int b) -> { return a * b;};
		MathOperation division = (a, b) -> a / b;
		
		LambdaFeature lambda = new LambdaFeature();

		System.out.println("10 + 5 = " + lambda.operate(10, 5, addition));
		System.out.println("10 - 5 = " + lambda.operate(10, 5, subtraction));
		System.out.println("10 * 5 = " + lambda.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + lambda.operate(10, 5, division));
		
		GreetingService greetService1 = message -> System.out.println("Hello " + message);
		GreetingService greetService2 = (message) -> System.out.println("Hello " + message);
		
		greetService1.sayMessage("calix");
		greetService2.sayMessage("xiechao");
	}
	
	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}
