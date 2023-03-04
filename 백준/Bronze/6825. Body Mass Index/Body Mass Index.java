import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        double w = Double.parseDouble(br.readLine());
        double h = Double.parseDouble(br.readLine());

        double bmi = w / (h * h);

        if(bmi > 25) sb.append("Overweight");
        else if(bmi > 18.5) sb.append("Normal weight");
        else sb.append("Underweight");

        System.out.println(sb);
    }
}