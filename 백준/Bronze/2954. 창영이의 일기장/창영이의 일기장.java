import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        s = s.replace("apa", "a").replace("epe", "e").replace("ipi", "i")
                .replace("opo", "o").replace("upu", "u");

        sb.append(s);
        System.out.println(sb);
    }
}