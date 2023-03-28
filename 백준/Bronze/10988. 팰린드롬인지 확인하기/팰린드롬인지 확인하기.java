import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split("");
        boolean check = true;

        for (int i = 0; i < arr.length / 2; i++) {
            if(!arr[i].equals(arr[arr.length - i - 1])) check = false;
        }

        if(check) sb.append(1);
        else sb.append(0);
        System.out.println(sb);
    }
}