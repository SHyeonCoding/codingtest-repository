import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] n = new int[Integer.parseInt(st.nextToken())];
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MAX_VALUE;
        int result = 0;

        for(int i = 0; i < n.length - 2; i++) {
            for(int j = i + 1; j < n.length - 1; j++) {
                for(int k = j + 1; k < n.length; k++) {
                    int hap = n[i] + n[j] + n[k];
                    if(hap <= m) {
                        int sub = m - hap;
                        if(sub < max) {
                            max = sub;
                            result = hap;
                        }
                    }
                }
            }
        }

        sb.append(result);
        System.out.println(result);
    }
}