import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = 0;

        while(n++ < 3) {
            int loop = Integer.parseInt(br.readLine());

            BigInteger sum = BigInteger.ZERO;
            for(int i = 0; i < loop; i++) {
                sum = sum.add(new BigInteger(br.readLine()));
            }

            if(sum.compareTo(BigInteger.ZERO) == 0) sb.append(0);
            else if(sum.compareTo(BigInteger.ZERO) == 1) sb.append("+");
            else sb.append("-");
            sb.append("\n");
        }

        System.out.println(sb);
    }
}