import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int V = a / 5;
        int I = a % 5;

        System.out.println("V".repeat(V) + "I".repeat(I));
    }
}