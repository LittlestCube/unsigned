package littlecube.unsigned;

public class UnsignedShort
{
	short s;
	
	public UnsignedShort(short param)
	{
		set(param);
	}
	
	public UnsignedShort()
	{
		
	}
	
	public int unsign(short param)
	{
		return param & 0xFFFF;
	}
	
	public int get()
	{
		return unsign(s);
	}
	
	// -------- UnsignedShort parameters --------
	public void set(UnsignedShort param)
	{
		s = (byte) param.s;
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
		s |= param.get();
	}
	
	public void and(UnsignedShort param)
	{
		s &= param.get();
	}
	
	public void xor(UnsignedShort param)
	{
		s ^= param.get();
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
		s |= param.get();
	}
	
	public void and(UnsignedByte param)
	{
		s &= param.get();
	}
	
	public void xor(UnsignedByte param)
	{
		s ^= param.get();
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