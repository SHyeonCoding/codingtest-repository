import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        double n = Double.parseDouble(br.readLine());

        sb.append(String.format("%.2f", n / 4));
        System.out.println(sb);
    }
}