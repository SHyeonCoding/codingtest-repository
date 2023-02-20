import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = 1;
        String s = "";

        while(true) {
            int n0 = Integer.parseInt(br.readLine());
            if(n0 == 0) break;

            int n1 = 3 * n0;
            int n2;

            if(n1 % 2 == 0) {
                n2 = n1 / 2;
                s = "even";
            }
            else {
                n2 = (n1 + 1) / 2;
                s = "odd";
            }

            int n3 = 3 * n2;
            int n4 = n3 / 9;

            sb.append(cnt + ". " + s + " " + n4 + "\n");
            cnt++;
        }
        System.out.println(sb);
    }
}