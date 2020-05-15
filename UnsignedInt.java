package unsigned;

public class UnsignedInt
{
	int in;
	
	UnsignedInt(int param)
	{
		set(param);
	}
	
	UnsignedInt()
	{
		
	}
	
	public int unsign(int param)
	{
		return (int) (param & 0xFFFFFFFF);
	}
	
	public void set(int param)
	{
		in = param;
	}
	
	public int get()
	{
		return (int) unsign(in);
	}
	
	public int add(int param)
	{
		return (int) unsign(in + param);
	}
	
	public int sub(int param)
	{
		return add(-param);
	}
	
	public int or(int param)
	{
		return (int) unsign(in |= param);
	}
	
	public int and(int param)
	{
		return (int) unsign(in &= param);
	}
	
	public int xor(int param)
	{
		return (int) unsign(in ^= param);
	}
}