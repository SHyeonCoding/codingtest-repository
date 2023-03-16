import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            String firstWord = String.valueOf(s.charAt(0));
            sb.append(firstWord.toUpperCase()).append(s.substring(1)).append("\n");
        }

        System.out.println(sb);
    }
}