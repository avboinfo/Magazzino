/*
** GeProMag - Sandro Gallo - 13/12/2023
*/

public class Main
{
	public static void main(String[] args) {
	    Magazzino2 mc = new Magazzino2("centrale");
		System.out.println(mc);
		
		Bottiglia<String> b = new Bottiglia<>(" sono una stringa catturata dentro una bottiglia ");
		System.out.println(b);
		
		
	}
}
