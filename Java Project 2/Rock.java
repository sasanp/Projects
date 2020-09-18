package Sasan.Pournourni.A01061714;
/*
 * Author Sasan
 */
public class Rock extends Music{

	private int desible;
	
	
	/**
	 * @param musicLength
	 * @param desible
	 */
	public Rock(String style,double musicLength,int avrAudienceAge, int desible)
	{
		super(style, musicLength, avrAudienceAge);
		
		setDesible(desible);
		
	}
	
	
	
	/**
	 * @return desible
	 */
	public int getDesible()
	{
		return desible;
	}



	/**
	 * @param desible
	 */
	public void setDesible(int desible)
	{
		if(desible >= 0) 
		{
		this.desible = desible;
		}
		else
		{
			throw new IllegalArgumentException("invalid decible");
		}
	}



	@Override
	public void lyricType() 
	{
		System.out.print("Magma");
		
	}
	@Override
	public void rhyme() 
	{

		System.out.print("Verse and Chorus");
		
	}
	
	@Override
	public void guitar()
	{
		System.out.print("Electric Guitar");
		
	}
	@Override
	public void bass()
	{
		System.out.print("Bass Guitar");
		
	}

	@Override
	public void drums() 
	{
		System.out.print("Hit Hat");
		System.out.print("Bass drum");
		System.out.print("Snare Drum");
		
	}


	@Override
	public void tempo()
	{
		System.out.print("110-140");
	}
	
	@Override
	public void printDetails() 
	{
		System.out.print("Rock is made of " );
		lyricType();
		System.out.print(" and ");
		guitar();
		System.out.print(", ");
		bass();
		System.out.print(", ");		
		drums();
		System.out.print(", ");	
		rhyme();
		System.out.print(", with tempo of ");		
		tempo();
		System.out.print(".");
		System.out.println(" The Style is "+getStyle()+ ".");
		System.out.println();
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + desible;
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
		Rock other = (Rock) obj;
		if (desible != other.desible)
			return false;
		return true;
	}

	
	@Override
	public String toString()
	{
		return getClass().getSimpleName() + " music is often with higher decibles more than" + desible; 
	}




	
	

}
