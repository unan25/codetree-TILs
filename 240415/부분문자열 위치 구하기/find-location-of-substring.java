import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String m = br.readLine();
        String n = br.readLine();

        sb.append(m.indexOf(n));

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}