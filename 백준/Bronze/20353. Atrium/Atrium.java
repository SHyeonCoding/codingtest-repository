import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        double n = Double.parseDouble(br.readLine());

        double result = Math.sqrt(n) * 4;
        sb.append(result);
        System.out.println(sb);
    }
}