import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split("");

        int e = 0;
        int two = 0;

        for(String s : arr) {
            if(s.equals("e")) e++;
            else two++;
        }

        if(e > two) sb.append("e");
        else if(e < two) sb.append("2");
        else sb.append("yee");

        System.out.println(sb);
    }
}