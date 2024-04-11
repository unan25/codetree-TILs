import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }
        
        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}