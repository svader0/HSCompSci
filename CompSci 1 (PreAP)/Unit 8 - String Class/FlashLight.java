package Unit8;

public class FlashLight {

	public static void main(String[] args) {
		String flashlight = "flashlight";
		
		
		System.out.println("\nPART ONE\n=============\n");
		System.out.println(flashlight.substring(0, 5));
		System.out.println(flashlight.substring(5, 10));
		System.out.println(flashlight.substring(2, 5));
		System.out.println(flashlight.substring(0, 1) + flashlight.substring(5, 10));
		System.out.println(flashlight.substring(0, 3) + flashlight.substring(7, 8));
		System.out.println(flashlight.substring(0, 1) + flashlight.substring(6, 7) + flashlight.substring(9, 10));
		System.out.println(flashlight.substring(4, 5) + flashlight.substring(6, 9));
		System.out.println(flashlight.substring(7, 8) + flashlight.substring(2, 4));
		System.out.println(flashlight.substring(0, 1) + flashlight.substring(2, 4) + flashlight.substring(9,10));
		System.out.println(flashlight.substring(3, 5) + flashlight.substring(2, 3) + flashlight.substring(0, 1)+ flashlight.substring(9, 10));
		System.out.println("\nPART TWO\n=============\n");
		System.out.println(flashlight.substring(5, 10) + "s");
		System.out.println(flashlight.substring(5, 10) + "er");
		System.out.println(flashlight.substring(5, 10) + "ning");
		System.out.println("en" + flashlight.substring(5, 10) + "ened");
	}

}
