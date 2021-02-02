package core22;


public class LimitsOfTypesApp {
	
	public void getAllValueLimits() {
		getMaxMinByte();
		getMaxMinShort();
		getMaxMinInteger();
		getMaxMinLong();
		getMaxMinFloat();
		getMaxMinDouble();
		getMaxMinChar(); //added int to show something:)
		getMaxMinBoolean();
	}
	
	public void getValueLimitsByInput(String input) {
		switch (input.toLowerCase()) {
		case "int":
		    getMaxMinInteger();
			break;
		case "double":
			getMaxMinDouble();
			break;
		case "byte":
			getMaxMinByte();
			break;
		case "float":
			getMaxMinFloat();
			break;
		case "char":
			getMaxMinChar();
			break;
		case "short":
			getMaxMinShort();
			break;
		case "long":
		    getMaxMinLong();
			break;
		case "boolean":
			getMaxMinBoolean();
			break;
	}
}

	private void getMaxMinInteger() {
		System.out.println("This is min int: " + Integer.MIN_VALUE);
		System.out.println("This is max int: " + Integer.MAX_VALUE);
	}
	private void getMaxMinDouble() {
		System.out.println("This is min double: " + Double.MIN_VALUE);
		System.out.println("This is max double: " + Double.MAX_VALUE);
	}
	private void getMaxMinFloat() {
		System.out.println("This is min float: " + Float.MIN_VALUE);
		System.out.println("This is max float: " + Float.MAX_VALUE);
	}
	private void getMaxMinChar() {
		System.out.println("This is min char: " + (int)Character.MIN_VALUE);
		System.out.println("This is max char: " + (int)Character.MAX_VALUE);
	}
	private void getMaxMinByte() {
		System.out.println("This is min byte: " + Byte.MIN_VALUE);
		System.out.println("This is max byte: " + Byte.MAX_VALUE);
	}
	private void getMaxMinShort() {
		System.out.println("This is min short: " + Short.MIN_VALUE);
		System.out.println("This is max short: " + Short.MAX_VALUE);
	}
	private void getMaxMinLong() {
		System.out.println("This is min long: " + Long.MIN_VALUE);
		System.out.println("This is max long: " + Long.MAX_VALUE);
	}
	private void getMaxMinBoolean() {
		System.out.println("This is min boolean: " + Boolean.FALSE);
		System.out.println("This is max boolean: " + Boolean.TRUE);
	}
}