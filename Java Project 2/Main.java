package Sasan.Pournourni.A01061714;
/*
 * Author Sasan
 */
public class Main {

	public static void main(String[] args) throws InvalidHumanException {
		
		
		
		Rock rock = new Rock("Soft Rock", 4 ,25, 125);
		rock.printDetails();
		

		Metal metal = new Metal ("Heavy Metal", 8.20, 28,100);
		metal.printDetails();
		
		Pop pop = new Pop("acid jazz", 3.2, 14, true);
		pop.printDetails();
		
		Rap rap = new Rap("HipHop" ,3.4, 20, true);
		rap.printDetails();
		rap.displayAllrapSongs();


	}

}
