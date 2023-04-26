import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            int result = 0;
            if(n == 0) break;

            while (true) {
                for (int i = 0; i < String.valueOf(n).length(); i++) {
                    result += String.valueOf(n).charAt(i) - '0';
                }

                if(result < 10) break;
                else {
                    n = result;
                    result = 0;
                }
            }
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}