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
	
	void set(byte param)
	{
		s = param;
	}
	
	short get()
	{
		return (short) (s & 0xFFFF);
	}
}