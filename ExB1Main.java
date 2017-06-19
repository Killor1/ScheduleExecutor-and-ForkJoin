package scheduleExecutor_and_ForkJoin;

import java.util.concurrent.ForkJoinPool;

public class ExB1Main {
	public static void main(String[] args){
		ForkJoinPool pool = new ForkJoinPool();
		Factorial fa = new Factorial(20);
		
		fa.compute();
	}
	
}
