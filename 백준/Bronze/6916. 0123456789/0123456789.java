import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        switch (n) {
            case 0:
                sb.append(
                        " * * *\n" +
                        "*     *\n" +
                        "*     *\n" +
                        "*     *\n" +
                        "\n" +
                        "*     *\n" +
                        "*     *\n" +
                        "*     *\n" +
                        " * * *");
                break;
            case 1:
                sb.append(
                        "\n" +
                        "      *\n" +
                        "      *\n" +
                        "      *\n" +
                        "\n" +
                        "      *\n" +
                        "      *\n" +
                        "      *");
                break;
            case 2:
                sb.append(
                        " * * *\n" +
                        "      *\n" +
                        "      *\n" +
                        "      *\n" +
                        " * * *\n" +
                        "*\n" +
                        "*\n" +
                        "*\n" +
                        " * * *");
                break;
            case 3:
                sb.append(
                        " * * *\n" +
                        "      *\n" +
                        "      *\n" +
                        "      *\n" +
                        " * * *\n" +
                        "      *\n" +
                        "      *\n" +
                        "      *\n" +
                        " * * *");
                break;
            case 4:
                sb.append(
                        "\n" +
                        "*     *\n" +
                        "*     *\n" +
                        "*     *\n" +
                        " * * *\n" +
                        "      *\n" +
                        "      *\n" +
                        "      *");
                break;
            case 5:
                sb.append(
                        " * * *\n" +
                        "*\n" +
                        "*\n" +
                        "*\n" +
                        " * * *\n" +
                        "      *\n" +
                        "      *\n" +
                        "      *\n" +
                        " * * *");
                break;
            case 6:
                sb.append(
                        " * * *\n" +
                        "*\n" +
                        "*\n" +
                        "*\n" +
                        " * * *\n" +
                        "*     *\n" +
                        "*     *\n" +
                        "*     *\n" +
                        " * * *");
                break;
            case 7:
                sb.append(
                        " * * *\n" +
                        "      *\n" +
                        "      *\n" +
                        "      *\n" +
                        "\n" +
                        "      *\n" +
                        "      *\n" +
                        "      *");
                break;
            case 8:
                sb.append(
                        " * * *\n" +
                        "*     *\n" +
                        "*     *\n" +
                        "*     *\n" +
                        " * * *\n" +
                        "*     *\n" +
                        "*     *\n" +
                        "*     *\n" +
                        " * * *");
                break;
            case 9:
                sb.append(
                        " * * *\n" +
                        "*     *\n" +
                        "*     *\n" +
                        "*     *\n" +
                        " * * *\n" +
                        "      *\n" +
                        "      *\n" +
                        "      *\n" +
                        " * * *");
                break;
        }

        System.out.println(sb);
    }
}