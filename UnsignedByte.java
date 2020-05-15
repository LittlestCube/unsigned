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
}