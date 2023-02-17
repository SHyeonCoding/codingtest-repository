import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long n = Integer.parseInt(br.readLine());

        sb.append(fact(n));
        System.out.println(sb);
    }

    public static long fact(long n) {
        if(n <= 1) return 1;

        return n * fact(n - 1);
    }
}