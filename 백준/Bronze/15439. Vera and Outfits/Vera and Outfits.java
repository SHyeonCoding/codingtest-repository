import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        int result = 0;

        for(int i = 1; i < num; i++) {
            result += i;
        }

        sb.append(result * 2);

        System.out.println(sb);
    }
}