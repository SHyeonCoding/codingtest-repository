import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            double num = Double.parseDouble(br.readLine());
            if(num == 0) break;
            sb.append(String.format("%.2f", 1 + num + Math.pow(num, 2) + Math.pow(num, 3) + Math.pow(num, 4))).append("\n");
        }

        System.out.println(sb);
    }
}