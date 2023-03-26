import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[][] arr = new String[5][];
        int maxLen = 0;

        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            arr[i] = new String[s.length()];
            if(maxLen < s.length()) maxLen = s.length();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = String.valueOf(s.charAt(j));
            }
        }

        int cnt = 0;
        while (cnt < maxLen) {
            for (int i = 0; i < 5; i++) {
                if(arr[i].length > cnt) sb.append(arr[i][cnt]);
            }
            cnt++;
        }

        System.out.println(sb);
    }
}