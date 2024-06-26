import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        int num = 1;

        if (n % 2 == 0) {
            for (int i = n - 1; i >= 0; i--) {
                if (i % 2 == 0) {
                    for (int j = 0; j < n; j++) {
                        arr[j][i] = num++;
                    }
                } else {
                    for (int j = n - 1; j >= 0; j--) {
                        arr[j][i] = num++;
                    }
                }
            }
        } else {
            for (int i = n - 1; i >= 0; i--) {
                if (i % 2 != 0) {
                    for (int j = 0; j < n; j++) {
                        arr[j][i] = num++;
                    }
                } else {
                    for (int j = n - 1; j >= 0; j--) {
                        arr[j][i] = num++;
                    }
                }
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
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