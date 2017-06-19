package scheduleExecutor_and_ForkJoin;

import java.util.concurrent.RecursiveTask;

public class Factorial extends RecursiveTask<Long>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int n;
 	private int f = 1;
    public static final int LIMITE = 10;

    public Factorial(int _n) {
       n = _n;
    }
    
    private Long factorialR() {
    	Factorial f1 = new Factorial(n-1);
    	f1.fork();
    	return f1.join();
    }

    private Long factorialS() {
    	for(int i=1;i<=n;i++){
    		f *= i;
		}
        return (long) f; 
    }

    @Override
    protected Long compute() {
        if(n < LIMITE) {
        	System.out.println(factorialS());
        }
        else {
        	System.out.println(factorialR());
        }
		return null;

    }
}
