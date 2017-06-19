package scheduleExecutor_and_ForkJoin;

import java.util.concurrent.ForkJoinPool;

public class ExB2Main {
	public static void main (String[] args){
		ForkJoinPool pool = new ForkJoinPool();
		Fibonacci fib = new Fibonacci(10);
		System.out.println(fib.compute());
	}
}
