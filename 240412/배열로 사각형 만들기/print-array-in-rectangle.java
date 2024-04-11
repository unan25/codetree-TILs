import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[][] arr = new int[5][5];

        for (int i = 0; i < 5; i++) {
            arr[i][0] = 1;
        }

        for (int i = 1; i < 5; i++) {
            arr[0][i] = 1;
        }

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
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