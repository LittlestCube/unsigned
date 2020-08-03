package littlecube.unsigned;

public class UnsignedShort
{
	public short s;
	
	public UnsignedShort(byte param)
	{
		set(param);
	}
	
	public UnsignedShort(short param)
	{
		set(param);
	}
	
	public UnsignedShort(int param)
	{
		set(param);
	}
	
	public UnsignedShort()
	{
		set(0);
	}
	
	
	
	public int unsign(short param)
	{
		return param & 0xFFFF;
	}
	
	
	
	public int get()
	{
		return unsign(s);
	}
	
	public int getBit(int position)
	{
		return ((s & (0x1 << position)) >> position);
	}
	
	public int subBits(int from, int to)
	{
		int bits = 0;
		
		for (int i = from; i <= to; i++)
		{
			bits |= getBit(i) << (i - from);
		}
		
		return bits;
	}
	
	public void setBit(int position, int value)
	{
		value %= 2;
		
		if (value == 0)
		{
			s = (short) (s & ~((0x1 << position)));
		}
		
		else
		{
			s = (short) (s | (0x1 << position));
		}
	}
	
	public void setBits(int from, int ... values)
	{
		for (int i = 0; i < values.length; i++)
		{
			setBit(from + i, values[i]);
		}
	}
	
	public void setBits(int from, int to, UnsignedByte value)
	{
		for (int i = from; i <= to; i++)
		{
			setBit(i, value.getBit(i));
		}
	}
	
	public void setBits(int from, int to, UnsignedShort value)
	{
		for (int i = from; i <= to; i++)
		{
			setBit(i, value.getBit(i));
		}
	}
	
	public void setByte(int position, int nbyte)
	{
		nbyte = nbyte & 0xFF;
		
		int actualPosition = position * 8;
		
		s = (short) ((nbyte << actualPosition) | (s & ~(0xFF << actualPosition)));
	}
	
	public byte subByte(int position)
	{
		int actualPosition = position * 8;
		
		return (byte) ((s & (0xFF << (actualPosition))) >> actualPosition);
	}
	
	public void craftShort(byte byte1, byte byte0)
	{
		setByte(1, byte1);
		setByte(0, byte0);
	}
	
	
	
	public void left(int offset)
	{
		s <<= offset;
	}
	
	public void right(int offset)
	{
		s >>= offset;
	}
	
	public void comp()
	{
		s = (short) ~s;
	}
	
	
	
	// -------- UnsignedShort parameters --------
	public void set(UnsignedShort param)
	{
		s = param.s;
	}
	
	public void add(UnsignedShort param)
	{
		s += param.get();
	}
	
	public void sub(UnsignedShort param)
	{
		add(-param.get());
	}
	
	public void or(UnsignedShort param)
	{
		s |= param.s;
	}
	
	public void and(UnsignedShort param)
	{
		s &= param.s;
	}
	
	public void xor(UnsignedShort param)
	{
		s ^= param.s;
	}
	
	
	
	// -------- UnsignedByte parameters --------
	public void set(UnsignedByte param)
	{
		s = param.b;
	}
	
	public void add(UnsignedByte param)
	{
		s += param.get();
	}
	
	public void sub(UnsignedByte param)
	{
		add(-param.get());
	}
	
	public void or(UnsignedByte param)
	{
		s |= param.b;
	}
	
	public void and(UnsignedByte param)
	{
		s &= param.b;
	}
	
	public void xor(UnsignedByte param)
	{
		s ^= param.b;
	}
	
	
	
	// ------- byte parameters --------
	public void set(byte param)
	{
		s = (short) param;
	}
	
	public void add(byte param)
	{
		s += param;
	}
	
	public void sub(byte param)
	{
		add(-param);
	}
	
	public void or(byte param)
	{
		s |= param;
	}
	
	public void and(byte param)
	{
		s &= param;
	}
	
	public void xor(byte param)
	{
		s ^= param;
	}
	
	
	
	// ------ short parameters --------
	public void set(short param)
	{
		s = param;
	}
	
	public void add(short param)
	{
		s += param;
	}
	
	public void sub(short param)
	{
		add(-param);
	}
	
	public void or(short param)
	{
		s |= param;
	}
	
	public void and(short param)
	{
		s &= param;
	}
	
	public void xor(short param)
	{
		s ^= param;
	}
	
	
	
	// -------- int parameters --------
	public void set(int param)
	{
		s = (short) param;
	}
	public void add(int param)
	{
		s += param;
	}
	
	public void sub(int param)
	{
		add(-param);
	}
	
	public void or(int param)
	{
		s |= param;
	}
	
	public void and(int param)
	{
		s &= param;
	}
	
	public void xor(int param)
	{
		s ^= param;
	}
}