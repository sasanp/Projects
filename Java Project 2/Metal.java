package Sasan.Pournourni.A01061714;
/*
 * Author Sasan
 */
public class Metal extends Rock{
	
	

	/**
	 * @param musicLength
	 * @param avrAudienceAge
	 * @param desible
	 */
	public Metal(String style, double musicLength, int avrAudienceAge, int desible) {
		super(style, musicLength,avrAudienceAge, desible);
		
		
	}
	
	@Override
	public void lyricType() 
	{
		System.out.print("Explicist lyrics ");
		
	}
	
	@Override
	public void rhyme() 
	{
		System.out.print("intro, ");
		System.out.print("Verse, ");
		System.out.print("Chorus");		
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
		System.out.print("Hit Hat, ");
		System.out.print("Bass drum, ");
		System.out.print("Snare Drum");
		
		
	}
	
	@Override
	public void piano() 
	{	
		System.out.print("Electronic Keyboard, ");
		System.out.print("Organs");
	}
	

	@Override
	public void tempo()
	{
		System.out.print("100-160");
	}
	
	@Override
	public void printDetails() 
	{
		System.out.print("Metal is made of " );
		lyricType();
		System.out.print(", ");
		guitar();
		System.out.print(", ");
		bass();
		System.out.print(", ");		
		drums();
		System.out.print(", ");	
		rhyme();
		System.out.print(" rhyme, ");	
		piano();
		System.out.print(", with tempo of ");		
		tempo();
		System.out.print(";");
		System.out.println(" Also known as "+getStyle() + ".");
		System.out.println();
		

		
	}
	
	@Override
	public String toString()
	{
		return getClass().getSimpleName() + " music is a sub-genre of rock with avrange audince age of" + getAvrAudienceAge(); 
	}
	


}
