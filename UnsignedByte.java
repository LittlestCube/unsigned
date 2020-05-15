package unsigned;

public class UnsignedByte
{
	byte b;
	
	UnsignedByte(byte param)
	{
		set(param);
	}
	
	UnsignedByte()
	{
		
	}
	
	public void set(byte param)
	{
		b = param;
	}
	
	public byte get()
	{
		return (byte) (b & 0xFF);
	}
	
	public byte add(int param)
	{
		return (byte) ((b + param) & 0xFF);
	}
	
	public byte sub(int param)
	{
		return add(-param);
	}
}