import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int price = Integer.parseInt(br.readLine());

        for(int i = 0; i < 9; i++) {
           price -= Integer.parseInt(br.readLine());
        }

        sb.append(price);
        System.out.println(sb);
    }
}