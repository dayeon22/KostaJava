package mycom.mytest;

public class Star1 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i == 0)
				System.out.print(" ");
			else {
				for (int j = 1; j <= i + 1; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
