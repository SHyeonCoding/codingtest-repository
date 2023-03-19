import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int bCnt = a / b;
        int cCnt = (a - b * bCnt) / c;

        while(bCnt * b + cCnt * c != a) {
            if(bCnt == 0) break;
            bCnt--;
            cCnt = (a - b * bCnt) / c;
        }

        if(bCnt * b + cCnt * c == a)sb.append(bCnt).append(" ").append(cCnt);
        else sb.append("Impossible");
        System.out.println(sb);
    }
}