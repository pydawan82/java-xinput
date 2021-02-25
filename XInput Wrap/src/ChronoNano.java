public class ChronoNano implements AutoCloseable {
	
	public final long start;
	
	public ChronoNano() {
		start = System.nanoTime();
	}
	
	
	@Override
	public void close() throws Exception {
		System.out.println("Chrono ended after "+(System.nanoTime()-start)+"ns");
	}

}
