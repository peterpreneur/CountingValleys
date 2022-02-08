package CountingValleys;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
	public static void main(String[] args) throws IOException {
    	String home = System.getProperty("user.home");
    	File fIn = new File(home + File.separator + "Desktop" + File.separator + "JavaIn.txt");    	
    	File fOut = new File(home + File.separator + "Desktop" + File.separator + "JavaOut.txt");    	

    	//BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fIn));
        
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fOut));	
        
		int steps = Integer.parseInt(bufferedReader.readLine().trim());

		String path = bufferedReader.readLine();

		int result = Result.countingValleys(steps, path);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
