import java.util.Scanner;

public class SolutionFormatter {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                //create space
                String space = "";
                for(int j =0;j<15-s1.length();j++){
                    space += " ";
                }
                String xString = Integer.toString(x);
                while(xString.length()<3){
                    xString = "0" + xString;
                }
                System.out.printf(s1 + space + xString).println();
            }
            System.out.println("================================");

    }
}



