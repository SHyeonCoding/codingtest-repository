import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = {"a", "e", "i", "o", "u"};

        while (true) {
            String[] sArr = br.readLine().split("");
            if(sArr.length == 1 && sArr[0].equals("#")) break;

            int cnt = 0;
            for(int i = 0; i < sArr.length; i++) {
                for(int j = 0; j < arr.length; j++) {
                    if(sArr[i].toLowerCase().equals(arr[j])) cnt++;
                }
            }
            bw.write(cnt + "\n");
        }

        bw.flush();
        bw.close();
    }
}
