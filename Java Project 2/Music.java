package Sasan.Pournourni.A01061714;
/*
 * Author Sasan
 */
public abstract class Music implements Vocalable, Instrumentable, Comparable <Music> {

	
		private String style;
		private double musicLength;
		private int avrAudienceAge;
		
		public final static int PG_13 = 13;
		

		/**
		 * @param musicLength
		 * @param avrAudienceAge
		 */
		public Music(String style, double musicLength ,int avrAudienceAge)
		{
			this.style = style;
			setAvrAudienceAge(avrAudienceAge);
			setMusicLength(musicLength);
		}
		
		/**
		 * @return style
		 */
		public String getStyle() {
			return style;
		}

		
		/**
		 * @return musicLength
		 */
		public double getMusicLength() {
			return musicLength;
		}

		/**
		 * @param musicLength
		 */
		public void setMusicLength(double musicLength) {
			this.musicLength = musicLength;
		}

		/**
		 * @return avrAudienceAge
		 */
		public double getAvrAudienceAge() 
		{
			return avrAudienceAge;
		}

		/**
		 * @param avrAudienceAge
		 */
		public void setAvrAudienceAge(int avrAudienceAge) 
		{
			if(avrAudienceAge >= PG_13)
			{
				this.avrAudienceAge = avrAudienceAge;
			}
			else
			{
				throw new IllegalArgumentException("under age limit");
			}
		}

		/**
		 * @return musicLength
		 */


		
		//following methods are from the interface class Vocalable that has to be impelemented here

		public abstract void lyricType(); 



		public abstract void rhyme();

		//followings methods are implemented from the Instrumental interface
		@Override
		
		public void guitar() 
		{	
		}

		@Override
		public void drums() 
		{
		}

		@Override
		public void synth() 
		{	
		}

		@Override
		public void piano() 
		{	
		}

		@Override
		public void bass() 
		{	
		}
		
		@Override
		public void tempo()
		{
		}
		
		public abstract void printDetails();
		@Override
		public int compareTo(Music m) 
		{
			return(int)(m.musicLength - this.musicLength);
		}

		


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + avrAudienceAge;
			long temp;
			temp = Double.doubleToLongBits(musicLength);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((style == null) ? 0 : style.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Music other = (Music) obj;
			if (avrAudienceAge != other.avrAudienceAge)
				return false;
			if (Double.doubleToLongBits(musicLength) != Double.doubleToLongBits(other.musicLength))
				return false;
			if (style == null) {
				if (other.style != null)
					return false;
			} else if (!style.equals(other.style))
				return false;
			return true;
		}

		/**
		 * toString()
		 */
		public String toString()
		{
			return super.toString() + "I like listening to " + getClass().getSimpleName() + " when the length is more than" + musicLength + "minutes"; 
		}





	}


