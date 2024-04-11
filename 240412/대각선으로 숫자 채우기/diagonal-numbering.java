import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        int num = 1;
        for (int i = 0; i < m; i++) {
            int nowRow = 0;
            int nowCol = i;

            while (nowCol >= 0 && nowRow < n) {
                arr[nowRow][nowCol] = num;

                nowRow++;
                nowCol--;
                num++;
            }
        }

        for (int i = 1; i < n; i++) {
            int nowRow = i;
            int nowCol = m - 1;

            while (nowRow >= 0 && nowRow < n) {
                arr[nowRow][nowCol] = num;

                nowRow++;
                nowCol--;
                num++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }


        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}