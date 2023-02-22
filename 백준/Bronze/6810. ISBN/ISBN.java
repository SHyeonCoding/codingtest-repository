import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine()) * 3;
        int num3 = Integer.parseInt(br.readLine());

        sb.append("The 1-3-sum is " + (91 + num1 + num2 + num3));
        System.out.println(sb);
    }
}