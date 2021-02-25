public class State {
	
	private static final short DPAD_UP = 0x0001;
	private static final short DPAD_DOWN = 0x0002;
	private static final short DPAD_LEFT = 0x0004;
	private static final short DPAD_RIGHT = 0x0008;
	private static final short START = 0x0010;
	private static final short BACK = 0x0020;
	private static final short LEFT_THUMB = 0x0040;
	private static final short RIGHT_THUMB = 0x0080;
	private static final short LEFT_SHOULDER = 0x0100;
	private static final short RIGHT_SHOULDER = 0x0200;
	private static final short A = 0x1000;
	private static final short B = 0x2000;
	private static final short X = 0x4000;
	private static final short Y = Short.MIN_VALUE;
	
	private short wButtons;
	private byte bLeftTrigger;
	private byte bRightTrigger;
	private short sThumbLX;
	private short sThumbLY;
	private short sThumbRX;
	private short sThumbRY;
	
	public boolean dpadUp() {
		return (wButtons&DPAD_UP) != 0;
	}
	
	public boolean dpadDown() {
		return (wButtons&DPAD_DOWN) != 0;
	}
	
	public boolean dpadLeft() {
		return (wButtons&DPAD_LEFT) != 0;
	}
	
	public boolean dpadRight() {
		return (wButtons&DPAD_RIGHT) != 0;
	}
	
	public boolean start() {
		return (wButtons&START) != 0;
	}
	
	public boolean back() {
		return (wButtons&BACK) != 0;
	}
	
	public boolean leftThumb() {
		return (wButtons&LEFT_THUMB) != 0;
	}
	
	public boolean rightThumb() {
		return (wButtons&RIGHT_THUMB) != 0;
	}
	
	public boolean leftShoulder() {
		return (wButtons&LEFT_SHOULDER) != 0;
	}
	
	public boolean rightShoulder() {
		return (wButtons&RIGHT_SHOULDER) != 0;
	}
	
	public boolean A() {
		return (wButtons&A) != 0;
	}
	
	public boolean B() {
		return (wButtons&B) != 0;
	}
	
	public boolean X() {
		return (wButtons&X) != 0;
	}
	
	public boolean Y() {
		return (wButtons&Y) != 0;
	}

	public byte bLeftTrigger() {
		return bLeftTrigger;
	}
	
	public byte bRightTrigger() {
		return bRightTrigger;
	}
	
	public short sThumbLX() {
		return sThumbLX;
	}
	
	public short sThumbLY() {
		return sThumbLY;
	}
	
	public short sThumbRX() {
		return sThumbRX;
	}
	
	public short sThumbRY() {
		return sThumbRY;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("wButtons: ");
		String bin = Integer.toUnsignedString(Short.toUnsignedInt(wButtons),2);
		str.append(String.format("%16s", bin).replace(' ', '0'));
		str.append(System.lineSeparator());
		str.append("bLeftTrigger: "+Byte.toUnsignedInt(bLeftTrigger));
		str.append(System.lineSeparator());
		str.append("bRightTrigger: "+Byte.toUnsignedInt(bRightTrigger));
		str.append(System.lineSeparator());
		str.append("sThumbLX: "+sThumbLX);
		str.append(System.lineSeparator());
		str.append("sThumbLY: "+sThumbLY);
		str.append(System.lineSeparator());
		str.append("sThumbRX: "+sThumbRX);
		str.append(System.lineSeparator());
		str.append("sThumbRY: "+sThumbRY);
		str.append(System.lineSeparator());
		
		return str.toString();
	}
}
