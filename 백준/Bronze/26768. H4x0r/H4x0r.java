import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        s = s.replace("a", "4").replace("e", "3").replace("i", "1")
                .replace("o", "0").replace("s", "5");

        sb.append(s);
        System.out.println(sb);
    }
}