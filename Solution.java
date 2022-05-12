public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if(N%2 != 0){
            //if N is odd print weird
            System.out.println("Weird");
        } else if (N%2 == 0 && N >= 6 && N <= 20){
            //if N is even and equal to or between 6 and 20 print weird
            System.out.println("Weird");
        } 
        else if (N % 2 == 0 && N >= 2 && N <= 5){
            //if N is even and between 2 and 5 inclusive print not weird
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && N > 20){
            //if N is even and greated than 20 print not weird
            System.out.println("Not Weird");
        }
    }
}
