package littlecube.unsigned;

public class UnsignedByte
{
	public byte b;
	
	public UnsignedByte(byte param)
	{
		set(param);
	}
	
	public UnsignedByte(short param)
	{
		set(param);
	}
	
	public UnsignedByte(int param)
	{
		set(param);
	}
	
	public UnsignedByte()
	{
		set(0);
	}
	
	
	
	public int unsign(byte param)
	{
		return param & 0xFF;
	}
	
	public int get()
	{
		return unsign(b);
	}
	
	public int getBit(int position)
	{
		return (b & (0x1 << position));
	}
	
	public void setBit(int position, int value)
	{
		value %= 2;
		
		if (value == 0)
		{
			b = (byte) (b & ~((0x1 << position)));
		}
		
		else
		{
			b = (byte) (b | (0x1 << position));
		}
	}
	
	
	
	public void left(int offset)
	{
		b <<= offset;
	}
	
	public void right(int offset)
	{
		b >>= offset;
	}
	
	
	
	// -------- UnsignedShort parameters --------
	public void set(UnsignedShort param)
	{
		b = (byte) param.s;
	}
	
	public void add(UnsignedShort param)
	{
		b += param.get();
	}
	
	public void sub(UnsignedShort param)
	{
		add(-param.get());
	}
	
	public void or(UnsignedShort param)
	{
		b |= param.s;
	}
	
	public void and(UnsignedShort param)
	{
		b &= param.s;
	}
	
	public void xor(UnsignedShort param)
	{
		b ^= param.s;
	}
	
	
	
	// -------- UnsignedByte parameters --------
	public void set(UnsignedByte param)
	{
		b = param.b;
	}
	
	public void add(UnsignedByte param)
	{
		b += param.get();
	}
	
	public void sub(UnsignedByte param)
	{
		add(-param.get());
	}
	
	public void or(UnsignedByte param)
	{
		b |= param.b;
	}
	
	public void and(UnsignedByte param)
	{
		b &= param.b;
	}
	
	public void xor(UnsignedByte param)
	{
		b ^= param.b;
	}
	
	
	
	// ------- byte parameters --------
	public void set(byte param)
	{
		b = param;
	}
	
	public void add(byte param)
	{
		b += param;
	}
	
	public void sub(byte param)
	{
		add(-param);
	}
	
	public void or(byte param)
	{
		b |= param;
	}
	
	public void and(byte param)
	{
		b &= param;
	}
	
	public void xor(byte param)
	{
		b ^= param;
	}
	
	
	
	// ------ short parameters --------
	public void set(short param)
	{
		b = (byte) param;
	}
	
	public void add(short param)
	{
		b += param;
	}
	
	public void sub(short param)
	{
		add(-param);
	}
	
	public void or(short param)
	{
		b |= param;
	}
	
	public void and(short param)
	{
		b &= param;
	}
	
	public void xor(short param)
	{
		b ^= param;
	}
	
	
	
	// -------- int parameters --------
	public void set(int param)
	{
		b = (byte) param;
	}
	
	public void add(int param)
	{
		b += param;
	}
	
	public void sub(int param)
	{
		add(-param);
	}
	
	public void or(int param)
	{
		b |= param;
	}
	
	public void and(int param)
	{
		b &= param;
	}
	
	public void xor(int param)
	{
		b ^= param;
	}
}