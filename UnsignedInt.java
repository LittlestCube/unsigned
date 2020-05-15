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
	
	void set(byte param)
	{
		in = param;
	}
	
	int get()
	{
		return (int) (in & 0xFFFF);
	}
}