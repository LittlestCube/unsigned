import littlecube.unsigned.*;

public class test
{
	public static void main(String args[])
	{
		UnsignedByte ub = new UnsignedByte(0xF0);
		byte b = (byte) 0xF0;
		
		ub.xor(0x50);
		b ^= 0x50;
		
		System.out.println("\n" + (int) ub.b);
		System.out.println(ub.get() + "\n");
		System.out.println(b);
		System.out.println(ub.unsign(b));
	}
}