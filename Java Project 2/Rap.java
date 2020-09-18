package Sasan.Pournourni.A01061714;

import java.util.HashMap;

/*
 * Author Sasan
 */
public class Rap extends Music {

	private boolean political;
	public final static int PG_13 = 13;
	
	private HashMap<String, String> rapSongs;
	
	/**
	 * @param musicLength
	 * @param avrAudienceAge
	 * @param political
	 */
	public Rap(String style,double musicLength, int avrAudienceAge, boolean political)
	{
		super(style, musicLength, avrAudienceAge);
		
		setPolitical(political);
		
		
		rapSongs = new HashMap<String, String>();
		rapSongs.put(("50 Cents"), ("In Da Club"));
		rapSongs.put(("Eminem"), ("I'M NOT AFRAID"));
		rapSongs.put(("Snoop Dog"), ("Like it's hot"));
	}
	
	

	/**
	 * @param style
	 * @param musicLength
	 * @param avrAudienceAge
	 * @param political
	 * @param rapSongs
	 */
	public Rap(String style, double musicLength, int avrAudienceAge, boolean political,
			HashMap<String, String> rapSongs) 
	{
		super(style, musicLength, avrAudienceAge);
		this.political = political;
		this.rapSongs = rapSongs;
		

		
	}


	/**
	 * displayAllrapSongs()
	 */
	public void displayAllrapSongs()
	{
		System.out.println("List of popular rappers and their hit songs");
		
		for (String songs : rapSongs.keySet()) 
		{
			  System.out.println("Rapper: " + songs + " - " + rapSongs.get(songs));
			}
			
	}

	/**
	 * @return rapSongs
	 */
	public HashMap<String, String> getRapSongs() 
	{
		return rapSongs;
	}



	/**
	 * @param rapSongs
	 */
	public void setRapSongs(HashMap<String, String> rapSongs) 
	{
		if(rapSongs !=null && !rapSongs.isEmpty())
		{
			this.rapSongs = rapSongs;
		}
		else
		{
			throw new IllegalArgumentException("invaldi entry");
		}
		
	}



	/**
	 * @return political
	 */
	public boolean isPolitical() 
	{
		return political;
	}

	/**
	 * @param political
	 */
	public void setPolitical(boolean political) 
	{
		
		if(political)
		{
			if( getAvrAudienceAge() >= PG_13)
			{
				this.political = political;
			}
			
			else
			{
				throw new IllegalArgumentException("underage limit");
			}
		}
	}
	
	
	@Override
	public void lyricType() 
	{
		System.out.print("reality");
		
	}

	@Override
	public void rhyme() 
	{
		System.out.print("flow");
		
	}
	
	@Override
	public void drums() 
	{
		System.out.print("Hit Hat, ");
		System.out.print("drum machine");
		
	}

	@Override
	public void synth() 
	{	
		System.out.print("samples");
	}

	@Override
	public void piano() 
	{	
		System.out.print("Organs");
	}


	@Override
	public void tempo()
	{
		System.out.print("60-80");
	}
	public void printDetails() 
	{
		System.out.print("Rap is made of " );
		lyricType();
		
		guitar();
		System.out.print(", ");
		synth();
		System.out.print(", ");		
		drums();
		System.out.print(", ");	
		rhyme();
		System.out.print(" rhyme, ");	
		piano();
		System.out.print(", with tempo of ");		
		tempo();
		System.out.print(";");
		System.out.println(" Also known as "+getStyle()+".");
		System.out.println();
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (political ? 1231 : 1237);
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
		Rap other = (Rap) obj;
		if (political != other.political)
			return false;
		return true;
	}
	
	@Override
	public String toString()
	{
		return getClass().getSimpleName() + " music often has a strong meaning when it's" + political; 
	}



}
