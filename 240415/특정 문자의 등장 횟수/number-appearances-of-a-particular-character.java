import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        int eeCount = 0;
        int ebCount = 0;
        for (int i = 1; i < str.length(); i++) {
            if ("ee".equals(str.substring(i - 1, i + 1))) eeCount++;
            if ("eb".equals(str.substring(i - 1, i + 1))) ebCount++;
        }
        sb.append(eeCount).append(" ").append(ebCount);

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}