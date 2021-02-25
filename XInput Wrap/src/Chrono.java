
public class Chrono implements AutoCloseable {
	
	public final long start;
	
	public Chrono() {
		start = System.currentTimeMillis();
	}
	
	
	@Override
	public void close() throws Exception {
		System.out.println("Chrono ended after "+(System.currentTimeMillis()-start)+"ms");
	}

}
