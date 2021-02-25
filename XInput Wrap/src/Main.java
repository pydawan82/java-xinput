
public class Main {

	public static void main(String[] args) throws Throwable {
		Gamepad g = new Gamepad(0);
		if(!g.isConnected()) {
			System.out.println("Gamepad not connected");
			return;
		} else {
			System.out.println("Gamepad connected");
		}
		
		while(true) {
			System.out.print(g.getState());
			System.out.println("----------");
			Thread.sleep(100);
		}
	}
}
