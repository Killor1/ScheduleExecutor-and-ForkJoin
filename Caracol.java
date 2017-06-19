package scheduleExecutor_and_ForkJoin;

public class Caracol implements Runnable{

	private static Monitor monitor;
	
	public Caracol(){
		monitor = new Monitor();
	}
	
	@Override
	public void run() {
		int dist = (int) Math.floor(Math.random()*100);
		monitor.show(dist);
	}

}
