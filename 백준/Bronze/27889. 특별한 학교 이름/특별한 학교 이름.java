import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        if(s.equals("NLCS")) sb.append("North London Collegiate School");
        else if(s.equals("BHA")) sb.append("Branksome Hall Asia");
        else if(s.equals("KIS")) sb.append("Korea International School");
        else sb.append("St. Johnsbury Academy");

        System.out.println(sb);
    }
}