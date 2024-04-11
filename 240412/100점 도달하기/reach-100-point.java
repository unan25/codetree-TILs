import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = n; i <= 100; i++) {
            if (i >= 90) sb.append("A").append(" ");
            else if (i >= 80) sb.append("B").append(" ");
            else if (i >= 70) sb.append("C").append(" ");
            else if (i >= 60) sb.append("D").append(" ");
            else sb.append("F").append(" ");
        }

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}