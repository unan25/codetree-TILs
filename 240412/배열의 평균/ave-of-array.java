import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[][] arr = new int[2][4];

        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 2; i++) {
            double sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
            double avg = sum / 4;
            sb.append(String.format("%.1f", avg)).append(" ");
        }
        sb.append("\n");

        double allAvg = 0;
        for (int i = 0; i < 4; i++) {
            double sum = 0;
            for (int j = 0; j < 2; j++) {
                sum += arr[j][i];
                allAvg += arr[j][i];
            }
            double avg = sum / 2;
            sb.append(String.format("%.1f", avg)).append(" ");
        }
        sb.append("\n");

        sb.append(String.format("%.1f", (allAvg / 8)));

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}