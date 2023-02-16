import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());

        if(month == 2 && day == 18) sb.append("Special");
        else if(month == 1 || month <= 2 && day < 18 ) sb.append("Before");
        else sb.append("After");

        System.out.println(sb);
    }
}