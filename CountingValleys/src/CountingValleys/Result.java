package CountingValleys;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    // Write your code here
        int i = 0;
        for (i=0; i < steps; i++) {
            int count = 0;            
            System.out.println(path.indexOf(i));
        }
		return i;
    }

}
