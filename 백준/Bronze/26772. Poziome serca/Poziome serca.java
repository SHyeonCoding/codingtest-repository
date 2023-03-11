import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        sb.append(" @@@   @@@  ".repeat(n)).append("\n");
        sb.append("@   @ @   @ ".repeat(n)).append("\n");
        sb.append("@    @    @ ".repeat(n)).append("\n");
        sb.append("@         @ ".repeat(n)).append("\n");
        sb.append(" @       @  ".repeat(n)).append("\n");
        sb.append("  @     @   ".repeat(n)).append("\n");
        sb.append("   @   @    ".repeat(n)).append("\n");
        sb.append("    @ @     ".repeat(n)).append("\n");
        sb.append("     @      ".repeat(n));

        System.out.println(sb);
    }
}