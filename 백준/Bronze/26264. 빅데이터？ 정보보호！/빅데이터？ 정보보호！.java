import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        s = s.replace("security", "1");
        s = s.replace("bigdata", "2");

        int security = 0;
        int bigdata = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '1') security++;
            else bigdata++;
        }

        if(security > bigdata) sb.append("security!");
        else if(security < bigdata) sb.append("bigdata?");
        else sb.append("bigdata? security!");

        System.out.println(sb);
    }
}