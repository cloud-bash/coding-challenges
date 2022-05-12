class Result {

    /*
     * Complete the 'maximizingXor' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER l
     *  2. INTEGER r
     */

    public static int maximizingXor(int l, int r) {
    // Write your code here
    //working variables x and y hold l and r respectively
    int x = l;
    int y = r;
    //first value for maxXORvalue
    int maxResult = l ^ r;
    //test all values ascending toward max
    while(x<r){
        int current = x ^ r;
        System.out.println(current);
        if(current > maxResult){
            maxResult = current;
        }
        x++;
    }
    x = l;
    //test all values descending toward min
    while(y > l){
        int current = y ^ l;
        System.out.println(current);
        if(current > maxResult){
            maxResult = current;
        }
        y--;
    }
    
    return maxResult;
    }

}
