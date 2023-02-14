import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());

        sb.append((" @@@   @@@ \n" + "@   @ @   @\n" + "@    @    @\n" + "@         @\n"
                + " @       @ \n" + "  @     @  \n" + "   @   @   \n" + "    @ @    \n" + "     @     \n").repeat(a));
        
        System.out.println(sb);

    }
}