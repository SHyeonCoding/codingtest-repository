import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split("");
        sb.append(arr[Integer.parseInt(br.readLine()) - 1]);
        System.out.println(sb);
    }
}