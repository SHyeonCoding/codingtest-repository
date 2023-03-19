import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] sArr = br.readLine().split("");
        int len = sArr.length;
        int a = 0;
        int b = 0;

        for(String s : sArr) {
           if(s.equals(":")) a++;
           else if(s.equals("_")) b++;
        }

        sb.append(len + a + b * 5);
        System.out.println(sb);
    }
}