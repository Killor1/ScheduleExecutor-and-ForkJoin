package scheduleExecutor_and_ForkJoin;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExA1Main {
	public static void main(String[] args){
		ExecutorService exec = Executors.newFixedThreadPool(3);
		Caracol c1 = new Caracol();
		Caracol c2 = new Caracol();
		Caracol c3 = new Caracol();
		
		c1.run();
		c2.run();
		c3.run();
		
		exec.execute(c1);
		exec.execute(c2);
		exec.execute(c3);
		
	}
}
