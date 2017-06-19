package scheduleExecutor_and_ForkJoin;

public class Monitor implements Runnable{

	private int tot;
	
	public void show(int dist){
		tot += dist;
		System.out.println("Distancia de este hilo: " + dist) ;
		System.out.println("\t  Distancia total: " + tot);
	}
	
	@Override
	public void run() {
		
	}
}
