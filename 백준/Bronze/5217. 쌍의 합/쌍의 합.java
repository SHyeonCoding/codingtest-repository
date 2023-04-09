import java.io.*;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Integer> solveSumPairs(int target) {

        ArrayList<Integer> answer = new ArrayList();
        /* ------------------- INSERT CODE HERE ---------------------*/

        int n = target % 2 == 0 ? n = target / 2 : target / 2 + 1;;
        for (int i = 1; i < n; i++) {
            answer.add(i);
            answer.add(target - i);
        }
        /* -------------------- END OF INSERTION --------------------*/

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numCases = Integer.parseInt(br.readLine());

        for(int n = 0; n < numCases; n++) {
            int target = Integer.parseInt(br.readLine());

            ArrayList<Integer> answer = solveSumPairs(target);

            sb.append("Pairs for ").append(target).append(": ");

            for (int i = 0; i < answer.size(); i += 2 ) {
                if (i > 0)
                    sb.append(", ");
                sb.append(answer.get(i)).append(" ").append(answer.get(i + 1));
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
