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
	
	public void set(int param)
	{
		in = param;
	}
	
	public int get()
	{
		return (int) (in & 0xFFFF);
	}
	
	public int add(int param)
	{
		return (int) ((in + param) & 0xFF);
	}
	
	public int sub(int param)
	{
		return add(-param);
	}
}