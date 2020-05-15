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
	
	public byte unsign(byte param)
	{
		return (byte) (param & 0xFF);
	}
	
	public void set(byte param)
	{
		b = param;
	}
	
	public byte get()
	{
		return unsign(b);
	}
	
	public byte add(int param)
	{
		return unsign((byte) (b + param));
	}
	
	public byte sub(int param)
	{
		return add(-param);
	}
	
	public byte or(int param)
	{
		return unsign((byte) (b |= param));
	}
	
	public byte and(int param)
	{
		return unsign((byte) (b &= param));
	}
	
	public byte xor(int param)
	{
		return unsign((byte) (b ^= param));
	}
}