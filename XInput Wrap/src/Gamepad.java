
public class Gamepad {
	
	public static final int MAX_GAMEPAD;
	public final int gamepad;
	
	static {
		System.loadLibrary("xinput_wrap");
		
		MAX_GAMEPAD = getMaxGamepad();
	}
	
	public Gamepad(int gamepad) {
		this.gamepad = gamepad;
	}
	
	private static native int getMaxGamepad();
	
	private static native int getState(int gamepad, State state);
	
	public boolean isConnected() {
		int error = getState(gamepad, null);
		
		return error==0;
	}
	
	public State getState() throws XInputException {
		State state = new State();
		int error = getState(gamepad, state);
		
		if(error!=0)
			throw new XInputException("Device not connected");
		
		return state;
	}
	
}
