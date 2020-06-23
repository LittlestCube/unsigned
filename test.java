import littlecube.unsigned.*;

public class test
{
	public static void main(String args[])
	{
		UnsignedShort ub = new UnsignedShort(0xBEEF);
		
		System.out.printf("%02X", ub.subByte(1));
	}
}