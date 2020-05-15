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
	
	void set(byte param)
	{
		b = param;
	}
	
	byte get()
	{
		return (byte) (b & 0xFF);
	}
}