import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String m = br.readLine();
        String n = br.readLine();

        int count = 0;
        for (int i = 1; i < m.length(); i++) {
            if (n.equals(m.substring(i - 1, i + 1))) {
                count++;
            }
        }
        sb.append(count);

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}