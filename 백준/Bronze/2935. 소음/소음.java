import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String a = br.readLine();
        String op = br.readLine();
        String b = br.readLine();

        if(op.equals("*")) sb.append(a + "0".repeat(b.length() - 1));
        else {
            if(a.length() > b.length()) sb.append(a.substring(0, a.length() - b.length()) + b);
            else if(b.length() > a.length()) sb.append(b.substring(0, b.length() - a.length()) + a);
            else sb.append("2" + "0".repeat(a.length() - 1));
        }

        System.out.println(sb);
    }
}