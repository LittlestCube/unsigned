package unsigned;

public class UnsignedInt
{
	int in;
	
	UnsignedInt(byte param)
	{
		set(param);
	}
	
	UnsignedInt()
	{
		
	}
	
	public void set(byte param)
	{
		in = param;
	}
	
	public int get()
	{
		return (int) (in & 0xFFFF);
	}
}