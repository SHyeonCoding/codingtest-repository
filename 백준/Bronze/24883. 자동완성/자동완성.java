import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        if(s.equals("n") || s.equals("N")) sb.append("Naver D2");
        else sb.append("Naver Whale");

        System.out.println(sb);
    }
}