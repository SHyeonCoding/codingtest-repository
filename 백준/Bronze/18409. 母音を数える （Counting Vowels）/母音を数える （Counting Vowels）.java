import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] arr = {'a', 'e', 'i', 'o', 'u'};
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(s.charAt(i) == arr[j]) cnt++;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}