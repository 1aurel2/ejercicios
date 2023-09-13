
public class Main {

	public static void main(String[] args) {
		// Estructura de repeticion 
		
		for (int i = 0; i <= 24; i = i + 2) {
			System.out.print(i + ",");
		}
		// Estructura de control
		
		for (int edad = 30; edad > 24; edad =+2) {


			if (edad == 24) {
				System.out.println("Tiene 24 años");
			} else if (edad > 18) {
				System.out.println("Tiene mas de 18 años");
			} else {
				System.out.println("Tiene menos de 18 años");
			}

		}

	}

}
