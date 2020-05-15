package unsigned;

public class UnsignedShort
{
	short s;
	
	UnsignedShort(short param)
	{
		set(param);
	}
	
	UnsignedShort()
	{
		
	}
	
	public void set(short param)
	{
		s = param;
	}
	
	public short get()
	{
		return (short) (s & 0xFFFF);
	}
	
	public short add(int param)
	{
		return (short) ((s + param) & 0xFF);
	}
	
	public short sub(int param)
	{
		return add(-param);
	}
}