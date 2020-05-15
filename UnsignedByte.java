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
	
	// ------- byte parameters --------
	public byte add(byte param)
	{
		return unsign((byte) (b + param));
	}
	
	public byte sub(byte param)
	{
		return add(-param);
	}
	
	public byte or(byte param)
	{
		return unsign((byte) (b |= param));
	}
	
	public byte and(byte param)
	{
		return unsign((byte) (b &= param));
	}
	
	public byte xor(byte param)
	{
		return unsign((byte) (b ^= param));
	}
	
	// ------ short parameters --------
	public byte add(short param)
	{
		return unsign((byte) (b + param));
	}
	
	public byte sub(short param)
	{
		return add(-param);
	}
	
	public byte or(short param)
	{
		return unsign((byte) (b |= param));
	}
	
	public byte and(short param)
	{
		return unsign((byte) (b &= param));
	}
	
	public byte xor(short param)
	{
		return unsign((byte) (b ^= param));
	}
	
	// -------- int parameters --------
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