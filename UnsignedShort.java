package unsigned;

public class UnsignedShort
{
	short s;
	
	UnsignedShort(byte param)
	{
		set(param);
	}
	
	UnsignedShort()
	{
		
	}
	
	public void set(byte param)
	{
		s = param;
	}
	
	public short get()
	{
		return (short) (s & 0xFFFF);
	}
}