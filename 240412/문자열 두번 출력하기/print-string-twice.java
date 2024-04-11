import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        sb.append(str).append("\n").append(str);

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}