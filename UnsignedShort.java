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
	
	public short unsign(short param)
	{
		return (short) (param & 0xFFFF);
	}
	
	public void set(short param)
	{
		s = param;
	}
	
	public short get()
	{
		return unsign(s);
	}
	
	public short add(int param)
	{
		return unsign((short) (s + param));
	}
	
	public short sub(int param)
	{
		return add(-param);
	}
	
	public short or(int param)
	{
		return unsign((short) (s |= param));
	}
	
	public short and(int param)
	{
		return unsign((short) (s &= param));
	}
	
	public short xor(int param)
	{
		return unsign((short) (s ^= param));
	}
}