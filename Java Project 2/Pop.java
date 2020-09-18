package Sasan.Pournourni.A01061714;
/*
 * Author Sasan
 */
public class Pop extends Music{

	
	private boolean dance;
	/**
	 * @param musicLength
	 * @param avrAudienceAge
	 * @throws InvalidHumanException 
	 */
	public Pop(String style, double musicLength, int avrAudienceAge, boolean dance) throws InvalidHumanException {
		super(style, musicLength, avrAudienceAge);
		
		setDance(dance);
	}
	/**
	 * @return dance
	 */
	public boolean isDance() 
	{
		return dance;
	}
	/**
	 * @param dance
	 */
	
	
	/**
	 * @param dance
	 */
	public void setDance(boolean dance) throws InvalidHumanException
	{
		if(getAvrAudienceAge() >= 0)
		{
			this.dance = dance;
		}
		else
		{
			throw new InvalidHumanException("Alien Suspected");
		}
	}
	
	
	@Override
	public void lyricType() 
	{
		System.out.print("generic");
		
	}
	
	@Override
	public void rhyme() 
	{
		System.out.print("dance");
		
	}
	public void guitar() 
	{	
		System.out.print("Accoustic");
		
	}

	@Override
	public void drums() 
	{
		System.out.print("Drum Kit, ");
		System.out.print("Cymbal");
	}



	@Override
	public void piano() 
	{	
		System.out.print("Electric Piano");
	}


	
	@Override
	public void tempo()
	{
		System.out.print("100-130");
	}
	
	public void printDetails() 
	{
		System.out.print("Pop is made of " );
		lyricType();
		System.out.print(" and ");
		guitar();
		System.out.print(", ");
		bass();
		System.out.print(", ");		
		drums();
		System.out.print(", ");	
		rhyme();
		System.out.print(", ");	
		piano();
		System.out.print(", with tempo of ");		
		tempo();
		System.out.print(".");
		System.out.println("The style is "+getStyle()+ ".");
		System.out.println();
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (dance ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pop other = (Pop) obj;
		if (dance != other.dance)
			return false;
		return true;
	}
	
	@Override
	public String toString()
	{
		return getClass().getSimpleName() + " music has a generic style." ; 
	}

	

}
