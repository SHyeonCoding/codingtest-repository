import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int n3 = Integer.parseInt(st.nextToken());
            if(n1 + n2 + n3 == 0) break;

            if(n1 > n2 && n1 > n3) {
                if(n1 >= n2 + n3) {
                    sb.append("Invalid").append("\n");
                    continue;
                }
            }
            else if(n2 > n1 && n2 > n3) {
                if (n2 >= n1 + n3) {
                    sb.append("Invalid").append("\n");
                    continue;
                }
            }
            else {
                if (n3 >= n1 + n2) {
                    sb.append("Invalid").append("\n");
                    continue;
                }
            }

            if(n1 == n2 && n2 == n3) sb.append("Equilateral").append("\n");
            else if(n1 == n2 || n1 == n3 || n2 == n3) sb.append("Isosceles ").append("\n");
            else sb.append("Scalene").append("\n");
        }

        System.out.println(sb);
    }
}