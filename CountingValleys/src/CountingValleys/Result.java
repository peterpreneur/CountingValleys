package CountingValleys;

import java.io.Console;

class Result {

	/*
	 * Complete the 'countingValleys' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER steps 2. STRING path
	 */

	//public static void main(String args[]) {
	public static int countingValleys(int steps, String path) {
		// Write your code here
		//int steps = 12;
		//String path = "DDUUDDUDUUUD";
		int count = 0;
		int valleyCnt = 0;
		String status = "begin";

		for (int i = 0; i < path.length(); i++) {
			System.out.println(path.charAt(i));

			if (count < 0) {
				status = "startValley";
				System.out.println("status " + status );
			};

			// System.out.print(i + " ");
			if (path.charAt(i) == 'U') {
				count += 1;
			} else {
				count -= 1;
			}
			System.out.println("count " + count );

			if ((status.equalsIgnoreCase("startValley")) 
					&& (count >= 0)) {
				valleyCnt += 1;
				status = "endValley";
				System.out.println("status " + status );
				System.out.println("valleyCnt " + valleyCnt+ "\n");
			}
		}

		System.out.println(valleyCnt);
		return valleyCnt;
	}

}
