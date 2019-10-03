package threads;

public class RunnableExampleLambdaExpression {

	public static void main(String[] args) {
		System.out.println("Inside: " + Thread.currentThread().getName());

		System.out.println("Creating Thread...");
		Thread thread = new Thread(() -> {
			System.out.println("Creating Runnable...");
			System.out.println("Inside: " + Thread.currentThread().getName());
		});

		System.out.println("Starting Thread...");
		thread.start();
	}
}