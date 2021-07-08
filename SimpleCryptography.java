import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Encrypt(1) or Decrypt(2)? (Choose 1 or 2)");
		String t = input.nextLine();
		
		if (t.equals("1")) {				//Encrypt
			
			System.out.println("Encrypt text: ");
			String text = input.nextLine();
			
			int key = 5;    //The value can be change
			
			
			char[] chars = text.toCharArray();
			for (char c: chars) {
				c += key;
				System.out.print(c);
			}
		}
		else {
			
			if(t.equals("2")) {					//Decrypt
				
				System.out.println("Decrypt text: ");
				String text = input.nextLine();
				
				int key = 5;		//The value can be change
				
				char[] chars = text.toCharArray();
				for (char c: chars) {
					c -= key;
					System.out.print(c);
			}
		}
			else {
				System.exit(-1);
			}
		}
	}
}