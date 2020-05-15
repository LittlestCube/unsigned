import littlecube.unsigned.*;

public class test
{
	public static void main(String args[])
	{
		UnsignedByte ub = new UnsignedByte(128);
		
		System.out.println((int) ub.b);
		System.out.println(ub.get());
	}
}