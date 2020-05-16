import littlecube.unsigned.*;

public class test
{
	public static void main(String args[])
	{
		UnsignedShort ub = new UnsignedShort(0x8000);
		short s = (short) 0x8000;
		
		ub.xor(0x50);
		s ^= 0x50;
		
		System.out.println("\n" + (int) ub.s);
		System.out.println(ub.get() + "\n");
		System.out.println(s);
		System.out.println(ub.unsign(s));
	}
}