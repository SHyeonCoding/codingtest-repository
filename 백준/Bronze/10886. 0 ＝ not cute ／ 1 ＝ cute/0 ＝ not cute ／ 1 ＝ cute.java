import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;

        for (int i = 0; i < n; i++) {
            if(Integer.parseInt(br.readLine()) == 0) a++;
            else b++;
        }

        if(a > b) sb.append("Junhee is not cute!");
        else sb.append("Junhee is cute!");

        System.out.println(sb);
    }
}