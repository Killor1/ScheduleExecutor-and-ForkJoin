package scheduleExecutor_and_ForkJoin;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExA2Main {

	public static void main(String[] args) throws InterruptedException{
		
		ScheduledExecutorService ses = Executors.newScheduledThreadPool(2);
		
		Executors.newScheduledThreadPool(2); 
		
		Runnable r = new Caracol();

		// el hilo (r), empieza en el segundo (1), y se ejecuta cada (2) segundos, 
		ses.scheduleWithFixedDelay(r, 1, 2, TimeUnit.SECONDS);
		//que acabe a los 15 segundos:
		ses.awaitTermination(15, TimeUnit.SECONDS);
		
		ses.shutdownNow(); 
		System.out.println("Carrera completada");

	}

}
